import java.util.ArrayList;
import java.util.List;

public class ContatoService {
    private List<Contato> contatos;
    private ContatoPersistence persistence;

    public ContatoService(ContatoPersistence persistence) {
        this.persistence = persistence;
        this.contatos = persistence.carregarContatos();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        persistence.salvarContatos(contatos);
    }

    // Outros métodos: listarContatos, buscarContato, removerContato
}