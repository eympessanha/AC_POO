public class LivroFisico extends Livros{

    public LivroFisico(String nome, String autor) {
        super(nome,autor);
    }

public void devolver() {
    System.out.println("Livro devolvido");
}

public void emprestar() {
    System.out.println("Livro emprestado");
}

}