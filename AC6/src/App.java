import java.util.Scanner;

import aluno.AlunoDAO;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoDAO alunos = new AlunoDAO();
        alunos.inserir();
        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("Escolha uma opção: \n1- Inserir aluno \n2- Remover aluno \n3- Editar curso de um aluno \n4- Listar alunos \n5- Listar informações de um aluno \n6- Salvar e encerrar");

            int opcao = in.nextInt();
            in.nextLine();

            switch (opcao) {
                case 1: 
                    System.out.println("Informe o nome completo: ");
                    String nome = in.next();
                    System.out.println("Informe a matricula: ");
                    String matricula = in.next();
                    System.out.println("Informe o curso: ");
                    String curso = in.next();
                    alunos.adicionarAluno(nome, curso, matricula);
                    break;
                case 2:
                    System.out.println("Informe a matricula: ");
                    matricula = in.next();
                    alunos.removerAluno(matricula);
                    break;
                case 3:
                    System.out.println("Informe a matricula: ");
                    matricula = in.next();
                    System.out.println("Informe o novo curso: ");
                    String novoCurso = in.next();
                    alunos.atualizarCurso(matricula,novoCurso);
                    break;
                case 4:
                    System.out.println("Listagem de alunos:");
                    System.out.println(alunos);
                    break;
                case 5:
                    System.out.println("Informe a matrícula: ");
                    matricula = in.next();
                    System.out.println("Informações do(a) aluno(a):");
                    alunos.listarInfos(matricula);
                    break;
                case 6:
                    alunos.salvar();
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");;
            }
        }
        

        in.close();
    }
}


/*Adicionar um novo aluno à estrutura;
Remover um aluno da estrutura, a partir da matrícula;
Atualizar o curso de um aluno, a partir da matrícula;
Listar as informações de um aluno, a partir da matrícula;
Listar todos os alunos.*/





/* organização em pacotes 
 * EVITAR ações de input e output em classes dao
*/