package DZ5Task1;

import java.util.ArrayList;

public class DivModel {

    public DivModel() {

    }

    
    public void divRational(ArrayList<Integer> numRational1, ArrayList<Integer> numRational2) {

        ArrayList<Integer> divRational = new ArrayList<>();

        
        divRational.add(numRational1.get(0) * numRational2.get(1));

        
        divRational.add(numRational1.get(1) * numRational2.get(0));

        
        ArrayList<Integer> fractionReduction = new Rational().fractionReduction(divRational);

        System.out.println(fractionReduction.get(0) + "/" + fractionReduction.get(1));
    }

    
    public void divComplex(ArrayList<Integer> numComplex1, ArrayList<Integer> numComplex2) {

        ArrayList<Integer> divComplex = new ArrayList<>();

        
        divComplex.add(numComplex1.get(0) * numComplex2.get(0) + numComplex1.get(1) * numComplex2.get(1));

        
        divComplex.add(numComplex1.get(0) * numComplex2.get(1) * (-1)
                + numComplex1.get(1) * numComplex2.get(0));

        
        divComplex.add(numComplex2.get(0) * numComplex2.get(0)
                - numComplex2.get(1) * numComplex2.get(1) * (-1));

       
        System.out.println(new Complex().printComplexDiv(divComplex));
    }

}