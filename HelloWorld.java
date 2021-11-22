/**
* The Hello World! program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Ahmad
* @version 1.0
* @since   2021-11-19
*/

final class HelloWorld {
    /**
    * Prevents instantiation.
    *
    * @throws IllegalStateException
    *
    */

    private HelloWorld() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * This method prints out "Hello, World!".
    *
    * @param args none will be used
    */

    public static void main(final String[] args) {
        System.out.println("Hello, World!");
        System.out.println("\nDone.");
    }
}

