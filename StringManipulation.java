import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Length: " + s.length());          
        System.out.println("Uppercase: " + s.toUpperCase());  
        System.out.println("Lowercase: " + s.toLowerCase()); 
        System.out.println("First character: " + s.charAt(0));
        System.out.println("Substring: " + s.substring(1));  
        System.out.println("Replace a with @: " + s.replace('a','@'));
        System.out.println("Contains 'java': " + s.contains("java")); 
        System.out.println("Trimmed string: " + s.trim());    
        System.out.println("Starts with H: " + s.startsWith("H")); 
        System.out.println("Ends with o: " + s.endsWith("o"));

        sc.close();
    }
}

