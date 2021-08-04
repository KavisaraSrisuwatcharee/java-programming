import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        double b =sc.nextDouble();
        double changeToF = (b*9/5)+32;
        if(a== changeToF){
            System.out.println("Same");
        }else if(a<changeToF){
            System.out.println("Lower");
        }else if (a>changeToF){
            System.out.println("Higher");
        }

    }
}
