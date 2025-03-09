import java.util.Scanner;

public class ContatoUI {
    private ContatoService service;
    private Scanner scanner = new Scanner(System.in);

    public ContatoUI(ContatoService service) {
        this.service = service;
    }

    public void iniciar() {
        // Implementar a interface de linha de comando para interagir com o usuário
    }
}