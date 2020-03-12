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
public class LabCourse extends CollegeCourse { 

    public LabCourse(String department, int courseNumb, int creditHours) {
        super(department, courseNumb, creditHours);
        
        this.courseFee = (creditHours * courseRate) + 50;
    }

    @Override
    void display()
    {
        System.out.println("Your Course");
        System.out.println("LabCourse: " + this.department + this.courseNumb);
        System.out.println("Credit Hours: " + this.creditHours + "  Course Fee: $" + this.courseFee);
    }
}
