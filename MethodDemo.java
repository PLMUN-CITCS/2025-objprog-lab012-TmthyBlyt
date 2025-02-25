public class MethodDemo {

    public static void greet() {
        System.out.println("hello from the greet method");
    }
    public static void printMessage(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        greet();
        printMessage("This is my message!");
    }
} 
