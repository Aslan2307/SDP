public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();

        Singleton anotherSingleton = Singleton.getInstance();

        if (singleton == anotherSingleton) {
            System.out.println("Both instances are the same. Singleton pattern is working.");
        } else {
            System.out.println("Singleton pattern is not working.");
        }
    }
}