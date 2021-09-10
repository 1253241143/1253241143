import java.util.Scanner;
public class test3{
    public static void main(String[] args){
        int c,m=0;
        System.out.println("Please enter two numbers: ");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if(a<b)
        m=a;
        a=b;
        b=m;
        do{
            c=a%b;
            a=b;
            b=c;
        }while(c!=0);
        System.out.println("The greatest common factor is: "+a);
    }
}

