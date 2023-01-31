package DZ5Task1;

import java.util.ArrayList;

public class SumModel {

    public SumModel() {

    }

    public void sumRational(ArrayList<Integer> numRational1, ArrayList<Integer> numRational2) {
        ArrayList<Integer> sumRational = new ArrayList<>();

        
        sumRational.add(numRational1.get(0) * numRational2.get(1) + numRational1.get(1) * numRational2.get(0));

        
        sumRational.add(numRational1.get(1) * numRational2.get(1));

       
        ArrayList<Integer> fractionReduction = new Rational().fractionReduction(sumRational);

        System.out.println(fractionReduction.get(0) + "/" + fractionReduction.get(1));
    }

     
    public void sumComplex(ArrayList<Integer> numComplex1, ArrayList<Integer> numComplex2){

        ArrayList<Integer> sumComplex = new ArrayList<>();

        
        sumComplex.add(numComplex1.get(0)+numComplex2.get(0));

        
        sumComplex.add(numComplex1.get(1)+numComplex2.get(1));

        System.out.println(new Complex().printComplex(sumComplex));
    }



}
