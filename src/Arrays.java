public class Arrays {
    // Used to store multiple values in one variable
    public static void main(String[] args){
        int num [] = {3,7,2,4};
        num[1] = 6;

        for(int i=0; i<4; i++ ){
            System.out.println(num[i]);
        }

        int nums [][] = new int[3][4];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                nums [i][j] = (int)(Math.random()*10);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        // Enhanced loop
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        //Jagged array - Not sure the number of colums we have
        int numss [][] = new int [4][];
        numss[0] = new int[4];
        numss[1] = new int[8];
        numss[2] = new int[3];
        numss[3] = new int[9];
    }
}
