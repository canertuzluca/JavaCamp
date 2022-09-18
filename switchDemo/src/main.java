public class main {
    public static void main (String[] args){


        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Perfect!");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Not Bad");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("You Entered An Invalid Grade");

        }





    }
}
