public class Main {
    public static void main(String[] args) {
        ContatoPersistence persistence = new ContatoPersistence();
        ContatoService service = new ContatoService(persistence);
        ContatoUI ui = new ContatoUI(service);
        ui.iniciar();
    }
}