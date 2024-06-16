import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garagem garagem = new Garagem();

        int opcao;
        do {
            System.out.println("------ Menu ------");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Listar veículos");
            System.out.println("3. Visualizar detalhes de um veículo");
            System.out.println("4. Excluir veículo");
            System.out.println("5. Editar veículo");
            System.out.println("6. Listar pessoas (proprietários)");
            System.out.println("7. Visualizar detalhes de uma pessoa");
            System.out.println("8. Excluir pessoa");
            System.out.println("9. Editar pessoa");
            System.out.println("10. Sair");
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
                        Carro carro = new Carro("", "", 0, 0);
                        carro.cadastrar();
                        garagem.adicionarVeiculo(carro);
                    } else if (tipoVeiculo == 2) {
                        Moto moto = new Moto("", "", 0, "");
                        moto.cadastrar();
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
                        System.out.print("Índice do veículo para visualizar detalhes: ");
                        int indiceVeiculo = lerIndice(scanner, garagem.veiculos.size());

                        if (indiceVeiculo != -1) {
                            Veiculo veiculoSelecionado = garagem.veiculos.get(indiceVeiculo);
                            garagem.visualizarDetalhesVeiculo(veiculoSelecionado);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } else {
                        System.out.println("Não há veículos cadastrados na garagem.");
                    }
                    break;
                case 4:
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
                case 5:
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
                                Carro novoCarro = new Carro("", "", 0, 0);
                                novoCarro.cadastrar();
                                garagem.editarVeiculo(indiceEditarVeiculo, novoCarro);
                            } else if (tipoEdicaoVeiculo == 2) {
                                Moto novaMoto = new Moto("", "", 0, "");
                                novaMoto.cadastrar();
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
                case 6:
                    System.out.println("Pessoas (proprietários) na garagem:");
                    garagem.listarPessoas();
                    break;
                case 7:
                    if (!garagem.pessoas.isEmpty()) {
                        System.out.print("Índice da pessoa para visualizar detalhes: ");
                        int indicePessoa = lerIndice(scanner, garagem.pessoas.size());

                        if (indicePessoa != -1) {
                            Pessoa pessoaSelecionada = garagem.pessoas.get(indicePessoa);
                            garagem.visualizarDetalhesPessoa(pessoaSelecionada);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } else {
                        System.out.println("Não há pessoas cadastradas na garagem.");
                    }
                    break;
                case 8:
                    if (!garagem.pessoas.isEmpty()) {
                        System.out.print("Índice da pessoa para excluir: ");
                        int indiceExcluirPessoa = lerIndice(scanner, garagem.pessoas.size());

                        if (indiceExcluirPessoa != -1) {
                            garagem.excluirPessoa(indiceExcluirPessoa);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } else {
                        System.out.println("Não há pessoas cadastradas para excluir.");
                    }
                    break;
                case 9:
                    if (!garagem.pessoas.isEmpty()) {
                        System.out.print("Índice da pessoa para editar: ");
                        int indiceEditarPessoa = lerIndice(scanner, garagem.pessoas.size());

                        if (indiceEditarPessoa != -1) {
                        	
                            Pessoa novaPessoa = new Pessoa("","",0);
                            novaPessoa.cadastrar();
                            garagem.editarPessoa(indiceEditarPessoa, novaPessoa);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    } else {
                        System.out.println("Não há pessoas cadastradas para editar.");
                    }
                    break;
                case 10:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (opcao != 10);

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