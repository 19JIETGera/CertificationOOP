package service;

public class MultiplicationService implements CalculatorService{

    @Override
    public double computationalAction(double numberFirst, double numberSecond) {
        //multiplications(numberFirst,numberSecond);
        return numberFirst*numberSecond;
    }
//    private double multiplications(double numberFirst, double numberSecond){
//        return numberFirst*numberSecond;
//    }
}
