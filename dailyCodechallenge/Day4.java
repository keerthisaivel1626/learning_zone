import java.util.*;
//Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
public class Day4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array1[]=new int[10];
        int array2[]=new int[10];
        System.out.println("enter the array element ");
        for(int i=0;i<10;i++){
            array1[i]=sc.nextInt();
        }
        int size=array1.length;
        while(size>0){
        for(int j=0;j<10;j++){
          array2[j]=array1[size-1];
          size--;
        }
        
    }
    System.out.println("1st array");
    for(int i=0;i<10;i++){
        System.out.print(array1[i]);
    }
    System.out.println("\n2nd aray");
    for(int i=0;i<10;i++){
        System.out.print(array2[i]);
    }
}
}