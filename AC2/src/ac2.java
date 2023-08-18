import java.util.Scanner;

public class ac2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double result;
        double n;
        String oper; 
        String msg = "A";

        while(msg.equals("A")){
            System.out.println("Informe um valor double: ");
            result = leitor.nextDouble(); 
            msg = "B";
                while(msg.equals("B")){
                    System.out.println("Informe qual operação deseja fazer (soma, sub, div, mult): ");
                    oper = leitor.next();
                    System.out.println("Informe outro valor double: ");
                    n = leitor.nextDouble(); 
                    result = operacao(oper, result, n);
                    System.out.println("Para recomeçar o cálculo, digite A");
                    System.out.println("Para escolher outra operação, digite B");
                    System.out.println("Para sair, digite X: ");
                    msg = leitor.next();
                }
        }
        System.out.println("Calculadora finalizada");
        leitor.close();
    }

    public static double soma(double result, double n){
        return result+n;
    }

    public static double sub(double result, double n){
        return result-n;
    }

    public static double div(double result, double n){
        return result/n;
    }

    public static double mult(double result, double n){
        return result*n;
    }
    
    public static double operacao(String oper,double result, double n){
        switch(oper){
            case "soma":
                result = soma(result, n);
                System.out.println(result);
                break;
            case "sub":
                result = sub(result, n);
                System.out.println(result);
                break;
            case "div":
                result = div(result, n);
                System.out.println(result);
                break;
            case "mult":
                result = mult(result, n);
                System.out.println(result);
                break;
            default:
                System.out.println("Operação inexistente.");
            
        }
        return result;
    }
}
