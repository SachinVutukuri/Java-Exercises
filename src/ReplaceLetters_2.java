import java.util.Scanner;

public class ReplaceLetters_2 {
    public static void main(String[] args) {
        System.out.print("Enter input string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.replace('d','f');
        str=str.replace('l','t');
        System.out.print("New String:"+str);
    }
}
