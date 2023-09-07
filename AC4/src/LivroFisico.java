public class LivroFisico extends Livros{
    int emprestado = 0;
    public LivroFisico(String nome, String autor) {
        super(nome,autor);
        this.reservado = reservado;
        this.emprestado = emprestado;
    }

public void emprestar() {
    if(emprestado==0 && reservado==0){
        System.out.println("É necessário reservar o livro antes de emprestar");       
    } else if(emprestado==0 && reservado==1){
        emprestado = 1;
        System.out.println("Livro emprestado com sucesso");
    } else{
        System.out.println("O livro já foi emprestado!");
    }
}

public void devolver() {
    if(emprestado==1){
        emprestado = 0;
        System.out.println("Livro devolvido com sucesso!");
    }else{
        System.out.println("O livro já se encontra na biblioteca!");
    }
}

}

