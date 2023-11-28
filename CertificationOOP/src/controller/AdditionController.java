package controller;

import service.AdditionService;
import view.AdditionView;

public class AdditionController implements CalculatorController{
    private double res;
//    private double numberFirst;
//    private double numberSecond;
//
//    public AdditionController(double numberFirst, double numberSecond) {
//        this.numberFirst = numberFirst;
//        this.numberSecond = numberSecond;
//    }

    private final AdditionService additionService = new AdditionService();
    private final AdditionView additionView = new AdditionView();

    public double getRes() {
        return res;
    }

    @Override
    public void computationalAction(double numberFirst, double nuberSecond) {
        this.res = additionService.computationalAction(numberFirst,nuberSecond);
        additionView.sendOnConsole(numberFirst,nuberSecond,res);
    }
}
