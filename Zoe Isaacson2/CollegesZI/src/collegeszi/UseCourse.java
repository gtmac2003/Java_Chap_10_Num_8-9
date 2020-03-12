package collegeszi;

import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaconRM180
 */
public class UseCourse {
    
    Scanner sc = new Scanner(System.in);
    final String[] labCourses = new String[]{"BIO","CHM","CIS","PHY"};
  
    int courseNumber = 0;
    int creditHours = 0;
    
    //get department and check if labCourse
    void getInfo()
    {
        System.out.println("Welcome!! Let's get you signed up for a class.");
        System.out.println("Please enter the 3-4 letter code that corresponds with the department");
        Boolean lab = false;
        
        String department = sc.nextLine();
        
        for(String s : labCourses)
        {
            if(department.equals(s))
            {
                createLabCourse(s);
                lab = true;
                break;
            }
        }
        if(lab == false)
        {
            createCollegeCourse(department);
        }
        
    }
    
    void getInformation()
    {
       System.out.println("Please enter the course number");
       courseNumber = sc.nextInt();
       
       System.out.println("How many credit hours will you be taking?");
       creditHours = sc.nextInt();

    }
    void createLabCourse(String dep)
    {
        getInformation();
        LabCourse a = new LabCourse(dep, courseNumber, creditHours);
        
        a.display();
        sc.close();
    }
    
    void createCollegeCourse(String dep)
    {
        getInformation();
        CollegeCourse b = new CollegeCourse(dep, courseNumber, creditHours);
        
        b.display();
        sc.close();
    }
}

