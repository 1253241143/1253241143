import java.util.Scanner;
public class test1{
public static void main(String[] args) {
System.out.println("Please enter your age: ");
Scanner scan =new Scanner(System.in);
int year=scan.nextInt();
for(int i=1;i<=100;i++){
if(year%4==0&&year%100!=0||year%400==0)
System.out.println("year"+year);
year++;
}
}
}
