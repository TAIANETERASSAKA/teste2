public class passagem{
    private voos voo;
    private cliente dono;
    private String categoria;
    private double preco;
    private boolean ativa;
    
    //METODO CONSTRUTOR
    public passagem(voos voo, String categoria, cliente dono){
        this.voo = voo;
        this.categoria = categoria;
        this.dono = dono ;
        this.ativa = true;
    }
    
    //METODOS PARA RETORNAR E DEFINIR O VOO RESPECTIVO DA PASSAGEM
    public void setVoo(voos v){
        voo = v;
    }
    
    public voos getVoo(){
        return voo;
    }
    
    //METODOS PARA RETORNAR E DEFINIR O DONO DA RESPECTIVA PASSAGEM
    public void setDono(cliente c){
        dono = c;
    }
    
    public cliente getDono(){
        return dono;
    }
    
    //METODOS PARA RETORNAR E DEFINIR PRECO DA PASSAGEM
    public void setPrecoPassagem(){
        if(categoria.equals("A")){
                    //pega a instancia do voo a qual a passagem se refere, e chama o metodo getpreco em cima dele
            preco = getVoo().getPreco_passagem() * 1.5;
        }else if( categoria.equals("B")){
            preco = getVoo().getPreco_passagem() * 1.2;
        }
    }
    
    public double getPrecoPassagem(){
        return preco;
    }
    
    //METODOS PARA RETORNAR E DEFINIR CATEGORIA DA PASSAGEM
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    
    //METODOS PARA RETORNAR E DEFINIR SE A PASSAGEM ESTA ATIVA OU NAO
    public boolean getAtiva(){
        return ativa;
    }
    
    public void setAtiva(voos v){
        if(ativa){
            ativa = false;
        }else{
            ativa = true;
        }
    }
    
    //METODOS PARA EXIBIR PASSAGEM
    public void mostrarPassagem(){
        System.out.println("INFORMA«’ES DA PASSAGEM");
        System.out.println("Titular: " + getDono().getNome());
        System.out.println("ID vo√¥: " + getVoo().getId());
        System.out.println("Origem: " + getVoo().getOrigem());
        System.out.println("Destino: " + getVoo().getDestino());
        System.out.println("Data Saida: " + getVoo().getTime_saida());
        System.out.println("Data Chegada: " + getVoo().getTime_chegada());
        System.out.println("Status voo: " + getVoo().getStatus());
        System.out.println("Pre√ßo: " + getPrecoPassagem());
        System.out.println("Status passagem: " + getAtiva());
    }
    
    
}    