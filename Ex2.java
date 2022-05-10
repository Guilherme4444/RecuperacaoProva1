import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira seu peso: ");
        Double peso = entrada.nextDouble();
        System.out.print("Insira sua altura: ");
        Double altura = entrada.nextDouble();
        Double imc;
        imc = peso / (altura * altura);

        Double total;
        total = imc;
        System.out.println("Seu IMC é de: " + total);

        if (imc<20.7) {
            System.out.println("Você está abaixo do peso!");
        
        }else if (imc>20.8) {
            System.out.println("Você está no Peso Ideal!");

        }else if (imc<26.4) {
            System.out.println("Você está no Peso Ideal!");

        }else if (imc>26.5) {
            System.out.println("Você está um pouco acima do peso!");

        }else if (imc<27.8) {
            System.out.println("Você está um pouco acima do peso!");

        }else if (imc>27.9) {
            System.out.println("Você está acima do peso ideal!");

        }else if (imc<31.1) {
            System.out.println("Você está acima do peso ideal!");

        }else {
            System.out.println("Você está obeso!");
        }
        
        
    

        

      
    }
 
}
