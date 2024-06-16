import java.util.Scanner;

public class Proprietario extends Pessoa {
    private String cpf;

    public Proprietario(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Proprietário");
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();
        System.out.print("CPF: ");
        this.cpf = scanner.nextLine();
        System.out.println("Proprietário cadastrado com sucesso!");
    }

    @Override
    public void visualizarDetalhes() {
        System.out.println("Detalhes do Proprietário:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

    public void listar() {
        System.out.println("Proprietário: " + nome + " (CPF: " + cpf + ")");
    }

	@Override
	int getNome() {
		// TODO Auto-generated method stub
		return 0;
	}


}