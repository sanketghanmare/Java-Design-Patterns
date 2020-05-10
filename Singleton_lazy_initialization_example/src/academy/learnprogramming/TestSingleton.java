package academy.learnprogramming;

public class TestSingleton {
    public static void main(String [] args) {

        Singleton s = Singleton.getInstance();
        // set the data value
        s.setData(55);

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        // Get another reference to the Singleton.
        // Is it the same object?

        s = Singleton.getInstance();
        System.out.println("\nSecond reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        s = Singleton.getInstance();
        System.out.println("\nThird reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
