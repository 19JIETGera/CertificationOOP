package service;

public class DivisionService implements CalculatorService{

    @Override
    public double computationalAction(double numberFirst, double numberSecond) {
        //division(numberFirst,numberSecond);
        return numberFirst/numberSecond;
    }
//    private double division (double numberFirst, double numberSecond){
//        return numberFirst/numberSecond;
//    }
}
