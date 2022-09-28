package step06.practice;

public interface Sell {
   default void order() {
      System.out.println("셀 오더");
   }



void sell();

}