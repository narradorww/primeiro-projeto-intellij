package br.com.dio.model;

public class BreakContinue {

    public static void main(String[] args) {
        for(int num=1; num <=5; num ++){
            if(num== 3)
                break;  //interrompe o processo como um todo
            System.out.println(num);
        }


        for(int num=1; num <=5; num ++){
            if(num== 3)
                continue;  //só desconsidera a situação do if
            System.out.println(num);
        }
    }
}
