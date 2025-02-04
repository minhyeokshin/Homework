package HomeWork_250204.Ex01;

import java.util.Scanner;
//BufferedReader(new InputStreamReader(System.in)) 사용하셔도 됩니다.

public class Prob1 {
    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
        String str= scan.nextLine();
        int result= 0;
        //여기를 작성하십시오.
        convert(str);

    }

    //필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
    private static void convert(String str) {
        //여기를 작성하십시오.
        try {
            int result = Integer.parseInt(str);
            System.out.printf("반환되는 숫자는 %d 입니다.",result);
        }catch (IllegalArgumentException e){
            System.out.println("예외가 발생되었습니다. 문자열을 입력하지 않고 Enter키를 누르셨습니다.");
            System.out.println(e.getMessage());
        }
    }

}