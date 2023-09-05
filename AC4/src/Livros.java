public abstract class Livros {
        String nome;
        String autor;
    
        public Livros(String nome, String autor) {
            this.nome = nome;
            this.autor = autor;
        }

        public void reservar() {
            System.out.println("Reservado com sucesso");
        }
        
        public void cancelarReserva() {
            System.out.println("Reserva cancelada");
        }
}
