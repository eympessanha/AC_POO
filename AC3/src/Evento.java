import java.util.List;

public class Evento {
    String nome;
    int data;
    String local;
    int maxParticipantes;
    String info;
    List<Inscricao> participantes;
    String palestrante;

    Evento(){}
    
    Evento(String nome, int data, String local, int maxParticipantes, String info, String palestrante) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.maxParticipantes = maxParticipantes;
        this.info = info;
        this.palestrante = palestrante;
    }


void inscreverAluno(Inscricao aluno) {
    if (participantes.size() < maxParticipantes) {
        participantes.add(aluno);
     }
    }
}
