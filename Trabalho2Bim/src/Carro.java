import java.util.Scanner;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void cadastrar(Veiculo veiculo1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Carro");
        System.out.print("Marca: ");
        veiculo1.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        veiculo1.setModelo(scanner.nextLine());
        System.out.print("Ano: ");
        veiculo1.setAno(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Número de Portas: ");
        setNumPortas(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Carro cadastrado com sucesso!");
    }

    public void visualizarDetalhes(Carro veiculo1) {
        System.out.println("Detalhes do Carro:");
        System.out.println("Marca: " + veiculo1.getMarca());
        System.out.println("Modelo: " +  veiculo1.getModelo());
        System.out.println("Ano: " + veiculo1.getAno());
        System.out.println("Número de Portas: " + getNumPortas());
    }

    public void listar(Carro veiculo1) {
        System.out.println("Carro: " + veiculo1.getMarca() + " " + veiculo1.getModelo() + " " + veiculo1.getAno());
    }

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

}
