public class LogicalOperators {
    public static void main(String[] args){
        int temperature = 30;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // (||) Representation of OR operator
        // If variable on left side is true JAVA doesn't evaluate to the next variable on the right side, it returns true
        // If variable on left side is false JAVA moves to evaluate the next variable in the right to hoping it is true, if true it returns true
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible);

        // NOT operator
        // Used to reverse a value
        boolean hasHighIncome2 = false;
        boolean hasGoodCredit2 = true;
        boolean hasCriminalRecord2 = false;
        boolean isEligible2 = hasHighIncome2 || hasGoodCredit2 && !hasCriminalRecord2;
        System.out.println(isEligible2);
    }
}
