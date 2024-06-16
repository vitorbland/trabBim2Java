import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garagem {
    List<Veiculo> veiculos;
    List<Pessoa> pessoas;

    public Garagem() {
        veiculos = new ArrayList<>();
        pessoas = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public void listarVeiculos() {
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println(i + ". " + veiculos.get(i).getMarca() + " " + veiculos.get(i).getModelo() + " (" + veiculos.get(i).getAno() + ")");
        }
    }

    public void listarPessoas() {
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(i + ". " + pessoas.get(i).getNome() + " - CPF: " + pessoas.get(i).getClass());
        }
    }

    public void visualizarDetalhesVeiculo(Veiculo veiculo) {
        veiculo.visualizarDetalhes();
    }

    public void visualizarDetalhesPessoa(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Idade: " + pessoa.getIdade());
        // Adicione mais detalhes se necessário
    }

    public void excluirVeiculo(int indice) {
        if (indice >= 0 && indice < veiculos.size()) {
            Veiculo veiculoRemovido = veiculos.remove(indice);
            System.out.println("Veículo removido: " + veiculoRemovido.getMarca() + " " + veiculoRemovido.getModelo());
        } else {
            System.out.println("Índice inválido! Veículo não removido.");
        }
    }

    public void excluirPessoa(int indice) {
        if (indice >= 0 && indice < pessoas.size()) {
            Pessoa pessoaRemovida = pessoas.remove(indice);
            System.out.println("Pessoa removida: " + pessoaRemovida.getNome());
        } else {
            System.out.println("Índice inválido! Pessoa não removida.");
        }
    }

    public void editarVeiculo(int indice, Veiculo novoVeiculo) {
        if (indice >= 0 && indice < veiculos.size()) {
            veiculos.set(indice, novoVeiculo);
            System.out.println("Veículo editado com sucesso!");
        } else {
            System.out.println("Índice inválido! Veículo não editado.");
        }
    }

    public void editarPessoa(int indice, Pessoa novaPessoa) {
        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.set(indice, novaPessoa);
            System.out.println("Pessoa editada com sucesso!");
        } else {
            System.out.println("Índice inválido! Pessoa não editada.");
        }
    }
}