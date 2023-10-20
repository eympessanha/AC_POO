import java.util.ArrayList;

public class Crud {
     ArrayList<Aluno> alunos = new ArrayList<>();

     public Crud(){
        this.alunos = new ArrayList<>(); 
     }

        public void adicionarAluno(String nome, String curso, String matricula){
            Aluno aluno = new Aluno(nome, curso, matricula);
            this.alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado! \n");
        }

        public void removerAluno(String matricula){
            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getMatricula().equals(matricula)) {
                    System.out.println("Aluno "+ alunos.get(i).getNome() +" removido! \n");
                    alunos.remove(i);
            }
        }}

        public void atualizarCurso(String matricula, String novoCurso){
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    aluno.setCurso(novoCurso);
                    System.out.println("Curso de " + aluno.getNome() + " atualizado! \n");
        }}}

        public void listarInfos(String matricula){
            for (Aluno aluno : alunos){
            if (aluno.getMatricula().equals(matricula)){
                System.out.println("Informações do(a) aluno(a):");
                System.out.println(aluno);}
            }
        }

        public void listarAlunos(){
            System.out.println("Listagem de alunos:");
            for (Aluno aluno : alunos){
                System.out.println(aluno);
            }
        }
}

/*Adicionar um novo aluno à estrutura;
Remover um aluno da estrutura, a partir da matrícula;
Atualizar o curso de um aluno, a partir da matrícula;
Listar as informações de um aluno, a partir da matrícula;
Listar todos os alunos.*/