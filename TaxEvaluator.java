// Class: TaxEvaluator
// Student Name : [Your Name Here]
// Student Id Number : [Your Student ID Here]
// Date : 24/09/2026
// Purpose : Computes annual tax payment based on income, numbers of children,
//           and set structural tax allowances using the EasyIn utility.

class TaxEvaluator 
{
    public static void main(String[] args) 
    {
        // 1. Constant Definitions (Fixed Rules)
        final double TAX_RATE = 0.24;          // 24% tax rate
        final double PERSONAL_ALLOWANCE = 5000.0; // €5,000 baseline allowance
        final double CHILD_ALLOWANCE_RATE = 1000.0; // €1,000 per child

        // 2. Variable Declarations
        double annualIncome;
        int numberOfChildren;
        double totalAllowances;
        double taxableIncome;
        double finalTaxDue;

        // 3. Data Collection via EasyIn
        System.out.print("Please enter your total annual income (€): ");
        annualIncome = EasyIn.getDouble();

        System.out.print("Please enter your total number of dependent children: ");
        numberOfChildren = EasyIn.getInt(); // Captures input as a whole number integer

        // 4. Processing Computations
        // Step A: Calculate allowances based on number of children
        totalAllowances = PERSONAL_ALLOWANCE + (numberOfChildren * CHILD_ALLOWANCE_RATE);

        // Step B: Determine taxable base income
        taxableIncome = annualIncome - totalAllowances;

        // Logical Safeguard Note: If allowances exceed total income, taxable income shouldn't be negative.
        if (taxableIncome < 0) 
        {
            taxableIncome = 0;
        }

        // Step C: Calculate the final 24% tax value
        finalTaxDue = taxableIncome * TAX_RATE;

        // 5. Result Displays
        System.out.println("\n--- Tax Calculation Breakdown ---");
        System.out.println("Gross Annual Income: €" + annualIncome);
        System.out.println("Total Eligible Allowances: €" + totalAllowances);
        System.out.println("Net Taxable Income Base: €" + taxableIncome);
        System.out.println("Total Income Tax Owed for Year: €" + finalTaxDue);
    }
}
