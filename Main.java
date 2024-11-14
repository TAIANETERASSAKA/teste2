import java.util.Scanner;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
      int tipoUsuario, respostaTipoAcao, gerenteOUcliente;
      String nome = "Taiane", email= "taiane@usp.br";
      long cpf= 451813848;
      Scanner ler = new Scanner(System.in);

      do{
          //ESCOLHER SE VAI FAZER CADASTRO OU FAZER LOGIN
          System.out.println("Digite 1 para logar, 2 para cadastrar");
          respostaTipoAcao = ler.nextInt();
          ler.nextLine();
          
          int respostaTipoUsuario;
            //COMANDOS DEFINIDOS PARA LOGIN
            if(respostaTipoAcao==1){

                System.out.println("Digite 1 se for gerente e 2 se for cliente");
                respostaTipoUsuario = ler.nextInt();

                if (respostaTipoUsuario == 1){
                //EXIBINDO O MENU PARA USUARIO DO TIPO GERENTE
                    gerente g = new gerente(cpf, email, nome, respostaTipoUsuario);
                    g.menu();  
                }else if (respostaTipoUsuario == 2){
                //EXIBINDO O MENU PARA USUARIO DO TIPO GERENTE
                    cliente c = new cliente(cpf, email, nome, respostaTipoUsuario);
                    c.menu();
                }else{
                    System.out.println("Opção inválida");
                }


            //COMANDOS DEFINIDOS PARA CADASTRO
            }else if(respostaTipoAcao==2){
                System.out.println("Insira seu nome");
                nome = ler.nextLine();

                System.out.println("Insira seu email");
                email = ler.next();

                System.out.println("Insira seu CPF");
                cpf = ler.nextLong();

                System.out.println("Digite 1 se você for gerente, digite 0 se for cliente");
                gerenteOUcliente = ler.nextInt();
                if(gerenteOUcliente == 0){
                     cliente c = new cliente(cpf, email, nome, gerenteOUcliente);
                    System.out.println("Gerente " + c.getNome() + " cadastrado com sucesso!");
                    System.out.println("Você tem permissão de gerente: " + c.getPermissao());
                    System.out.println("Enviamos um link para confirmacao de cadastro no seu email " + c.getEmail());
                }else if(gerenteOUcliente ==1 ){
                    gerente g = new gerente(cpf, email, nome, gerenteOUcliente);
                    System.out.println("Olá " + g.getNome() +"!");
                    System.out.println("Você tem permissão de gerente: " + g.getPermissao());
                    System.out.println("Enviamos um link para confirmacao de cadastro no seu email " + g.getEmail());
                }

                

            }else if (respostaTipoAcao !=2 && respostaTipoAcao !=1 ){
                System.out.println("inválido");
            }
    }while( respostaTipoAcao  !=2 && respostaTipoAcao  !=1);
  }            
}