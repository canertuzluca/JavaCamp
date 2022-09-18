public class main {
    public static void main (String[] args){

        /*perfect number, a positive integer that is equal to the sum of its proper divisors.
       The smallest perfect number is 6, which is the sum of 1, 2, and 3.
       Other perfect numbers are 28, 496, and 8,128.
         */
        int number = 28;
        int total = 0;

        for (int i = 1; i<number;i++){
            if(number%i==0){
                total = total +i;

            }
        }
        if (total==number){
            System.out.println("This is perfect number");
        }else{
            System.out.println("This is not perfect number");
        }


    }
}
