public class main {
    public static void main (String[] args){

        int [] numbers = new int[]{1,2,5,7,9,0};
        int numberToCall = 5;
        boolean IsThere=false;

        for (int number : numbers){
            if (number==numberToCall){
                IsThere = true;
                break;
            }
        }
        if (IsThere){
            System.out.println("Number available");
        }else{
            System.out.println("Number not available");
        }




    }
}
