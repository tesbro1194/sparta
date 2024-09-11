package calculator.CalculatorLv2;

import java.util.ArrayList;
import java.util.Scanner;


public class Calculator {
    private final static ArrayList<Integer> resultsList = new ArrayList<>();
    static int number;
    static boolean exitKey;

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

    static ArrayList<Integer> getResultsList () {
        return resultsList;
    }

    static ArrayList<Integer> setResultsList (int countNumber, int value) {
        resultsList.set(countNumber , value);
        System.out.println(resultsList);
        return resultsList;
    }


    static ArrayList<Integer> removeFirstResult () {
        resultsList.remove(resultsList.getFirst());
        System.out.println(resultsList);
        return resultsList;
    }

    static boolean exitCalculator () {
        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        Scanner inputExit = new Scanner(System.in);
        String exitText = inputExit.next();
        if ("exit".equals(exitText)){
            exitKey=false;
        }
        else {
            exitKey=true;
        }
        return exitKey;
    }
}
