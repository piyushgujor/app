public class HelloApp {
    public static void main(String[] args) {

        // No arguments case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "";

            // Enhanced for loop
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing ", " using substring
            result = result.substring(0, result.length() - 2);

            // Final output
            System.out.println("Hello, " + result + "!");
        }
    }
}
