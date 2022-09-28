package step02.innerclass;


class OuterClass{
   private int number = 10;
   private static int staticNumber = 20;
   private InClass inClass;
   
   public OuterClass() {
      inClass = new InClass();
   }
   
   class InClass{
      int inNumber = 100;
//      static int staticInNumber = 200; outerclass 소속이라 static을 사용할 수 없음
      
      
      void inPrint() {
         System.out.println("외부 클래스, 인스턴스 변수 =" + number); //인스턴스변수는 객체
         System.out.println("외부 클래스, static 변수 ="+ staticNumber);
         System.out.println("내부 클래스, 인스턴스 변수 =" + inNumber);
      }
   }
   static class staticInClass{
      int inNumber = 100;
      static int staticInNumber = 200;
   }
         
}


public class InnerClassTest {

   public static void main(String[] args) {
      OuterClass outerClass = new OuterClass();
      
      OuterClass.InClass inClass = outerClass.new InClass();
      
      OuterClass.staticInClass staticInClass = new OuterClass.staticInClass();
      
      
      System.out.println(inClass);
   }

}