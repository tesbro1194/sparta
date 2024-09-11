package calculator.CalculatorLv2;

import java.util.ArrayList;


public class Calculator {
    private final static ArrayList<Integer> resultsList = new ArrayList<>();
    static int number;

    static int addCalculate (int firstNumber, int secondNumber) {
        number = firstNumber + secondNumber;
        resultsList.add(number);
        return number;

    }

    static int substractCalculate (int firstNumber, int secondNumber) {
        number = firstNumber - secondNumber;
        resultsList.add(number);
        return number;
    }
    static int multiplyCalculate (int firstNumber, int secondNumber) {
        number = firstNumber * secondNumber;
        resultsList.add(number);
        return number;
    }
    static int divideCalculate (int firstNumber, int secondNumber) {
        number = firstNumber / secondNumber;
        resultsList.add(number);
        return number;
    }

    static ArrayList<Integer> getResultsList (int number) {
        resultsList.add(number);
        return resultsList;
    }

    static ArrayList<Integer> setResultsList (int countNumber, int value) {
        resultsList.set(countNumber , value);
        System.out.println(resultsList);
        return resultsList;
    }

    static ArrayList<Integer> showResultsList (){
        resultsList.toString();
        return resultsList;
    }

    static ArrayList<Integer> removeFirstResult () {
        resultsList.remove(resultsList.getFirst());
        System.out.println(resultsList);
        return resultsList;
    }
}
