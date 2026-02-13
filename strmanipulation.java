import java.util.Scanner;

public class strmanipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // length()
        System.out.println("Length of first string: " + s1.length());

        //  concat()
        System.out.println("Concatenation: " + s1.concat(s2));

        //  charAt()
        System.out.println("Character at index 0 of first string: " + s1.charAt(0));

        //  getChars()
        char[] ch = new char[5];
        s1.getChars(0, 5, ch, 0);
        System.out.print("getChars() output: ");
        System.out.println(ch);

        //  compareTo()
        System.out.println("compareTo result: " + s1.compareTo(s2));

        //  equals()
        System.out.println("equals result: " + s1.equals(s2));

        //  equalsIgnoreCase()
        System.out.println("equalsIgnoreCase result: " + s1.equalsIgnoreCase(s2));

        //  contains()
        System.out.println("First string contains second? " + s1.contains(s2));

        //  indexOf()
        System.out.println("Index of first character of second string in first: " + s1.indexOf(s2));

        // toUpperCase()
        System.out.println("Uppercase: " + s1.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + s1.toLowerCase());

        //  replace()
        System.out.println("Replace 'a' with 'x': " + s1.replace('a', 'x'));

        // Type Conversions
        System.out.print("Enter integer value as string: ");
        String intStr = sc.nextLine();
        int  intValue = Integer.valueOf(intStr);
        System.out.println("Integer value: " + intValue);

        System.out.print("Enter double value as string: ");
        String doubleStr = sc.nextLine();
        Double doubleValue = Double.valueOf(doubleStr);
        System.out.println("Double value: " + doubleValue);

        sc.close();
    }
}

