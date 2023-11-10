package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {
        //Condição Simples
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float n = teclado.nextFloat();
        System.out.println("Segunda nota: ");
        float n1 = teclado.nextFloat();
        float m = (n + n1)/2;
        System.out.println("Sua media eh " + m);
        if(m>=9){
            System.out.println("Parabens!");
        }*/
        
        //Codinção Composta
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua data de nascimento: ");
        int dt = teclado.nextInt();
        int id = (2023 - dt);
        if(id >= 18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
        
    }

}
