/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demorockszi;


class IgneousRock extends Rocks {
    
    private String desc;
    
    public IgneousRock(int sampleNumb, double weightGrams) {
        super(sampleNumb, weightGrams);
        
        this.desc = "Rock made from cooled magma";
        
    }

    public String getDesc() {
        return desc;
    }
    
    
}
