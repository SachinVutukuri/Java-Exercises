import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortString_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a paragraph of text:");
        String str=sc.nextLine();
        String[] s=str.split("\\W+");
        TreeMap<String,Integer> tmap=new TreeMap<String,Integer>();
        for(String temp:s) {
            if(!tmap.containsKey(temp))
                tmap.put(temp,1);
            else
                tmap.put(temp,tmap.get(temp)+1);
        }
        for(Map.Entry<String,Integer> entry:tmap.entrySet())
            for(int i=entry.getValue();i>0;i--)
                System.out.print(entry.getKey()+" ");
//        System.out.print(ts);
    }
}
