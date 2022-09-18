public class main {


    public static void main (String[] args){


        String student1 = "Dora";
        String student2 = "Bill";
        String student3 = "James";
        String student4 = "Micheal";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("***************************");

        String[] students = new String[4];
        students[0] = "Dora";
        students[1] = "Bill";
        students[2] = "James";
        students[3] = "Micheal";
        //students[4] = "Kobe";

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        /* Will learn later
        for ( String student : students){
            System.out.println(student);
         */

    }



}
