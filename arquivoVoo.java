import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class arquivoVoo {

    public void inserirVoo(voos v) {
        BufferedWriter writer = null;
    
        try {
            // Usando 'true' para append, adicionando no final do arquivo
            writer = new BufferedWriter(new FileWriter("voo.txt", true));

            // Escrevendo as informa��es do avi�o no arquivo
            writer.write("Id: " + v.getId() + ", ");
            writer.write("Origem: " + v.getOrigem() + ", ");
            writer.write("Destino: " + v.getDestino() + ", ");
            writer.write("Hor�rio sa�da: " + v.getTime_saida() + ", ");
            writer.write("Hor�rio chegada: " + v.getTime_chegada() + ", ");
            writer.write("Status: " + (v.getAtivo() == 1 ? "Ativo" : "Inativo") + ", ");
            writer.write("Pre�o base da passagem: " + v.getPreco_passagem() + ", ");
            writer.write("Status: " + v.getStatus());
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
