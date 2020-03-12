package demorocks;


class Rock {
    
    String desc;
    int catNum;
    double weight;
    int rockType;
    
    public void RockStats(String desc, int catN, double weight ){
        this.desc = desc;
        this.catNum = catN;
        this.weight = weight;
        FileRock();
    }
    public void FileRock(){
        if(desc.equals(" glassy")){
            rockType = 1; 
        }
        else if(desc.equals(" crystalline")){
            rockType = 1; 
        }
        else if(desc.equals(" cementy")){
            rockType = 2;   
        }
        else if(desc.equals(" mineraly")){
            rockType = 2; 
        }
        else if(desc.equals(" layery")){
            rockType = 3; 
        }
        else{
            System.out.println("Ooopppsss cant do that not a valid type please "
            + "try againg but not here go to the real website to file that kind "
            + "of rock we can not do it here good bye.");
        }
    }

    

    public String getDesc() {
        return desc;
    }

    public int getCatNum() {
        return catNum;
    }

    public double getWeight() {
        return weight;
    }

    public int getRockType() {
        return rockType;
    }
    
    
    
}
