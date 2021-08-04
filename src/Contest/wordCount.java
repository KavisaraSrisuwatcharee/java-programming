package Contest;

import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine().toLowerCase();
        String name1=sc.nextLine().toLowerCase();
        int num =0;

        for(int i=0; i<name.length();i++) {

                if (i+name1.length()<=name.length() && name1.equals(name.substring(i, i + name1.length()))) {
                    num += 1;
                    i += name1.length() - 1;
                }

        }
        System.out.println(num);

    }
}
