public abstract class Pessoa {
    protected String nome;
    private String cpf;
    private int idade;

    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void cadastrar();
    public abstract void listar();
    public abstract void visualizarDetalhes();

	abstract int getNome();
}