package ch8;

public class Ex8_12 {
    public static void main(String[] args) {
        try {
            method1();                          // 1) method1 호출 5) method1에서 예외가 넘어옴
        } catch (Exception e) {                 //                6) method1의 예외를 처리함.
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
        }
    }
                                                // 예외 되던지기(exception re-throwing)
    static void method1() throws Exception {    // 예외가 발생할 메서드에서는 try-catch 문 + 선언부 throws 지정해야함.
        try {
            throw new Exception();              // 2) 강제 예외발생.
        } catch (Exception e) {
            System.out.println("method1 메서드에서 예외가 처리되었습니다.");   // 3) method1에서 발생한 예외 처리
            throw e;                            // 4) 다시 예외를 발생시킨다.
        }
    }
}
