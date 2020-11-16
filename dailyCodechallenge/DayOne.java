//Take 10 integer inputs from user and store them in an array and print them on screen.
import java.util.*;
public  class DayOne {
    public static void main(String[] args) {
        System.out.println("day one");
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the array size");
       int size=sc.nextInt();
       int array[]=new int[size];
       System.out.println("enter the array element");
       for(int i=0;i<size;i++)
       {
           array[i]=sc.nextInt();
       }
       System.out.println("Display all the element");
       for(int i=0;i<size;i++)
       {
           System.out.print(array[i]+"->");
       }
       System.out.print("end."+"\n");
    }
}
/*day one
enter the array size
10
5
1
3
5
6
78
2
4
23
123
Display all the element
5->1->3->5->6->78->2->4->23->123->
PS D:\2102020\vsc_js_project\dailyCodechallenge> */