public class App {
    public static void main(String[] args) throws Exception {
        eMedia(9,8,6);
        eExibir();
        ePrimo(22);
        eSemana(4);
        eBissexto(2012);
    }

    public static void eMedia (double ap1,double ap2, double ac){
        double m;
        m = (ap1 + ap2) * 0.4 + ac * 0.2;
        System.out.println("Média = " + m);
    }

    public static void eExibir (){
        for (int i = 150;i<=200;i++){
            System.out.println(i);
        }
    }

    public static void ePrimo(int num){
        int c = 1;
        for (int i = 1;i<=100;i++){
            if (num != i && num % i == 0){
                c++;
            }
        }
        if(c>2){
            System.out.println("Não é um número primo!");
            System.out.println("Divisível por:");
            for (int i = 1;i<=num;i++){
                if (num % i == 0){
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Número primo!");
        }
    }

    public static void eSemana(int i){
        switch(i){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor Inválido");
        }
    }

    public static void eBissexto(int ano){
        if (ano % 100 == 0 && ano % 400 != 0){
            System.out.println("Não é bissexto");
        } else if(ano % 4 == 0){
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }
}
