package usecourse;


class LabCourse extends CollegeCourse{
    String d;
    int c;
    int n;
    int fee;
    
    public void Display(){
        System.out.println("Welcome to "+d+" class!");
        System.out.println("Your course number is "+n+".");
        System.out.println("The class has "+c+" credit(s) and will cost you $"+fee+".");
    } 
     public void LabCourse(String d, int n, int c, int f){
        if(d.equals("CHM")|d.equals("BIO")|d.equals("CIS")|d.equals("PHY")){
           fee = f + 50;
           this.c = c;
           this.d = d;
           this.n = n;
        }
        else{
           fee = f;
           this.c = c;
           this.d = d;
           this.n = n;}
    }
}
