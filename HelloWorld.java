import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class HelloWorld {
   public static void main(String[] args) {
      System.out.println("Hello I am Sakshi");
      System.out.println(DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss").format(LocalDateTime.now()));
  
   }
}
