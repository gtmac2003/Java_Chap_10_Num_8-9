
package mta_chapt10_q9;

import javax.swing.JOptionPane;
public class DemoRock {
    
    public DemoRock()
    {
    Rock rock;
    MetamorphicRock mR = new MetamorphicRock( 2, 5);
    SedimentaryRock sR = new SedimentaryRock(3, 20);
    igneousRock iR = new igneousRock(4, 10);
      /*
    String[] rockTypes = {"Metamorphic", "Igneous", "Sedimentary"};
    String rockchoice= (String) JOptionPane.showInputDialog(null,"Which rock are you inputing...", 
    "DemoRock", JOptionPane.QUESTION_MESSAGE, null,
    rockTypes,
    rockTypes[0]);
   */
      
     sR.setDesc("Sedimentary Rock");
      mR.setDesc(" metamorphic Rock");
      iR.setDesc("ignoues Rock");
        System.out.println(" Metamophic\n"+mR.getDesc()+ "\nSamples: " + mR.getNum_of_samps()+"\n Weight" + mR.getWeight());
        System.out.println(" Sedimentary\n"+sR.getDesc()+ "\nSamples: " + sR.getNum_of_samps()+"\n Weight" + sR.getWeight());
        System.out.println(" Igneous\n"+iR.getDesc()+ "\nSamples: " + iR.getNum_of_samps()+"\n Weight" + iR.getWeight());        
    }
    
    
    
     public static void main(String[] args)
     {
     new DemoRock();
     
     }
    
}
