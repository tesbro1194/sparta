package calculator.CalculatorLv2;

import java.util.Scanner;

public class Lv2 {
    public static void main(String[] args) {
        int number=0;
        boolean exitKey = true;

        do {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            Scanner number1 = new Scanner(System.in);
            int firNumber = number1.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            Scanner operator = new Scanner(System.in);
            String getOperator = operator.next();

            System.out.println("두 번째 숫자를 입력하세요: ");
            Scanner number2 = new Scanner(System.in);
            int secNumber = number2.nextInt();

            switch (getOperator){
                case "+" :
                    number = Calculator.addCalculate(firNumber, secNumber);
                    System.out.println(number);

                    exitKey = Calculator.exitCalculator();

                    break;

                case "-" :
                    number = Calculator.substractCalculate (firNumber, secNumber);
                    System.out.println(number);

                    exitKey = Calculator.exitCalculator();

                    break;

                case "*" :
                    number = Calculator.multiplyCalculate(firNumber, secNumber);
                    System.out.println(number);

                    exitKey = Calculator.exitCalculator();

                    break;

                case "/" :
                    if (secNumber==0){
                        System.out.println("0으로 나누기를 할 수 없습니다");
                        break;
                    }
                    else {
                        number = Calculator.divideCalculate(firNumber, secNumber);
                        System.out.println(number);

                        exitKey = Calculator.exitCalculator();
                    }
                    break;

                default : System.out.println("숫자와 사칙연산 기호를 확인하세요");
            }
        } while(exitKey);


        System.out.println("계산 결과를 수정하고 싶으면 set을 입력하시오");
        System.out.println("가장 먼저 계산된 결과값을 삭제하고 싶으면 remove를 입력하시오");
        System.out.println("계산기를 종료하고 싶으면 esc를 입력하시오");
        Scanner Key = new Scanner(System.in);
        String inputKey = Key.next();

        switch (inputKey) {
            case "set" -> {
                System.out.println(Calculator.getResultsList());
                System.out.println("수정하고 싶은 결과의 순번과 값을 차례대로 입력하시오.");
                System.out.println("수정하고 싶은 결과의 순번을 입력하시오: ");
                Scanner setIndex = new Scanner(System.in);
                int setIndexKey = (setIndex.nextInt() - 1);

                System.out.println("수정하고 싶은 결과의 값을 입력하시오: ");
                Scanner setValue = new Scanner(System.in);
                int setValueKey = setValue.nextInt();

                Calculator.setResultsList(setIndexKey, setValueKey);
            }
            case "remove" -> Calculator.removeFirstResult();
            case "esc" -> {
            }
            default -> {
                System.out.println("set, get, remove 중 하나를 입력하시오");
            }
        }
    }
}
