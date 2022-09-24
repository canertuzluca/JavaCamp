public class Main {
    public static void main(String[] args) {

    CustomerManager customerManager =new CustomerManager();  //we have produced a customerManager kind of object
        //Reference type

        CustomerManager customerManager2 = new CustomerManager();

        customerManager=customerManager2;


        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        //value
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);


        //reference                                                         arrays are reference types
        //int [] sayilar1 = new int[] {1,2,3}; = int [] sayilar1 = {1,2,3}
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);


        }

    }



// customerManager stack 101
//customer manager stack 102
//*****line9*****
//customerManager,customerManager2 stack 102..