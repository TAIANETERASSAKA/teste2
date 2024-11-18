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
            comprarPassagem();

        }else if(respostaCliente  == 2){
            //1cancelarPassagem();

            arquivoVoo arquivo = new arquivoVoo();
            arquivo.leVoos();


        }else if(respostaCliente  == 3){
            alterarPassagem();

        }else if(respostaCliente  == 4){
           // fazerCheckin();

        }else{
            System.out.println("Opção inválida");
        }
    }

    
    ////métodos setters
    public void setCheckin(long CPF){
        //voos.setPassageiros(getCPF());
    }
    
    public void comprarPassagem(){
        System.out.println("Origem:");
        String origem = ler.next();
        System.out.println("Destino desejado:");
        String destino = ler.next();
        System.out.println("Data saida:");
        int data_saida = ler.nextInt();
        System.out.println("Data chegada:");
        int data_chegada = ler.nextInt();
        System.out.println("Categoria:");
        String categoria = ler.next();
        
        //criar metodo para buscar voo
        buscaVoo(origem, destino, data_saida, data_chegada, categoria);
        
        //selecionar voo e passar como parametro para a criacao da passagem 
        // passagem p = new passagem( voo, categoria, cliente, id );
    }
    
    public void cancelarPassagem(passagem p){
        System.out.println("Insira o id da passagem que voc� quer cancelar");
        int id = ler.nextInt();

        if(p.getId() == id && p.getAtiva()){
            p.setAtiva(false);
        }
    }

    public void alterarPassagem(){
        // if(passagem.setId() = id && passagem.setSatus() = 1){
        //     passagem.setSatus(0);
        //  }
     }

    // public void fazerCheckin(passagem p){
    //     voos v =  p.getVoo();


    // }


    
    //public void consultaPassagem(int id){
        //if(passagem.setId() = id ){
        //    System.out.println('Identificador da passagem:',  passagem.setId() );
        //   System.out.println('Titular da passagem:',  passagem.setDono() ); 
        //    System.out.println('Categoria:',  passagem.setCategoria(); );
        //    System.out.println('Valor pago:',  passagem.setPreco() ); ;
        //    System.out.println('Voo:',  passagem.setVoo() );
      //  }
    //}


    public void buscaVoo( String origem, String  destino, int data_saida, int data_chegada, String  categoria){
        
    }
    
    
}