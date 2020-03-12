package usecourse;


class CollegeCourse {
    String dept;
    int courseNum;
    int credits;
    int fee;
    
    public void collegecourse(String d, int cN, int c){
        dept = d;
        courseNum = cN;
        credits = c;
        calcFee(c);
    }
    
    public void calcFee(int f){
       f*=120;
       setFee(f);
    }
    

    public int getFee() {
        return fee;
    }

    public String getDept() {
        return dept;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public int getCredits() {
        return credits;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
  

}


