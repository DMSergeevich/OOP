
package DZ5Task1;

import java.util.ArrayList;

public class MultModel {

    public MultModel() {

    }

    
    public void multRational(ArrayList<Integer> numRational1, ArrayList<Integer> numRational2) {
        ArrayList<Integer> multRational = new ArrayList<>();

        
        multRational.add(numRational1.get(0) * numRational2.get(0));

        
        multRational.add(numRational1.get(1) * numRational2.get(1));

       
        ArrayList<Integer> fractionReduction = new Rational().fractionReduction(multRational);

        System.out.println(fractionReduction.get(0) + "/" + fractionReduction.get(1));
    }

    
    public void multComplex(ArrayList<Integer> numComplex1, ArrayList<Integer> numComplex2) {

        ArrayList<Integer> multComplex = new ArrayList<>();

        
        multComplex.add(numComplex1.get(0) * numComplex2.get(0)
                + numComplex1.get(1) * numComplex2.get(1) * (-1));

       
        multComplex.add(numComplex1.get(0) * numComplex2.get(1)
                + numComplex1.get(1) * numComplex2.get(0));

      
        System.out.println(new Complex().printComplex(multComplex));
    }
}
