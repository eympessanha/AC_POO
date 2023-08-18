import java.util.Scanner;

public class ac2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double num1;
        double num2;
        String oper; 
        String msg = "A";

        while(msg.equals("A")){
        System.out.println("Informe um valor double: ");
        num1 = leitor.nextDouble(); 
        System.out.println("Informe qual operação deseja fazer (soma, sub, div, mult): ");
        oper = leitor.next();
        System.out.println("Informe outro valor double: ");
        num2 = leitor.nextDouble(); 
        operacao(oper, num1, num2);
        mensagem(msg);
        msg = leitor.next();
        while(msg.equals("B")){ 
            System.out.println("Informe qual operação deseja fazer (soma, sub, div, mult): ");
            oper = leitor.next();
            System.out.println("Informe outro valor double: ");
            num2 = leitor.nextDouble(); 
            operacao(oper, num1, num2);
            mensagem(msg);
            msg = leitor.next();
        }
        }
        System.out.println("Calculadora finalizada");
        leitor.close();
    }

    public static double soma(double num1, double num2){
        return num1+num2;
    }

    public static double sub(double num1, double num2){
        return num1-num2; 
    }

    public static double div(double num1, double num2){
        return num1/num2; 
    }

    public static double mult(double num1, double num2){
        return num1*num2;
    }

    public static void operacao(String oper,double num1, double num2){
        switch(oper){
            case "soma":
                System.out.println(soma(num1, num2));
                break;
            case "sub":
                System.out.println(sub(num1, num2));
                break;
            case "div":
                System.out.println(div(num1, num2));
                break;
            case "mult":
                System.out.println(mult(num1, num2));
                break;
            default:
                System.out.println("Operação inexistente.");
        }
    }

    public static void mensagem(String msg){
        System.out.println("Para recomeçar o cálculo, digite A");
        System.out.println("Para escolher outra operação, digite B");
        System.out.println("Para sair, digite X: ");
    }
}
