
import java.util.Scanner;

public class encrypt_decrypt {
    public static void main(String[] args) {
        char str;
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

    }

}
