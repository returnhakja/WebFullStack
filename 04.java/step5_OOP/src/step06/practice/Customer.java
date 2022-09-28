package step06.practice;

public class Customer implements Buy,Sell {

   @Override
   public void buy() {
      System.out.println(" 바이");
      
   }

   @Override
   public void sell() {
      System.out.println("셀");
      
   }

   @Override
   public void order() {
      // TODO Auto-generated method stub
      System.out.println(" 오더");
   }


}