public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void cadastrar();
    public abstract void listar();
    public abstract void visualizarDetalhes();

	protected abstract int getMarca();

	abstract int getModelo();

	protected abstract int getModelo1();

	protected abstract int getAno();
}