package step06.practice;

public interface Buy {
   default void order() {
      System.out.println("바이 오더");
   }

void buy();


}