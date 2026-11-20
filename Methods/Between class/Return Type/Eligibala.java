 class Customer {

    public static double calculateAnnualIncome(double monthlySalary) {

        double annualIncome = monthlySalary * 12;

        return annualIncome;

    }
}
class LoanService {

    public static boolean checkEligibility(double annualIncome, int creditScore) {

        if (annualIncome >= 500000 && creditScore >= 700) {

            return true;

        } else {

            return false;

        }
    }

    public static double calculateLoanAmount(double annualIncome) {

        double loanAmount = annualIncome * 5;

        return loanAmount;

    }
}
class Eligibala {

    public static void main(String[] args) {

        double annualIncome = Customer.calculateAnnualIncome(50000);

        int creditScore = 750;

        boolean eligibility = LoanService.checkEligibility(annualIncome, creditScore);

        double loanAmount = LoanService.calculateLoanAmount(annualIncome);

        System.out.println("Annual Income: " + annualIncome);

        System.out.println("Credit Score: " + creditScore);

        System.out.println("Eligibility: " + eligibility);

        System.out.println("Loan Amount: " + loanAmount);

    }
}