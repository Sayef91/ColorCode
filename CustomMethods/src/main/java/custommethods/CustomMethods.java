package custommethods;

public class CustomMethods {

    public static <T> void printlnGreen(T args) {
        System.out.println("\033[32m" + args);
    }

    public static <T> void printlnDarkGreen(T args) {
        System.out.println("\033[32;1;2m" + args + "\033[0m");

    }

    public static <T> void printlnYellow(T args) {
        System.out.println("\033[33m" + args);
    }

    public static <T> void printlnBlue(T args) {
        System.out.println("\033[34m" + args + "\033[0m");
    }
    
      public static <T> void printGreen(T args) {
        System.out.print("\033[32m" + args);
    }

    public static <T> void printDarkGreen(T args) {
        System.out.print("\033[32;1;2m" + args + "\033[0m");

    }

    public static <T> void printYellow(T args) {
        System.out.print("\033[33m" + args);
    }

    public static <T> void printBlue(T args) {
        System.out.print("\033[34m" + args + "\033[0m");
    }
    
    

}
