class Book<T>{
   T page;
   Book(T page){
      this.page = page;
   }
   public void display() {
      System.out.println("Value of page: "+this.page);
   }
}
public class GenericsExample {
   public static void main(String args[]) {
      Book<Float> std = new Book<Float>(366);
      std.display();
   }
}