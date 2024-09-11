package calculator;

import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        boolean exitKey = true;

        do {
            int number;
            System.out.println("첫 번째 숫자를 입력하세요: ");
            Scanner int1 = new Scanner(System.in);
            int int1Number = int1.nextInt();



            System.out.println("사칙연산 기호를 입력하세요: ");
            Scanner calculate = new Scanner(System.in);
            String symbol = calculate.next();

            System.out.println("두 번째 숫자를 입력하세요: ");
            Scanner int2 = new Scanner(System.in);
            int int2Number = int2.nextInt();

            switch (symbol){
                case "+" :
                    number = int1Number + int2Number;
                    System.out.println("계산 결과 : " + number);

                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    Scanner exit1 = new Scanner(System.in);
                    String exitText1 = exit1.next();

                    if("exit".equals(exitText1)){
                        exitKey = false;
                    }
                    else {
                        exitKey = true;
                    }
                    break;

                case "-" :
                    number = int1Number - int2Number;
                    System.out.println("계산 결과 : " + number);

                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    Scanner exit2 = new Scanner(System.in);
                    String exitText2 = exit2.next();
                    if("exit".equals(exitText2)){
                        exitKey=false;
                    }
                    else {
                        exitKey = true;
                    }
                    break;

                case "*" :
                    number = int1Number * int2Number;
                    System.out.println("계산 결과 : " + number);

                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    Scanner exit3 = new Scanner(System.in);
                    String exitText3 = exit3.next();
                    if("exit".equals(exitText3)){
                        exitKey=false;
                    }
                    else {
                        exitKey=true;
                    }
                    break;

                case "/" :
                    if (int2Number==0){
                        System.out.println("0으로 나누기를 할 수 없습니다");
                        break;
                    }
                    else {
                        double Anserumber = int1Number / int2Number;
                        System.out.println("계산 결과 : " + Anserumber);

                        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                        Scanner exit4 = new Scanner(System.in);
                        String exitText4 = exit4.next();
                        if("exit".equals(exitText4)){
                            exitKey=false;
                        }
                        else {
                            exitKey=true;
                        }
                    }
                    break;

            default : System.out.println("숫자와 사칙연산 기호를 확인하세요");
            }
        } while(exitKey);
    }
}