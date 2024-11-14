import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escreverArquivo {
    public static void main(String[] args) {
        cliente c = new cliente(451813848, "joao@usp.br", "João", 2);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pessoa.txt"))) {
            writer.write(c.toString());  // Escreve a representação do objeto em formato texto
            System.out.println("Dados foram escritos no arquivo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}