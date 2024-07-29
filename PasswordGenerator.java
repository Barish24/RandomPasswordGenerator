    import java.util.Random;
    import java.util.Scanner;
    
    public class PasswordGenerator {
    
        // Method to generate a random password
        public static String generatePassword(int length, boolean includeUppercase, boolean includeNumbers, boolean includeSymbols) {
            String lower = "abcdefghijklmnopqrstuvwxyz";
            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numbers = "0123456789";
            String symbols = "!@#$%^&*()-_=+[]{}|;:',.<>?/";
            
            // Build the character set based on the criteria
            String charSet = lower;
            if (includeUppercase) {
                charSet += upper;
            }
            if (includeNumbers) {
                charSet += numbers;
            }
            if (includeSymbols) {
                charSet += symbols;
            }
            
            Random random = new Random();
            StringBuilder password = new StringBuilder();
            
            // Generate the password
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(charSet.length());
                password.append(charSet.charAt(index));
            }
            
            return password.toString();
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Get user input for password criteria
            System.out.println("Enter the length of the password:");
            int length = scanner.nextInt();
            
            System.out.println("Include uppercase letters? (true/false):");
            boolean includeUppercase = scanner.nextBoolean();
            
            System.out.println("Include numbers? (true/false):");
            boolean includeNumbers = scanner.nextBoolean();
            
            System.out.println("Include symbols? (true/false):");
            boolean includeSymbols = scanner.nextBoolean();
            
            // Generate and display the password
            String password = generatePassword(length, includeUppercase, includeNumbers, includeSymbols);
            System.out.println("Generated password: " + password);
            
            scanner.close();
        }
    }   

