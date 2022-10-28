package src;

import java.util.Scanner;

public class ATV1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){

        int maior=0, menor=999999999;

        for(int i=1;i>0;i=i){
            System.out.println("Informe o número: ");
            i = sc.nextInt();

            if(i>maior){
                maior=i;
            }
            if(i<menor & i>0){
                menor=i;
            }
        }
        System.out.println("O maior número foi: "+maior);
        System.out.println("O menor número foi: "+menor);

    }

}
