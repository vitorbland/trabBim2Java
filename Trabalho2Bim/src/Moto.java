import java.util.Scanner;

public class Moto extends Veiculo {
    private String tipo;
    
    public Moto(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    public void cadastrar(Veiculo veiculo2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Moto");
        System.out.print("Marca: ");
        veiculo2.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        veiculo2.setModelo(scanner.nextLine());
        System.out.print("Ano: ");
        veiculo2.setAno(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Tipo: ");
        setTipo(scanner.nextLine());
        System.out.println("Moto cadastrada com sucesso!");
    }

    public void visualizarDetalhes(Moto veiculo2) {
        System.out.println("Detalhes da Moto:");
        System.out.println("Marca: " + veiculo2.getMarca());
        System.out.println("Modelo: " +  veiculo2.getModelo());
        System.out.println("Ano: " + veiculo2.getAno());
        System.out.println("Tipo: " + getTipo());
    }
    
    public void listar(Moto veiculo2) {
        System.out.println("Moto: " + veiculo2.getMarca() + " " + veiculo2.getModelo() + " " + veiculo2.getAno());
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
