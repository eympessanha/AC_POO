import java.util.List;

public class Controle {
    List<Evento> eventos;
    int vagas;

    Controle(List<Evento> eventos, String palestrantes, int vagas, int maxParticipantes, int participantes) {
        this.eventos = eventos;
        this.vagas = maxParticipantes - participantes;
    }
}
