import java.util.*;
/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/
public class DayThree{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int array[]=new int[20];
       System.out.println("enter the array element");

       for(int i=0;i<20;i++){
           array[i]=sc.nextInt();

       } 
       int neg=0;
       int poeven=0;
       int zero=0;
       int odd=0;
       for(int i=0;i<20;i++){
           if(array[i]<0){
               neg++;
               System.out.println("negative element are  ->"+ array[i] );
           }else {
              if(array[i]%2==0&&array[i]!=0){
                  poeven++;
                  System.out.println("positive even number are ->"+ array[i]);
              }else if(array[i]==0){
                  zero++;
                 // System.out.println("no of zero in the array ->"+ zero);
              }else if(array[i]%2==1){
                  odd++;
                  System.out.println("odd number are ->" + array[i] );
              }
           }
       }
       System.out.println("no of zero in the array ->"+ zero+" \n"+"no of negative"+neg+"\nno of odd"+odd+"\nno of even"+poeven);
    }
}