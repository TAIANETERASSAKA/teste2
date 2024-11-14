import java.util.ArrayList;

public class voos{
    private int id;
    private int ativo; //0 anativo, 1 ativo
    private String destino ;
    private String origem;
    private String status; 
    private int time_saida;
    private int time_chegada;
    //private ArrayList tripulacao;
    private ArrayList passageiros; 
    private double preco_passagem;
    //private aviao realiza_voo;


    //métodos construtores
    public voos(int id,  String destino, String origem, String status, int time_saida, int time_chegada, double preco_passagem){
        this.ativo = 1;
        this.destino = destino;
        this.time_chegada = time_chegada;
        this.origem = origem;
        this.time_saida = time_saida;
        this.status = status;
        this.preco_passagem = preco_passagem;
        this.id= id;
        this.passageiros = null;
    }

    //metodos setters

    public void setId(int id, boolean permissao){
        if(permissao= true){
            this.id = id;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setPassageiros(long CPF){
        passageiros.add(CPF);
    }

    public void setAtivo(int ativo, boolean permissao){
        if(permissao = true){
            this.ativo= ativo;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setDestino(String destino, boolean permissao){
        if(permissao= true){
            this.destino = destino;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setOrigem(String origem, boolean permissao){
        if(permissao= true){
            this.origem = origem;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setTime_saida(int time_saida, boolean permissao){
        if(permissao= true){
            this.time_saida = time_saida;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setTime_chegada(int time_chegada, boolean permissao){
        if(permissao= true){
            this.time_chegada = time_chegada;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setPreco_passagem(double preco_passagem, boolean permissao){
        if(permissao= true){
            this.preco_passagem = preco_passagem;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setRelatorioVoos(){
        System.out.println("Id voo: " + this.getId() );
        System.out.println("Informacões do voo: ");
        System.out.println("Origem: " + this.getOrigem());
        System.out.println("Destino: " + this.getDestino());
        System.out.println("Data saída: " + this.getTime_saida());
        System.out.println("Data chegada: " + this.getTime_chegada());
        System.out.println("Preço base da passagem: " + this.getPreco_passagem());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Ativo: " + this.getAtivo());
    }

    //métodos getters
    public int getId(){
        return id;
    }

    public String getDestino(){
        return destino;
    }

    public String getOrigem(){
        return origem;
    }

    public int getTime_saida(){
        return time_saida;
    }

    public int getTime_chegada(){
        return time_chegada;
    }

    public double getPreco_passagem(){
        return preco_passagem;
    }

    public int getAtivo(){
        return ativo;
    }

    public String getStatus(){
        return status;
    }



    //metodos abstratos


}