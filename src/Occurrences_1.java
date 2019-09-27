import java.util.Scanner;

public class Occurrences_1 {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter input string:");
        String str=sc.nextLine();
        System.out.print("Enter a character:");
        char ch=sc.next().charAt(0);
        String s_ch=String.valueOf(ch);
        String rem=str.replace(s_ch,"");
        System.out.print("Number of occurrences of '"+ch+"' in given string:"+(str.length()-rem.length()));
    }
}
