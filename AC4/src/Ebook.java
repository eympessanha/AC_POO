public class Ebook extends Livros{
    String formato;
    public Ebook(String nome, String autor, String formato) {
        super(nome,autor);
        this.formato = formato;
    }

}