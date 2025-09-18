import java.util.Scanner;

public class Rot13{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text");
        String input = scanner.nextLine();

        System.out.println("Choose an option:/n Encrypt /n Decrypt");
        String option = scanner.nextLine().toLowerCase();

        if(option.equalsIgnoreCase("Encrypt")){
            System.out.println("Encrypted text: /n"+xifraRot13(input));

        } else if(option.equalsIgnoreCase("Decrypt")){
            System.out.println("Decrypted text: /n"+DesxifraRot13(input));
        }
        scanner.close();
    }
    public static String xifraRot13(String input) {
        String res = "";
        String alphabet = "abcdefghijklmnñopqrstuvwxyz";
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                res += (char) ((c - 'a' + 13) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                res += (char) ((c - 'A' + 13) % 26 + 'A');
            } else {
                res += c;
            }
        }
        return res;
    }
    public static String DesxifraRot13(String input) {
        String res = "";
        String alphabet = "abcdefghijklmnñopqrstuvwxyz";
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                --
            } else if (c >= 'A' && c <= 'Z') {
                --
            } else {
                res += c;
            }
        }
        return res;
    }
}