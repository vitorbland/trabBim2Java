import java.util.Scanner;

public class Moto extends Veiculo {
    private String tipo;

    public Moto(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Moto");
        System.out.print("Marca: ");
        this.marca = scanner.nextLine();
        System.out.print("Modelo: ");
        this.modelo = scanner.nextLine();
        System.out.print("Ano: ");
        this.ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo: ");
        this.tipo = scanner.nextLine();
        System.out.println("Moto cadastrada com sucesso!");
    }

    public void visualizarDetalhes() {
        System.out.println("Detalhes da Moto:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo: " + tipo);
    }
    
    public void listar() {
        System.out.println("Moto: " + marca + " " + modelo + " (" + ano + ")");
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