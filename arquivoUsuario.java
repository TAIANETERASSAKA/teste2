import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class arquivoUsuario{

    public void inserirUsuario(usuario u) {
        BufferedWriter writer = null;
    
        try {
            writer = new BufferedWriter(new FileWriter("cadastro.txt", true));

            // Escrevendo as informações do avião no arquivo
            writer.write("Nome: " + u.getNome() + ", ");
            writer.write("Email: " + u.getEmail() + ", ");
            writer.write("CPF: " + u.getCPF() + ", ");
            writer.write("Permissão: " + u.getPermissao() + ", ");
           if (u.getPermissao() && !u.getIs_funcionario()) {
                writer.write("Tipo: Gerente");
            } else if(!u.getPermissao() && !u.getIs_funcionario()) {
                writer.write("Tipo: Cliente");
            } else{
                writer.write("Tipo: Funcionário");
            }
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

