package service;

public class AdditionService implements CalculatorService{


    @Override
    public double computationalAction(double numberFirst, double numberSecond) {
        //additions(numberFirst,nuberSecond);
        return numberFirst+numberSecond;
    }
//    public double additions (double numberFirst, double numberSecond){
//        return numberFirst+numberSecond;
//    }
}
