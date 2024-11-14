public class aviao{
    private int id;
    private String modelo;
    private int ano;
    private int capacidade_passageiros;
    private int ativo;  //1=> ativo 0=>inativo

    //métodos construtores
    public aviao(int id, String modelo, int ano, int capacidade_passageiros){
        this.id = id;
        this.modelo = modelo;
        this.ano = ano ;
        this.capacidade_passageiros = capacidade_passageiros;
        this.ativo = 1;
    }

    //metodos setters
    public void setAtivo(int ativo, boolean permissao){
        if(permissao = true){
            this.ativo= ativo;
        }else{
           System.out.println("Usuário sem permissão para realizar operação");
        }
    }


    public void setId(int id, boolean permissao){
        if(permissao = true){
            this.id = id;
        }else{
           System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setModelo(String modelo, boolean permissao){
        if(permissao = true){
            this.modelo = modelo;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setAno(int ano, boolean permissao){
        if(permissao = true){
            this.ano = ano;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void getCapacidade(int capacidade_passageiros, boolean permissao){
        if(permissao = true){
           this.capacidade_passageiros = capacidade_passageiros;
        }else{
           System.out.println("Usuário sem permissão para realizar operação");
        }
    }

    public void setRelatorioAviao(){
        System.out.println("Id avião: " + this.getId());
        System.out.println("Informacões do avião: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano de fabricacão: " + this.getAno());
        System.out.println("Capacidade de passageiros: " + this.getCapacidade());
        System.out.println("Status: " + this.getAtivo());
    }



    //métodos getters
    public int getId(){
        return id;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public int getAtivo(){
        return ativo;
    }

    public int getCapacidade(){
        return capacidade_passageiros;
    }


    //metodos abstratos


}