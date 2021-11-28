/*Write a program to take care of NumberFormatException, if the user enters values other than integer, 
for calculating the average marks of 2 students. The name of the students and the marks in 3 subject 
are taken from the user while excuting the program. 
In the same program write your own Exception classes to take care of Negative values and values out of 
range(i.e. other than in the range of 0-100).*/
import java.util.*;
class InvalidNumberExceptions extends Exception{
    public InvalidNumberExceptions(String s){
        super(s);
    }
}
class abc{
    public static void validateMarks(int a) throws InvalidNumberExceptions {
        if (a<0){
            throw new InvalidNumberExceptions("Marks never be negative. ");
        } else if (a > 100) {
            throw new InvalidNumberExceptions("Marks never be greater than zero. ");
        }
    }
}
public class k1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name of First student :- ");
        String n1=sc.next();
        int s1=0,s2=0;
        int arr1[]=new int[3];
        for(int i=0;i<3;i++){
            try {
                System.out.println("Numbers "+(i+1));
                arr1[i] = Integer.parseInt(sc.next());
                abc.validateMarks(arr1[i]);
                s1+=arr1[i];

            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
            catch(InvalidNumberExceptions e){
                System.out.println((e.getMessage()));
            }

        }
        System.out.println("Average of "+n1+" is :- "+s1/3);
        System.out.println("Name of Second student :- ");
        String n2=sc.next();
        int arr2[]=new int[3];
        for(int i=0;i<3;i++){
            try {
                System.out.println("Numbers "+(i+1));
                arr2[i] = Integer.parseInt(sc.next());
                abc.validateMarks(arr1[i]);
                s2+=arr2[i];

            }
            catch(NumberFormatException e){
                System.out.println(e);

            }
            catch(InvalidNumberExceptions e){
                System.out.println((e.getMessage()));
            }

        }
        System.out.println("Average of "+n2+" is :- "+s2/3);

    }
}
