public abstract class usuario{
    protected long CPF;
    protected String email ;
    protected String nome;
    protected boolean permissao;
    protected boolean is_funcionario;

    //m√©todos construtores
    public usuario(long CPF, String email, String nome, int gerenteOUcliente){
        this.CPF = CPF;
        this.email = email;
        this.nome = nome;
        if(gerenteOUcliente == 1){
            this.permissao = true;
            this.is_funcionario = false;
        }else if(gerenteOUcliente == 2){
            this.permissao = false;
            this.is_funcionario = false;
        }else{
            this.is_funcionario = true;
        }

        if(nome.length()<4){
            throw new RuntimeException ("Nome deve ter no mÌnimo 3 caracteres");
        }
    }

    //mÈtodos getters
    public boolean getIs_funcionario(){
        return is_funcionario;
    }

    public long getCPF(){
        return CPF;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public boolean getPermissao(){
        return permissao;
    }

    //mÈtodos setters
    public void setEmail(String email){
        this.email = email;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void setCPF(long CPF){
        this.CPF = CPF;
    }    


    //mÈtodos abstratos
    public abstract void menu();
    
}