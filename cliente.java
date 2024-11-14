import java.util.Scanner;

public class cliente extends usuario{
    private Scanner ler = new Scanner(System.in); 
    
    //métodos construtores
    public cliente( long CPF, String email, String nome, int gerenteOUcliente){
        super(CPF, email, nome, gerenteOUcliente);
    }
    
    public void menu (){
        System.out.println("MENU");
        System.out.println("1: Comprar passagem");
        System.out.println("2: Cancelar passagem");
        System.out.println("3: Alterar passagem");
        System.out.println("4: Fazer checkin");

        int respostaCliente = ler.nextInt();

        if(respostaCliente  == 1){

        }else if(respostaCliente  == 2){

        }else if(respostaCliente  == 3){

        }else if(respostaCliente  == 4){

        }else{
            System.out.println("Opção inválida");
        }
    }

    
    ////métodos setters
    //public void setCheckin(long CPF){
    //    voos.setPassageiros(getCPF());
    //}
    
    void comprarPassagem(){
        System.out.println("Origem:");
        String origem = ler.next();
        System.out.println("Destino desejado:");
        String destino = ler.next();
        System.out.println("Data saida:");
        String data_saida = ler.next();
        System.out.println("Data chegada:");
        String data_chegada = ler.next();
        System.out.println("Categoria:");
        String categoria = ler.next();
        
        //criar metodo para buscar voo
        
        //selecionar voo e passar como parametro para a criacao da passagem 
        //passagem p = new passagem( voo, categoria, cliente );
    }
    
    //public void cancelaPassagem(int id ){
      //  if(passagem.setId() = id && passagem.setSatus() = 1){
        //    passagem.setSatus(0);
        //}
    //}
    
    //public void consultaPassagem(int id){
        //if(passagem.setId() = id ){
        //    System.out.println('Identificador da passagem:',  passagem.setId() );
        //   System.out.println('Titular da passagem:',  passagem.setDono() ); 
        //    System.out.println('Categoria:',  passagem.setCategoria(); );
        //    System.out.println('Valor pago:',  passagem.setPreco() ); ;
        //    System.out.println('Voo:',  passagem.setVoo() );
      //  }
    //}
    
    
    
}