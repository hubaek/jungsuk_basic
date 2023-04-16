package ch8;

public class Ex8_9 {
    public static void main(String[] args) throws Exception  {   // throws Exception - 모든종류의 예외 발생이 가능함
        method1();  // 1) static method1 호출 5) try-catch문이 없어서 예외처리를 못하여 프로그램 비정상 종료
    }

    static void method1() throws Exception{
        method2();  // 2) method1 메서드에서 method2 호출, 4) try-catch문이 없어 method1을 호출한 main메서드로 예외 넘김
    }

    static void method2() throws Exception{
        throw new Exception();  // 3) 예외강제 발생, 예외 throw,  try-catch문 없어서 method2를 호출한 method1로 예외 넘겨줌
    }
}
