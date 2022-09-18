public class main {

    public static void main (String[] args){


        int first = 27;
        int second = 25;
        int third =26;
        int greatestNumber = first;

        if (greatestNumber<second){
            greatestNumber = second;
        }
        if (greatestNumber<third){
            greatestNumber = third;
        }

             System.out.println("The greatest number : "+ greatestNumber);


    }
}

