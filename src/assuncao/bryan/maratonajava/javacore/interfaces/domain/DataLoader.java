package assuncao.bryan.maratonajava.javacore.interfaces.domain;

public interface DataLoader {
    void load();


   default void checkPermission(){
       System.out.println("Checking permissions");
   };

   int MAX_SIZE = 10;

   static void print(){
       System.out.println("Printing DataLoader...");
   }

}
