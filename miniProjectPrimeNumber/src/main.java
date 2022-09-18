public class main {
    public static void main (String[] args){

        //Bug
        int number =17;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;

        if(number==1){
            System.out.println("This number is not prime number");
            return;
        }
        if(number<1){
            System.out.println("Invalid number");
        }
        for (int i=2; i<number; i++){
            if (number%i==0){
                isPrime = false;
            }

        }
        if (isPrime){
            System.out.println("This number is prime number");
        }else {
            System.out.println("This number is not prime number");
        }




    }
}
