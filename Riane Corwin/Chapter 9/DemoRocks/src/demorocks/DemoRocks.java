package demorocks;
import java.util.Scanner;

public class DemoRocks {

    
    public static void main(String[] args) {
        //i dont' cariables
        String desc;
        int catNum;
        double weight;
        
        Rock rock = new Rock();
        IgneousRock iRock = new IgneousRock();
        SedimentaryRock sRock = new SedimentaryRock();
        MetamorphicRock mRock = new MetamorphicRock();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the category number, followed by the weight in grams, and then a brief description of the rock\n"
                + "For example: \n   crystalline, glassy\n   cementy, mineraly\n   layery");
        catNum = sc.nextInt();
        weight = sc.nextDouble();
        desc = sc.nextLine();
        
        rock.RockStats(desc, catNum, weight);
        switch(rock.getRockType()){
            case 1: iRock.Display(rock.getDesc(), rock.getCatNum(), rock.getWeight()); break;
            case 2: sRock.Display(rock.getDesc(), rock.getCatNum(), rock.getWeight()); break;
            case 3: mRock.Display(rock.getDesc(), rock.getCatNum(), rock.getWeight()); break;
        
        }
                
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
