package checkstyle;

public class HelloWorld {
  private static final int NOOFTIMES = 100;

  public static String printHello() {
    return "hello";
  }

  public static void helloPrinter() {
    for (int i = 0; i < NOOFTIMES; i++) {
      System.out.println((i + 1) + " - " + printHello());
    }
  }

  public static void main(String[] args) {
    helloPrinter();
  }
}
