import java.util.*;
//Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
public  class DayTwo {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         List<Integer> ls=new ArrayList<Integer>();
         List<Integer> ls2=new ArrayList<Integer>();
         System.out.println("array1");
         for(int i=0;i<10;i++){
             int a=sc.nextInt();
             ls.add(a);
         }
         Collections.sort(ls);
         System.out.println("array2");
         for(int j=0;j<10;j++){
            int b=sc.nextInt();
            ls2.add(b);
        }
        Collections.sort(ls2);
        if(ls.equals(ls2)){
            System.out.println("array element is equal");
        }else{
            System.out.println("array element is not equal");
        }
    }
}
/*PS D:\2102020\vsc_js_project\dailyCodechallenge> javac DayTwo.java
2
5
1
7

4
2
1
5
3
3
array2
0
24
34
56
2
23
23
23
23
23
array element is not equal
PS D:\2102020\vsc_js_project\dailyCodechallenge> javac DayTwo.java
PS D:\2102020\vsc_js_project\dailyCodechallenge> java DayTwo      
array1
3
2
1
4
5
6
7
8
9
0
array2
1
2
3
4
7
6
5
8
9
0
array element is equal*/