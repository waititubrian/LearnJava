public class LogicalOperators {
    public static void main(String[] args){
        int temperature = 25;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // (||) Representation of OR operator
        // If variable on left side is true JAVA doesn't evaluate to the next variable on the right side, it returns true
        // If variable on left side is false JAVA moves to evaluate the next variable in the right to hoping it is true, if true it returns true
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean isEligible = hasHighIncome || hasGoodCredit;
//        System.out.println(isEligible);

        // NOT operator
        // Used to reverse a value
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;
        boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
