
package javaapplication35;
import java.util.Scanner;
//Caleb Wilson

public class CollegeCourse {
    
    public static String dept;
    static int courseNum;
    static int credits;
    static double fee;
    static final double cost=360.00;
    
    
    static Scanner input=new Scanner(System.in);
    
    public static void main (String[] args){
    
        new UseCourse();
        
    }
    
    public CollegeCourse (String dept, int courseNum, int credits){
    
        this.dept = dept;
        this.courseNum= courseNum;
        this.credits= credits;
        
        fee= cost * credits;
    }
    
    public void display(){
    
    System.out.println(dept+ courseNum+ " "+ "is "+ credits+" credits, with a cost of $"+ fee + ".");
    }
}

