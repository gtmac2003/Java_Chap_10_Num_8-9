package usecourse;

import java.util.Scanner;


public class UseCourse {

   
    public static void main(String[] args) {
       //variables
       String className;
       int courseNum;
       int credits;
       int fee;
               
        //instantiate the class
        CollegeCourse course1 = new CollegeCourse();
        LabCourse lcourse1 =  new LabCourse();
        Scanner sc = new Scanner(System.in);
        
        //get class info
        System.out.println("Please enter the class name");
        className = sc.nextLine();
        
        System.out.println("Please enter the course number");
        courseNum = sc.nextInt();
        
        System.out.println("Please enter the credits for the class");
        credits = sc.nextInt();
        
        //pass through the information
        course1.collegecourse(className, courseNum, credits);
        lcourse1.LabCourse(course1.getDept(), course1.getCourseNum(), course1.getCredits(), course1.getFee());
        lcourse1.Display();   
        
    }
    
}
