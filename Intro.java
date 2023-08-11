// instalar extensão do java
// verificar no cmd se jdk está instalado 
// ctrl+shift+p "New Java Project"
// seleciona e nomeia pasta

public class App {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int y = 1;

        // Comparação 
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x < y);

        // Operadores lógicos
        System.out.println(!false); // NOT
        System.out.println(true && false); // AND
        System.out.println(true || false); // OR

        // Estruturas de decisão
        //if e else
        int idade = 19;

        if (idade>18){
            System.out.println("Você é maior de idade");
        } else if (idade<0){
            System.out.println("Idade inválida!");
        } else {
            System.out.println("Você é menor de idade");
        }

        // switch
        String opcao = "a";

        switch(opcao){
            case "a":
                System.out.println("Opção a");
            case "b":
                System.out.println("Opção b");
                break;
            case "c":
                System.out.println("Opção c");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // Estrutura de repetição
        //for

        for (int i = 0; i <= 5; i++){
            System.out.println(i);
        }
                // variavel declarada no for só existe dentro do for
        int i;
        for (i=0;i<=5;i++){
            System.out.println(i);
        }
        System.out.println(i);

        // while
        i = 10;
        while(i>0){
            System.out.println(i--);
        }
        
    }
}
