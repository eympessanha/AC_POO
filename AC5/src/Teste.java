public class Teste {
    public static void main(String[] args) throws Exception {
        
        Crud crud1 = new Crud();

        crud1.adicionarAluno("Esther Pessanha","Full-Stack Development","123456");
        crud1.adicionarAluno("Arthur Amaral","Farmácia","987654");

        crud1.removerAluno("987654");

        crud1.atualizarCurso("123456","Ciência de Dados");

        crud1.listarInfos("123456");

        crud1.adicionarAluno("Sarah Pessanha","Design Gráfico","567899");

        crud1.listarAlunos();
    }
}


/*Adicionar um novo aluno à estrutura;
Remover um aluno da estrutura, a partir da matrícula;
Atualizar o curso de um aluno, a partir da matrícula;
Listar as informações de um aluno, a partir da matrícula;
Listar todos os alunos.*/