
package DZ5Task1;

import java.util.ArrayList;

public class SubModel {

    public SubModel() {

    }

    
    public void subRational(ArrayList<Integer> numRational1, ArrayList<Integer> numRational2) {
        ArrayList<Integer> subRational = new ArrayList<>();

        
        subRational.add(numRational1.get(0) * numRational2.get(1) - numRational1.get(1) * numRational2.get(0));

        
        subRational.add(numRational1.get(1) * numRational2.get(1));

        
        ArrayList<Integer> fractionReduction = new Rational().fractionReduction(subRational);

        System.out.println(fractionReduction.get(0) + "/" + fractionReduction.get(1));
    }

    
    public void subComplex(ArrayList<Integer> numComplex1, ArrayList<Integer> numComplex2) {

        ArrayList<Integer> subComplex = new ArrayList<>();

        
        subComplex.add(numComplex1.get(0) - numComplex2.get(0));

       
        subComplex.add(numComplex1.get(1) - numComplex2.get(1));

        System.out.println(new Complex().printComplex(subComplex));
    }
}