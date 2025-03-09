import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContatoPersistence {
    private static final String ARQUIVO_CONTATOS = "contatos.csv";

    public List<Contato> carregarContatos() {
        List<Contato> contatos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_CONTATOS))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                Contato contato = new Contato(dados[0], dados[1], dados[2]);
                contatos.add(contato);
            }
        } catch (IOException e) {
            // Ignorar exceção se o arquivo não existir
        }
        return contatos;
    }

    public void salvarContatos(List<Contato> contatos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_CONTATOS))) {
            for (Contato contato : contatos) {
                bw.write(contato.getNome() + "," + contato.getTelefone() + "," + contato.getEmail());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}