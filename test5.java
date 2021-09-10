import java.util.Scanner;
public class test5{
    public static void main(String[] args){
        int i,sum=0,average;
        int a[]={2,4,9,6,1,7};
        for(i=0;i<a.length;i++){
            sum=sum+a[i];}
        average=sum/6;
        for(i=0;i<a.length;i++){
        if(a[i]>average)
        System.out.println(a[i]);}
    }
}

        
        