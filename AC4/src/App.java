// Nossa biblioteca está buscando modernizar o sistema de reservas de livros e recursos.
// Atualmente, enfrentamos desafios com a gestão de empréstimos e devoluções. Precisamos de um sistema
// que permita aos usuários reservar livros e verificar a disponibilidade. 
//Além disso, alguns recursos especiais, como e-books, não podem ser emprestados, apenas reservados 
// para leitura online. Tanto livros físicos quanto e-books precisam constar título e autor. 
// Os e-books também devem registrar o formato, que pode ser ePub ou PDF. Desenvolva classes para 
// livros físicos e e-books e inclua uma herança entre essas classes para agregar informações comuns.
// Para testar o projeto, considere a seguinte classe principal:
//gt
public class App {
    public static void main(String[] args) {
        LivroFisico livro1 = new LivroFisico("Aventuras em Java", "João Autor");
        Ebook ebook1 = new Ebook("Programação Java Avançada", "João Autor", "PDF");

        livro1.emprestar(); // Vai exibir um texto dizendo que o livro precisa ser reservado primeiro.

        // As mensagens abaixo devem exibir na tela que os livros foram reservados com sucesso
        livro1.reservar();
        ebook1.reservar();

        ebook1.cancelarReserva(); // Deve dizer que a reserva foi cancelada


        livro1.emprestar(); // Vai informar que o livro foi emprestado com sucesso
        livro1.emprestar(); // Vai exibir um texto dizendo que o livro já está emprestado
        livro1.devolver(); // Vai exibir um texto dizendo que o livro foi devolvido
    }
}



