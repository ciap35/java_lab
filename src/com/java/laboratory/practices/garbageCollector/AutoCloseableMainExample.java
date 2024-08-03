package com.java.laboratory.practices.garbageCollector;

public class AutoCloseableMainExample {
    public static void main(String[] args) {
        ExecuteWithoutCallClose();
        ExecuteAndCallClose();
        ExecuteMoreObjectsAndCallClose();
    }

    public static void ExecuteWithoutCallClose(){
        System.out.println();
        System.out.println("AutoCloseableMainExample.ExecuteWithoutCallClose");
        System.out.println("================================================");
        //In this case we must clean the references and call the GC.
        AutoCloseableObject1Example autoCloseableExample = new AutoCloseableObject1Example();
        autoCloseableExample.execute();
        autoCloseableExample = null;
        System.gc(); // Suggests that the JVM runs the garbage collector, which may call finalize()
    }

    public static void ExecuteAndCallClose(){
        System.out.println();
        System.out.println("AutoCloseableMainExample.ExecuteAndCallClose");
        System.out.println("================================================");
        //USed this method will guarantee call the Close method to clean up the references

        try(AutoCloseableObject1Example autoCloseableExample = new AutoCloseableObject1Example()){
            autoCloseableExample.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void ExecuteMoreObjectsAndCallClose(){
        System.out.println();
        System.out.println("AutoCloseableMainExample.ExecuteMoreObjectsAndCallClose");
        System.out.println("================================================");
        //USed this method will guarantee call the Close method to clean up the references

        try(
                        AutoCloseableObject1Example autoCloseableExample1 = new AutoCloseableObject1Example();
                        AutoCloseableObject2Example autoCloseableExample2 = new AutoCloseableObject2Example()
        ){
            autoCloseableExample1.execute();
            autoCloseableExample2.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
