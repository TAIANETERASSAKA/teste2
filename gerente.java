import java.util.Scanner;
import java.util.ArrayList;

public class gerente extends usuario {
    private Scanner ler = new Scanner(System.in);  

    ArrayList<voos> listaVoos = new ArrayList<voos>();
    ArrayList<aviao> listaAvioes = new ArrayList<aviao>();
    ArrayList<funcionario> listaFuncionarios = new ArrayList<funcionario>();



    public gerente(long CPF, String email, String nome, int gerenteOUcliente) {
        super(CPF,  email,  nome, gerenteOUcliente);  
    }
    
    @Override
    public void menu(){
        System.out.println("MENU funcionario");
        int respostaGerente;
        do{

            System.out.println("MENU");
            System.out.println("1: Cadastrar avião");
            System.out.println("2: Alterar dados do avião");
            System.out.println("3: Excluir avião");
            System.out.println("4: Cadastrar voo");
            System.out.println("5: Alterar voo");
            System.out.println("6: Excluir voo");
            System.out.println("7: Gerenciar funcionario");
            System.out.println("8: Gerar Relatórios");
            System.out.println("9: Sair");


            respostaGerente = ler.nextInt();

            int repete = 0 ;
            if(respostaGerente == 1 ){
                do{
                    cadastraAviao();
                    System.out.println("Deseja cadastrar mais um avião? Digite 1 para sim e 2 para não");
                    repete = ler.nextInt();
                }while(repete == 1);
            }else if(respostaGerente == 2){
                do{
                    System.out.println("Alterar dados de aviao");
                    System.out.println("Deseja alterar mais um avião? Digite 1 para sim e 2 para não");
                    repete = ler.nextInt();
                }while(repete == 1);
            }else if(respostaGerente == 3){
                do{
                    excluiAviao();
                    System.out.println("Deseja excluir mais um avião? Digite 1 para sim e 2 para não");
                    repete = ler.nextInt();
                }while(repete == 1);
            }else if(respostaGerente == 4){
                do{
                    cadastraVoo();
                    System.out.println("Deseja cadastrar mais um voo? Digite 1 para sim e 2 para não");
                    repete = ler.nextInt();
                }while(repete == 1);
            }else if(respostaGerente == 5){
                do{
                    System.out.println("Alterar dados de voo");
                    System.out.println("Deseja alterar mais um voo? Digite 1 para sim e 2 para não");
                    repete = ler.nextInt();
                }while(repete == 1);

            }else if(respostaGerente == 6){
                do{
                    excluiVoo();
                    System.out.println("Deseja excluir mais um voo? Digite 1 para sim e 2 para não");
                    repete = ler.nextInt();
                }while(repete == 1);

            }else if(respostaGerente == 7){
                do{
                    cadastraFuncionario();
                    System.out.println("Deseja cadastrar mais um funcionario? Digite 1 para sim e 2 para não");
                    repete = ler.nextInt();
                }while(repete == 1);
            }else if(respostaGerente == 8){
                do{
                    geraRelatorio();
                    System.out.println("Deseja gerar mais um relatorio? Digite 1 para sim e 2 para não");
                    repete = ler.nextInt();
                }while(repete == 1);
            }
            }while(respostaGerente != 9);
    }
    
    



    public void cadastraAviao(){
        System.out.println("Informe o id do avião");
        int id_aviao = ler.nextInt();
        System.out.println("Informe o ano de fabricacao avião");
        int ano_aviao = ler.nextInt();
        System.out.println("Informe o capacidade de passageiros do avião");
        int capacidade_aviao_passageiros = ler.nextInt();
        System.out.println("Informe o modelo do avião");
        String modelo_aviao = ler.next();

        aviao a = new aviao(id_aviao, modelo_aviao, ano_aviao, capacidade_aviao_passageiros);
        listaAvioes.add(a);

        a.setRelatorioAviao();
    }

    public void excluiAviao(){
        System.out.println("Excluir aviao");

    }

    public void cadastraVoo(){
        System.out.println("Cadastro de voo");
        System.out.println("Informe o id do voo");
        int id_voo = ler.nextInt();
        System.out.println("Informe o data de saida");
        int time_saida_voo = ler.nextInt();
        System.out.println("Informe o data de chegada");
        int time_chegada_voo = ler.nextInt();
        System.out.println("Informe o origem do voo");
        String origem_voo = ler.next();
        System.out.println("Informe o destino do voo");
        String destino_voo = ler.next();
        System.out.println("Informe o status do voo");
        String status_voo = ler.next();
        System.out.println("Informe o preco da passagem do voo");
        float preco_passagem = ler.nextFloat();

        voos v = new voos(id_voo, destino_voo, origem_voo, status_voo, time_saida_voo, time_chegada_voo, preco_passagem );
        listaVoos.add(v);

        v.setRelatorioVoos();




    }

    public void excluiVoo(){
        System.out.println("exclui Voo");

    }

    public void alteraVoo(int opcao){
        if(opcao == 1 ){
            System.out.println("Altera Ativo");

        }else if (opcao == 2 ){
            System.out.println("Altera Origem");

        }else if (opcao == 3 ){
            System.out.println("Altera Destino");

        }else if(opcao == 4 ){
            System.out.println("Altera data saida");

        }else if(opcao == 5 ){
            System.out.println("Altera data chegada");

        }else if(opcao == 6 ){
            System.out.println("Altera preco da passagem");

        }else if (opcao == 7 ){
            System.out.println("Altera id");

        }

    }

    public void cadastraFuncionario(){
        int gerenteOUcliente_funcionario = 2; 

        System.out.println("Gerenciar funcionario");
        System.out.println("Cadastro de funcionário");
        System.out.println("Informe o CPF do funcionário");
        long cpf_funcionario = ler.nextLong();
        ler.nextLine();
        System.out.println("Informe o nome do funcionário");
        String nome_funcionario = ler.nextLine();
        System.out.println("Informe o email do funcionário");
        String email_funcionario = ler.next();
        System.out.println("Informe o tarefa do funcionário");
        String tarefa = ler.next();

        funcionario f = new funcionario(cpf_funcionario, email_funcionario, nome_funcionario, gerenteOUcliente_funcionario, tarefa);
        listaFuncionarios.add(f);

        f.setRelatorioFuncionario();
    }


    public void geraRelatorio(){
    System.out.println("Relatórios");
    System.out.println("Digite 1: Listar todos os aviões");
    System.out.println("Digite 2: Listar todos os voos");
    System.out.println("Digite 3: Listar todos os funcionários");
    System.out.println("Digite 4: Listar todos os clientes");
        int tipoRelatorio = ler.nextInt();

        if(tipoRelatorio == 1){
                for(aviao av: listaAvioes){
                System.out.println("--------------------------------------------");
                av.setRelatorioAviao();

            }    
        }else if(tipoRelatorio == 2){
                for(voos v: listaVoos){
                System.out.println("--------------------------------------------");
                v.setRelatorioVoos();
            }
        }else if(tipoRelatorio == 3){
            for(funcionario func: listaFuncionarios){
                System.out.println("--------------------------------------------");
                func.setRelatorioFuncionario();
            }

    }

}





}