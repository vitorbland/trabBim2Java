import java.util.Scanner;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Carro");
        System.out.print("Marca: ");
        this.marca = scanner.nextLine();
        System.out.print("Modelo: ");
        this.modelo = scanner.nextLine();
        System.out.print("Ano: ");
        this.ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Número de Portas: ");
        this.numPortas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Carro cadastrado com sucesso!");
    }

    public void visualizarDetalhes() {
        System.out.println("Detalhes do Carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Número de Portas: " + numPortas);
    }

    public void listar() {
        System.out.println("Carro: " + marca + " " + modelo +  " (" + ano + ")");
    }

	protected int getMarca() {

		return 0;
	}

	@Override
	int getModelo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getModelo1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getAno() {
		// TODO Auto-generated method stub
		return 0;
	}

}