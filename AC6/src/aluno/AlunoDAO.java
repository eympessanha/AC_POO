package aluno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class AlunoDAO {
     ArrayList<Aluno> alunos = new ArrayList<>();
     String arquivo = "C:\\Users\\Esther de Yeshua\\Downloads\\AP6\\AC6\\src\\arquivo.txt";

     public AlunoDAO(){
        this.alunos = new ArrayList<>();;
     }

        public void inserir() throws IOException{
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))){
                String line;
                while((line = leitor.readLine())!=null){
                    String[] informacoes = line.split("-");
                    if(informacoes.length==3){
                        String nome = informacoes[0];
                        String curso = informacoes[1];
                        String matricula = informacoes[2];
                        alunos.add(new Aluno(nome,curso,matricula));
                    }
                }
            }
        }

        public void salvar() throws IOException{
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo, false))){
                for(Aluno aluno : alunos){
                    escritor.write(aluno.toString());
                    escritor.newLine();}
            }}

        public String adicionarAluno(String nome, String curso, String matricula){
            this.alunos.add(new Aluno(nome, curso, matricula));
            return "Aluno adicionado!";
        }

        public String removerAluno(String matricula){
            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getMatricula().equals(matricula)) {
                    alunos.remove(i);
            }}
            return "Aluno removido!";}

        public String atualizarCurso(String matricula, String novoCurso){
            for (Aluno aluno : alunos) {
                if (aluno.getMatricula().equals(matricula)) {
                    aluno.setCurso(novoCurso);
        }}
            return "Curso Atualizado!";}

        public void listarInfos(String matricula){
            for (Aluno aluno : alunos){
            if (aluno.getMatricula().equals(matricula)){
                System.out.println("Informações do(a) aluno(a):");
                System.out.println(aluno);}
            }
        }

}

/*Adicionar um novo aluno à estrutura;
Remover um aluno da estrutura, a partir da matrícula;
Atualizar o curso de um aluno, a partir da matrícula;
Listar as informações de um aluno, a partir da matrícula;
Listar todos os alunos.*/