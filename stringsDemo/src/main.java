public class main {
    public static void main (String[] args){
    String message = "The wheather is nice today";
        System.out.println(message);

        System.out.println("Number of elements : "+message.length());
        System.out.println("5th element"+message.charAt(4));
        System.out.println(message.concat("So happy!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[5];
        message.getChars(0,5,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("av"));
        System.out.println(message.lastIndexOf("a"));

        System.out.println("************************************************");

        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(message.substring(2,5));

        for(String word : message.split(" ")){
            System.out.println(word);
        }



    }
}
