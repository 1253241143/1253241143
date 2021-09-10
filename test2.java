import java.util.Scanner;
public class test2{
public static void main(String[] args){
int a=0,m=1,i=1,b=0;
System.out.println("Please enter nmber: ");
Scanner scanner=new Scanner(System.in);
int n=scanner.nextInt();
if(n==0){
System.out.println("0");}
else{
System.out.println("b=1");
while(i<=n){
i++;
b=m+a;
a=m;
m=b;
System.out.println("b="+b);
}
}
}
}