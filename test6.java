public class test6{
    public static void main(String[] args){
    int sum=0,average=0,t=0;
    int a[]=new int[20];
    for(int i=0;i<a.length;i++){
        int num=(int)(Math.random()*(459-77+1)+18);
        a[i]=num;
        System.out.println(a[i]);}
    for(int j=1;j<20;j++){
        for(int i=0;i<20-j;i++){
            t=a[i];
            a[i]=a[i+1];
            a[i+1]=t;
        }
    }
    System.out.println("The largest number is: "+a[19]);
    System.out.println("The smallest number is:  "+a[0]);
    for(int i=0;i<20;i++){
        sum=sum+a[i];
        average=sum/20;}
    System.out.println("The average is: "+average);
    System.out.println("The sum is: "+sum);
    }
}