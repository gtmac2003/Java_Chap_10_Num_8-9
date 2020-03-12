package collegeszi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaconRM180
 */
public class CollegeCourse {
    
    String department = "";
    int courseNumb = 0;
    double courseFee = 0;
    int creditHours = 0;
    
    final double courseRate = 120.00;
    
    
    CollegeCourse(String department, int courseNumb, int creditHours)
    {
        this.department = department;
        this.courseNumb = courseNumb;
        this.creditHours = creditHours;
        
        this.courseFee = creditHours * courseRate;
    }
    
    void display()
    {
        System.out.println("Your Course");
        System.out.println("CollegeCourse: " + this.department + this.courseNumb);
        System.out.println("Credit Hours: " + this.creditHours + "  Course Fee: $" + this.courseFee);
    }
}
