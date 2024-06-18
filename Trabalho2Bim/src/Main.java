import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Garagem garagem = new Garagem();
        Veiculo veiculo1 = new Carro("","",0);
        Veiculo veiculo2 = new Moto("","",0,"");

        int opcao;
        do {
            System.out.println("------ Menu ------");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Listar veículos");
            System.out.println("3. Excluir veículo");
            System.out.println("4. Editar veículo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de veículo:");
                    System.out.println("1. Carro");
                    System.out.println("2. Moto");
                    System.out.print("Opção: ");
                    int tipoVeiculo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoVeiculo == 1) {
                        Carro carro = new Carro("", "", 0);
                        carro.cadastrar(veiculo1);
                        garagem.adicionarVeiculo(carro);
                    } else if (tipoVeiculo == 2) {
                        Moto moto = new Moto("", "", 0, "");
                        moto.cadastrar(veiculo2);
                        garagem.adicionarVeiculo(moto);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    System.out.println("Veículos na garagem:");
                    garagem.listarVeiculos();
                    break;
                case 3:
                    if (!garagem.veiculos.isEmpty()) {
                        System.out.print("Índice do veículo para excluir: ");
                        int indiceExcluir = lerIndice(scanner, garagem.veiculos.size());

                        if (indiceExcluir != -1) {
                            garagem.excluirVeiculo(indiceExcluir);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } else {
                        System.out.println("Não há veículos cadastrados para excluir.");
                    }
                    break;
                case 4:
                    if (!garagem.veiculos.isEmpty()) {
                        System.out.print("Índice do veículo para editar: ");
                        int indiceEditarVeiculo = lerIndice(scanner, garagem.veiculos.size());

                        if (indiceEditarVeiculo != -1) {
                            System.out.println("Escolha o tipo de veículo a editar:");
                            System.out.println("1. Carro");
                            System.out.println("2. Moto");
                            System.out.print("Opção: ");
                            int tipoEdicaoVeiculo = scanner.nextInt();
                            scanner.nextLine();

                            if (tipoEdicaoVeiculo == 1) {
                                Carro novoCarro = new Carro("", "", 0);
                                novoCarro.cadastrar(veiculo1);
                                garagem.editarVeiculo(indiceEditarVeiculo, novoCarro);
                            } else if (tipoEdicaoVeiculo == 2) {
                                Moto novaMoto = new Moto("", "", 0, "");
                                novaMoto.cadastrar(veiculo2);
                                garagem.editarVeiculo(indiceEditarVeiculo, novaMoto);
                            } else {
                                System.out.println("Opção inválida!");
                            }
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } else {
                        System.out.println("Não há veículos cadastrados para editar.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static int lerIndice(Scanner scanner, int tamanhoLista) {
        int indice = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                indice = Integer.parseInt(scanner.nextLine());
                if (indice >= 0 && indice < tamanhoLista) {
                    entradaValida = true;
                } else {
                    System.out.println("Índice fora dos limites. Digite novamente: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido: ");
            }
        }

        return indice;
    }
}
