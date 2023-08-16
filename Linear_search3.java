public class Linear_search3 {
    public static void main(String[] args) {
                String inputString = "Hello, World! how do you doz";
                char searchChar = 'z';

                boolean found = false;

                for (int i = 0; i < inputString.length(); i++) {
                    if (inputString.charAt(i) == searchChar) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("The character '" + searchChar + "' is found in the string.");
                } else {
                    System.out.println("The character '" + searchChar + "' is not found in the string.");
                }
    }
}
