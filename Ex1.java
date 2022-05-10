import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        Double valor = entrada.nextDouble();
        System.out.println("Digite o estado: ");
        String estado = entrada.next();

        Double MG;
        MG =  valor * 7 / 100 ;
        Double MT;
        MT = valor * 12 / 100;
        Double RJ;
        RJ = valor * 15 / 100;
        Double MS;
        MS = valor * 8 / 100;
        Double PA;
        PA = valor * 9 / 100;
        Double PR;
        PR = valor * 10 / 100;


        switch (estado) {
            case "MG":
                System.out.println("O valor real é de: " + MG);
                
                break;
            case "MT":
                System.out.println("O valor real é de: " + MT );

                break;
            case "RJ":
                System.out.println("O valor real é de: " + RJ );


                break;
            case "MS":
                System.out.println("O valor real é de: " + MS);
                
                break;

            default:
                break;

            case "PA":
                System.out.println("O valor real é de: " + PA);

                break;

                case "PR":
                System.out.println("O valor real é de: " + PR);

                break;
        }


    }
        
}

