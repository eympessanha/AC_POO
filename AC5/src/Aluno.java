public class Aluno {
    String nome, curso, matricula;

    Aluno(String nome, String curso, String matricula){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + "\n" + "Matrícula: " + matricula +"\n" +"Curso: " + curso +"\n \n"; 
    }
}


    
//A classe possui os atributos nome, curso e matricula, todos do tipo String. 
