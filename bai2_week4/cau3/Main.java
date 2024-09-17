// Step 1: Create an interface
interface MyInterface {
    // Define some methods
    int add(int a, int b);
    int subtract(int a, int b);

    // Step 2: Create a nested class inside the interface
    class NestedClass {
        // Static method in nested class
        public static void displayResults(MyInterface instance) {
            // Call the interface methods and display the results
            int result1 = instance.add(10, 5);
            int result2 = instance.subtract(10, 5);
            
            System.out.println("Addition result: " + result1);
            System.out.println("Subtraction result: " + result2);
        }
    }
}

// Step 3: Implement the interface
class MyImplementation implements MyInterface {
    // Provide implementation for the methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 4: Call the static method and pass an instance of the implementation
        MyInterface myImpl = new MyImplementation();
        MyInterface.NestedClass.displayResults(myImpl);
    }
}
