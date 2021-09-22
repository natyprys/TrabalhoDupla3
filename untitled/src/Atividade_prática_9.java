import java.util.Scanner;

public class Atividade_prática_9 {
    static Scanner sc = new Scanner(System.in);
    static short opcao, tipoAplicacao, tipoSenioridade;
    static int idade = 0;
    static String nome="", nomeDev = "", sobrenome = "", senioridade = "", nomeLinguagem = "", descricao = "", aplicacao = "";

    public static void main(String args[]) {
        cabecalho();
        imprime_menu();
        escolha_menu();
    }

    static void cabecalho() {
        System.out.println(" -------------------- Cadastro de devs -----------------------");
    }

    static void imprime_menu() {
        System.out.println("Escolha uma das opções: \n1. Cadastrar Dev \n2. Cadastrar linguagem \n3. Sair");
    }


    static void escolha_menu() {
        opcao = sc.nextShort();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Cadastro de DEV");
                nomeDev();
                sobrenome();
                senioridade();
                idade();
                System.out.printf("Cadastro realizado com sucesso \nO nome  informado foi: %s \nO sobrenome informado foi: %s \nA senioridade informada foi: %s \nA idade informada foi: %d", nomeDev, sobrenome, senioridade, idade);
                break;

            case 2:
                System.out.println("Cadastro de Linguagem");
                nomeLinguagem();
                descricao();
                aplicacao();
                System.out.printf("\nCadastro realizado com sucesso \nO nome  informado foi: %s \nA descrição informada foi: %s \nA aplicação informada foi: %s \n ", nomeLinguagem, descricao, aplicacao);
                break;

            case 3:
                System.out.println("Aplicação finaliza. Sair");
                break;

            default:
                System.out.println("Opção inválida. Digite novamente");
                break;
        }
    }

     static String validaNome (){
        do {
            System.out.print("Digite:  ");
            nome = sc.nextLine();

            if (nome.length() < 3) {
                System.out.println("Valor inválido. O nome deve ter no mínimo 3 caracteres. Digite novamente");
            }
        } while (nome.length() < 3);
        return nome;
    }


    static void nomeDev() {
        System.out.println("Nessa opção você deve digitar o nome do Dev");
        nomeDev = validaNome();
    }


    static void sobrenome() {
        System.out.println("Nessa opção você deve digitar o sobrenome do Dev");
        sobrenome = validaNome();
    }

    static void senioridade() {
        imprime_senioridade();
        escolha_senioridade();
    }

    static void imprime_senioridade() {
        System.out.print("Informe o tipo de senioridade: 1. Junior; 2. Pleno; 3. Senior; 4. Master ");
    }

    static void   escolha_senioridade() {
        tipoSenioridade = sc.nextShort();
            sc.nextLine();
            switch (tipoSenioridade) {
                case 1:
                    senioridade = "Junior";
                    break;
                case 2:
                    senioridade = "Pleno";
                    break;
                case 3:
                    senioridade = "Senior";
                    break;
                case 4:
                    senioridade = "Master";
                    break;

                default:
                    System.out.println("Tipo de aplicação inválida. Digite novamente");
            }while (tipoSenioridade < 1 || tipoSenioridade > 4);
    }

    static void idade(){
        do {
            System.out.print("Digite a idade do novo DEV:  ");
            idade = sc.nextInt();
            sc.nextLine();

            if (idade <= 0) {
                System.out.println("Valor inválido. A idade do DEV ter não pode ser negativa. Digite novamente");
            }
        } while(idade <= 0);
    }

    static void nomeLinguagem(){
        System.out.println("Nessa opção você deve digitar o Nome da linguagem");
        nomeLinguagem = validaNome();
    }

    static void descricao() {
        System.out.println("Nessa opção você deve digitar a descrição da linguagem");
        descricao = validaNome();
    }

    static void  aplicacao(){
        imprime_aplicacao();
        escolha_aplicacao();
    }


    static void imprime_aplicacao() {
        System.out.print("Informe o tipo da aplicação: 1. Frontend; 2. Backend; 3. Mobile");
    }

    static void escolha_aplicacao() {

        tipoAplicacao = sc.nextShort();
        sc.nextLine();

        switch (tipoAplicacao) {
            case 1:
                aplicacao = "Frontend";
                break;
            case 2:
                aplicacao = "Backend";
                break;
            case 3:
                aplicacao = "Mobile";
                break;
            default:
                System.out.println("Tipo de aplicação inválida. Digite novamente");
        }while (tipoAplicacao < 1 || tipoAplicacao > 3);
    }

}












