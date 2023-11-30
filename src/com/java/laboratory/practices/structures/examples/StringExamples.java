package com.java.laboratory.practices.structures.examples;

public class StringExamples {

    public static void main(String[] args) {
        //comparison();
        //concatenation();
        //concatenationWithDifferntTypes();
        //inmutation();
        //performance_concat();
        //performance_concatVsStringBuilder();
        StringMethods();
    }

    public static void concatenation(){
        String message1 = "Lorem";
        String message2 = "Ipsum";
        String result = message1+message2;

        System.out.println(result);
    }

    public static void concatenationWithDifferntTypes(){
        String message1 = "Lorem";
        String message2 = "Ipsum";
        int value1 = 10;
        int value2 = 20;
        String result = message1+message2+value1+value2;

        System.out.println(message1.concat(" ").concat(message2));

        System.out.println(result);

        result = message1+message2+(value1+value2);

        System.out.println(result);
    }

    public static void comparison() {
        String message = "Hello World";
        String message2 = new String("Hello World");
        boolean comparison = message == message2; //by its reference; So the condition will return FALSE.
        System.out.println(comparison);

        comparison= message.equals(message2); //by its value and returns TRUE;
        System.out.println(comparison);

        String message3 = new String("HELLO WORLD");
        comparison = message2.equalsIgnoreCase(message3); //Compare both ignoring case
        System.out.println(comparison);

    }

    public static void inmutation(){
        String message1 = "Lorem";
        String message2 = "Ipsum";


        message1.concat(" ").concat(message2); //Don't modify value of message1.
        System.out.println(message1);

        String result = message1.transform(x-> {
            return message1.concat(" ").concat(message2);
        });
        System.out.println(result);
        System.out.println(message1);

    }

    //Performance overview
    public static void performance_concat(){
        String a = "a";
        String b = "b";
        String c = a;
        long start = System.currentTimeMillis();
        for (int i=0;i<500;i++){
                //c=c.concat(a).concat(b).concat("\n"); //2ms
            c+= a + b + "\n"; //12ms it takes 10ms more
        }
        long end = System.currentTimeMillis();
        long result = end - start;

        System.out.println("c = " +c);
        System.out.println(result);
    }
    public static void performance_concatVsStringBuilder(){
        String a = "a";//it's inmutable.
        String b = "b"; //it's inmutable.
        StringBuilder sb = new StringBuilder(a); //It's mutable.


        long start = System.currentTimeMillis();
        for (int i=0;i<500;i++){
            //c=c.concat(a).concat(b).concat("\n"); //2ms
            //c+= a + b + "\n"; //12ms it takes 10ms more
            sb.append(a).append(b).append("\n");
        }
        long end = System.currentTimeMillis();
        long result = end - start;

        System.out.println("sb = " +sb);
        System.out.println(result);
    }

    public static void StringMethods(){
        String message = "Hello world";
        System.out.println("original message = " + message);
        System.out.println("message.length(): "+message.length());
        System.out.println("message.substring(0,1): "+message.substring(0,1));
        System.out.println("message.substring(0,2): "+message.substring(0,2));
        System.out.println("message.charAt(0): "+message.charAt(0));
        System.out.println("message.toUpperCase(): "+message.toUpperCase());
        System.out.println("message.toLowerCase(): "+message.toLowerCase());
        System.out.println("message.getBytes(): "+message.getBytes());
        System.out.println("message.contains(\"e\"): "+message.contains("e"));
        System.out.println("message.contains(\"E\"): "+message.contains("E")); //Is case sensitive
        System.out.println("message.compareTo(\"Hello world\"): "+message.compareTo("Hello world"));
        System.out.println("message.compareTo(\"H\"): "+message.compareTo("H"));
        System.out.println("message.compareTo(\"He\"): "+message.compareTo("He"));
        System.out.println("message.compareTo(\"Hel\"): "+message.compareTo("Hel"));
        System.out.println("message.compareTo(\"Hello worl\"): "+message.compareTo("Hello worl"));
        System.out.println("message.compareTo(\"Hello world\"): "+message.compareTo("Hello world"));
        System.out.println("message.startsWith(\"Hello\"): "+message.startsWith("Hello"));
        System.out.println("message.startsWith(\"HELLO\"): "+message.startsWith("HELLO")); //Is case sensitive
        System.out.println("message.endsWith(\"world\"): "+message.endsWith("world"));
        System.out.println("message.endsWith(\"WORLD\"): "+message.endsWith("WORLD")); //Is case sensitive
    }
}
