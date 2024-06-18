import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garagem {
	ArrayList<Veiculo> veiculos=new ArrayList<>();


    public Garagem() {
        veiculos = new ArrayList<>();
  
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }

    public void listarVeiculos() {
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println(i + ". " + veiculos.get(i).getMarca() + " " + veiculos.get(i).getModelo() + " (" + veiculos.get(i).getAno() + ")");
        }
    }

    public void excluirVeiculo(int indice) {
        if (indice >= 0 && indice < veiculos.size()) {
            Veiculo veiculoRemovido = veiculos.remove(indice);
            System.out.println("Veículo removido: " + veiculoRemovido.getMarca() + " " + veiculoRemovido.getModelo());
        } else {
            System.out.println("Índice inválido! Veículo não removido.");
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

}
