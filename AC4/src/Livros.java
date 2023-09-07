public abstract class Livros {
        String nome;
        String autor;
        int reservado = 0;
    // y
        public Livros(String nome, String autor) {
            this.nome = nome;
            this.autor = autor;
        }

        public void reservar() {
            if(reservado==0){
                reservado = 1;
                System.out.println("Reservado com sucesso");
            } else {
                System.out.println("Livro indisponível para reserva");
            }
        }
        
        public void cancelarReserva() {
            if(reservado!=0){
                reservado = 0;
                System.out.println("Reserva cancelada");
            } else {
                System.out.println("O livro não foi reservado para realizar o cancelamento");
            }
        }
}
