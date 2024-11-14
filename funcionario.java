import java.util.ArrayList;

public class funcionario extends usuario{
    private String tarefa;
    //private ArrayList voos_designados;

    //métodos construtores
    public funcionario( long CPF, String email, String nome, int gerenteOUcliente, String tarefa){
        super(CPF, email, nome, gerenteOUcliente);
        this.tarefa = tarefa;
       // this.voos_designados = null;

    }
    
    public void menu (){
        System.out.println("MENU funcionario");
    }


    public void setTarefa(String tarefa){
        this.tarefa = tarefa;
    }

    public void setRelatorioFuncionario(){
        System.out.println("Nome: " + this.getNome() );
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Tarefa: " + this.getTarefa());
        System.out.println("Permissão: " + this.getPermissao());
    }


    public String getTarefa(){
        return tarefa;
    }


    //public void setVoos_designados(voo voos, boolean permissao){
    //    if(permissao=true){
    //        voos_designados.add(voos);
    //    }
    //}

    //public String getVoos_designados((){
    //    return voos_designados;
    //}


}