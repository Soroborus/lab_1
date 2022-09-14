import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int n;
    int s=0;
    Scanner c =new Scanner(System.in);
    System.out.println("Input quantity of array's numbers");
    n=c.nextInt();
    int array[] =new int[n];//создание массива
    System.out.println("Input array:");

    //3
    for (int i=0;i<n;i++){
        array[i]=c.nextInt();
        s+=array[i];
    }
    System.out.println("Sum = "+s);
    System.out.println("average = "+(float)s/n);

    //4
    int min=array[0], max=array[0];
    s=array[0];
    int i=1;
    while (i<n){
        s+=array[i];
        if (min>array[i]){
            min=array[i];
        }
        if(max<array[i]){
            max=array[i];
        }
        i++;
    }
    System.out.println("min = "+min+" max = "+max);
    System.out.println("Sum = "+s);
    System.out.println("average = "+(float)s/n);

    //5
    System.out.println(args.length);
    for (String str:args){
        System.out.println(str);
    }



    }
}