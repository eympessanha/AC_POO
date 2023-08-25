public class App {
    public static void main(String[] args) throws Exception {
        Evento evento1, evento2;

        evento1 = new Evento();
        evento1.nome = "DDP Show";
        evento1.data = 2909;
        evento1.local = "Barra da Tijuca";
        evento1.maxParticipantes = 100;
        evento1.info = "";
        evento1.palestrante = "Joao";

        evento2 = new Evento();
        evento2.nome = "Inauguração Vila";
        evento2.data = 1010;
        evento2.local = "Niteroi";
        evento2.maxParticipantes = 50;
        evento2.info = "Para maiores de 18 anos";
        evento2.palestrante = "Felipe";

        Inscricao aluno1, aluno2;

        aluno1 = new Inscricao();
        aluno1.nome = "Esther";
        aluno1.matricula = 12345678;

        aluno2 = new Inscricao();
        aluno2.nome = "Maria";
        aluno2.matricula = 87654321;
    }
}