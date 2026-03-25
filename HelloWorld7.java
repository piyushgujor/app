public class HelloApp {
    public static void main(String[] args) {

        // No arguments case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma and space
            String result = String.join(", ", args);

            // Print final greeting
            System.out.println("Hello, " + result + "!");
        }
    }
}
