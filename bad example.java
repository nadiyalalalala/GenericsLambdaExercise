class Book{
   Integer page;
   Book(Integer page){
      this.page = page;
   }
   public void display() {
      System.out.println("Value of page: "+this.page);
   }
}
public class Generics {
   public static void main(String args[]) {
      Book std = new Book(366));
      std.display();
   }
}