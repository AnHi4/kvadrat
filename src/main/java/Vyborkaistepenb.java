import java.util.Scanner;

public class Vyborkaistepenb {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int j = scanner.nextInt();
            String n = Integer.toString(j);
            System.out.println(n);
            char[] charArray = n.toCharArray();
            for (char value : charArray) {
                int c = Character.getNumericValue(value);
                System.out.print(c * c);
            }
        }
    }
//for (int i = 0; i < charArray.length; i++) {
//        int c = Character.getNumericValue(charArray[i]);
//        System.out.print(c * c);

