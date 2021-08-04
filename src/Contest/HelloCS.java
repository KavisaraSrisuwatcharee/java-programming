package Contest;

import java.util.Scanner;

public class HelloCS {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.next();
            if(i%2 ==0){
                System.out.print(arr[i]+" ");
            }else{
                String reversed = new StringBuilder(arr[i]).reverse().toString();
                System.out.print(reversed+" ");
            }
        }




    }
}
