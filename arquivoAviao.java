import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class arquivoAviao {

    public void inserirAviao(aviao a) {
        BufferedWriter writer = null;
    
        try {
            // Usando 'true' para append, adicionando no final do arquivo
            writer = new BufferedWriter(new FileWriter("aviao.txt", true));

            // Escrevendo as informações do avião no arquivo
            writer.write("Id: " + a.getId() + ", ");
            writer.write("Modelo: " + a.getModelo() + ", ");
            writer.write("Ano: " + a.getAno() + ", ");
            writer.write("Capacidade: " + a.getCapacidade() + ", ");
            writer.write("Status: " + (a.getAtivo() == 1 ? "Ativo" : "Inativo"));
            writer.newLine();  // Adiciona uma nova linha

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();  // Fechando o BufferedWriter
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void buscaAviaoID(int id){
        

    }
}

