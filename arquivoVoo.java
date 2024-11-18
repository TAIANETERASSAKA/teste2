import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class arquivoVoo {

    public void inserirVoo(voos v) {
        BufferedWriter writer = null;
    
        try {
            writer = new BufferedWriter(new FileWriter("voo.txt", true));

            // Escrevendo as informações do avião no arquivo
            writer.write("Id: " + v.getId() + ", ");
            writer.write("Origem: " + v.getOrigem() + ", ");
            writer.write("Destino: " + v.getDestino() + ", ");
            writer.write("Horário saída: " + v.getTime_saida() + ", ");
            writer.write("Horário chegada: " + v.getTime_chegada() + ", ");
            writer.write("Status: " + (v.getAtivo() == 1 ? "Ativo" : "Inativo") + ", ");
            writer.write("Preço base da passagem: " + v.getPreco_passagem() + ", ");
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

    public void leVoos(){
        try {
			File arquivo = new File("voo.txt");
			FileReader fileReader = new FileReader(arquivo ); 
			BufferedReader bufferedReader = new BufferedReader(fileReader); 

			String registro;
			while((registro = bufferedReader.readLine()) != null) {
				System.out.println(registro); 
			}

			bufferedReader.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
		
}



