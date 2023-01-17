import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpi.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Endereco> enderecos = new ArrayList<>();
        ArrayList<AreaCon> areaCons = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao, opcao2, opcao3, opcao4;
        boolean loop2, loop1, loop3 = true;

        while (true) {
            System.out.println("\n B I B L I O T E C A \n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Livros");
            System.out.println("2 - Usuários");
            System.out.println("3 - Empréstimos");
            System.out.println("4 - Sair");
            System.out.print("Sua opção: ");
            // lê a opção do usuário
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    // gerenciamento de livros
                    loop1 = true;
                    while (loop1 == true) {
                        System.out.println("\n|| M E N U   L I V R O S ||");
                        System.out.println("||| LISTA DE OPÇÕES |||");
                        System.out.println("1 | Novo Livro");
                        System.out.println("2 | Listar Livros");
                        System.out.println("3 | Excluir Livros");
                        System.out.println("4 | Alterar Livros");
                        System.out.println("5 | Voltar Menu Anterior");
                        System.out.print("Sua opção: ");
                        // lê a opção do usuário
                        opcao2 = Integer.parseInt(scanner.nextLine());
                        switch (opcao2) {
                            case 1:
                                // Cadastrar Livro
                                System.out.print("\nTema: ");
                                String tema = scanner.nextLine();
                                System.out.print("\nDescrição: ");
                                String descrição = scanner.nextLine();
                                AreaCon areaCon = new AreaCon(tema, descrição);

                                // adicionar no ArrayList de area de conhecimento
                                areaCons.add(areaCon);

                                System.out.print("\nTitulo: ");
                                String titulo = scanner.nextLine();
                                System.out.print("\nAutor: ");
                                String autor = scanner.nextLine();
                                System.out.print("Data da publicação: ");
                                String dataPub = scanner.nextLine();
                                System.out.print("Quantidade de copias: ");
                                int qtdCopias = Integer.parseInt(scanner.nextLine());
                                System.out.print("Identificador 'ID': ");
                                int id = Integer.parseInt(scanner.nextLine());

                                // novo objeto da classe Livros
                                Livro livro = new Livro(titulo, autor, dataPub, qtdCopias, areaCon, id);
                                // adicionar no ArrayList de livros
                                livros.add(livro);
                                System.out.println("\nLivro cadastrado com sucesso");
                                break;

                            case 2: // Listar Livros
                                System.out.println("LIVROS CADASTRADOS");

                                for (Livro liv : livros) {
                                    System.out.println("Nº: " + (livros.lastIndexOf(liv)) + "||" + liv);
                                }
                                System.out.println("Quantidade de livros: " + livros.size());
                                break;

                            case 3: // OPÇÃO REMOVER
                                System.out.println("SELECIONE O Nº'  '  QUE DESEJA EXCLUIR");
                                for (Livro liv : livros) {
                                    System.out.println("Nº: " + (livros.lastIndexOf(liv)) + "||" + liv);
                                }
                                System.out.print("Nº: ");
                                int excluir = Integer.parseInt(scanner.nextLine());
                                livros.remove(excluir); // Remove
                                break;

                            case 4: // OPÇÃO DE ATUALIZAR
                                System.out.println("SELECIONE O Nº' '  QUE DESEJA ATUALIZAR");
                                for (Livro liv : livros) {
                                    System.out.println("Nº: " + (livros.lastIndexOf(liv)) + "||" + liv);
                                }
                                System.out.print("Nº: ");
                                int atualizar = Integer.parseInt(scanner.nextLine());

                                for (AreaCon area : areaCons) {
                                    if (areaCons.lastIndexOf(area) == atualizar) {
                                        System.out.println("Area de conhecimento");
                                        System.out.print("\nTema: ");
                                        String newTema = scanner.nextLine();
                                        System.out.print("\nDescrição: ");
                                        String newDescrição = scanner.nextLine();
                                        area.setTitulo(newTema);
                                        area.setDescricao(newDescrição);
                                    }
                                }
                                for (Livro liv : livros) {
                                    if (livros.lastIndexOf(liv) == atualizar) {
                                        System.out.print("\nTitulo: ");
                                        String newTitulo = scanner.nextLine();
                                        System.out.print("\nAutor: ");
                                        String newAutor = scanner.nextLine();
                                        System.out.print("Data da publicação: ");
                                        String newDataPub = scanner.nextLine();
                                        System.out.print("Quantidade de copias: ");
                                        int newQtdCopias = Integer.parseInt(scanner.nextLine());
                                        System.out.print("Id: ");
                                        int newId = Integer.parseInt(scanner.nextLine());
                                        liv.setTitulo(newTitulo);
                                        liv.setAutor(newAutor);
                                        liv.setDataPub(newDataPub);
                                        liv.setQtdCopias(newQtdCopias);
                                        liv.setId(newId);
                                    }
                                }
                                break;
                            case 5: // Fim do loop
                                loop1 = false;
                                break;
                        }
                    }
                    break;

                case 2: // gerenciamento de usuários
                    loop2 = true;
                    while (loop2 == true) {
                        System.out.println("\n||| M E N U   U S U Á R I O S |||");
                        System.out.println("||| LISTA DE OPÇÕES |||");
                        System.out.println("1 | Novo Usuário");
                        System.out.println("2 | Listar Usuários");
                        System.out.println("3 | Excluir Usuário");
                        System.out.println("4 | Alterar Usuário");
                        System.out.println("5 | Voltar Menu Anterior");
                        System.out.print("Sua opção: ");
                        opcao3 = Integer.parseInt(scanner.nextLine()); // lê a opção do usuário

                        switch (opcao3) {
                            case 1: // Cadastrar um novo usuário
                                System.out.println("\nE N D E R E Ç O"); // ENDEREÇO
                                System.out.print("Cidade: ");
                                String cidade = scanner.nextLine();
                                System.out.print("Bairro: ");
                                String bairro = scanner.nextLine();
                                System.out.print("Rua: ");
                                String rua = scanner.nextLine();
                                System.out.print("Numero: ");
                                int numero = Integer.parseInt(scanner.nextLine());
                                // NOVO OBJETO CLASSE ENDEREÇO
                                Endereco endereco = new Endereco(cidade, bairro, rua, numero);
                                enderecos.add(endereco); // adicionar no ArrayList de enderecos

                                System.out.println("\nD A D O S   P E S S O A I S");// DADOS PESSOAIS
                                System.out.print("Nome: ");
                                String nomeUsuario = scanner.nextLine();
                                System.out.print("Email: ");
                                String email = scanner.nextLine();
                                System.out.print("Data de Nascimento: ");
                                String dataNasc = scanner.nextLine();
                                System.out.print("Identificação Id: ");
                                int id = Integer.parseInt(scanner.nextLine());

                                // novo objeto da classe Usuario
                                Usuario usuario = new Usuario(nomeUsuario, email, dataNasc, endereco, id);
                                usuarios.add(usuario);// adicionar no ArrayList de usuários
                                System.out.println("\nO usuário foi cadastrado com sucesso");
                                break;

                            case 2: // Listar usuarios
                                System.out.println("\nUSUARIOS CADASTRADOS");
                                for (Usuario user : usuarios) {
                                    System.out.println("Nº: " + (usuarios.lastIndexOf(user)) + "||" + user);
                                }
                                System.out.println("Quantidade de Usúarios: " + usuarios.size());
                                break;

                            case 3: // OPÇÃO DE EXCLUIR
                                System.out.println("\nSELECIONE O Nº'  '  QUE DESEJA EXCLUIR");
                                for (Usuario user : usuarios) {
                                    System.out.println("Nº: " + (usuarios.lastIndexOf(user)) + "||" + user);
                                }
                                System.out.print("Nº: ");
                                int excluir2 = Integer.parseInt(scanner.nextLine());
                                usuarios.remove(excluir2); // Remove
                                break;

                            case 4: // Opção de Atualizar

                                System.out.println("\nSELECIONE O Nº' '  QUE DESEJA ATUALIZAR");
                                for (Usuario user : usuarios) {
                                    System.out.println("Nº: " + (usuarios.lastIndexOf(user)) + "||" + user);
                                }
                                System.out.print("Nº: ");
                                int atualizar2 = Integer.parseInt(scanner.nextLine());

                                for (Endereco ende : enderecos) {
                                    if (enderecos.lastIndexOf(ende) == atualizar2) {
                                        System.out.println("\nE N D E R E Ç O");
                                        System.out.print("Cidade: ");
                                        String newCidade = scanner.nextLine();
                                        ende.setCidade(newCidade);
                                        System.out.print("\nBairro: ");
                                        String newBairro = scanner.nextLine();
                                        ende.setBairro(newBairro);
                                        System.out.print("Rua: ");
                                        String newRua = scanner.nextLine();
                                        ende.setRua(newRua);
                                        System.out.print("Numero: ");
                                        int newNumero = Integer.parseInt(scanner.nextLine());
                                        ende.setNumero(newNumero);
                                    }
                                }
                                for (Usuario user : usuarios) {
                                    if (usuarios.lastIndexOf(user) == atualizar2) {
                                        System.out.println("\nD A D O S   P E S S O A I S");
                                        System.out.print("Nome: ");
                                        String newNomeUsuario = scanner.nextLine();
                                        System.out.print("Email: ");
                                        String newEmail = scanner.nextLine();
                                        System.out.print("Data de Nascimento: ");
                                        String newDataNasc = scanner.nextLine();
                                        System.out.print("Id: ");
                                        int newid = Integer.parseInt(scanner.nextLine());
                                        user.setNome(newNomeUsuario);
                                        user.setEmail(newEmail);
                                        user.setDataNasc(newDataNasc);
                                        user.setId(newid);
                                    }
                                }
                                break;

                            case 5: // Fim do loop
                                loop2 = false;
                                break;
                        }
                    }
                    break;

                case 3: // Gerenciamento de emprestimos
                    System.out.println("\n||| M E N U   E M P R E S T I M O |||");
                    System.out.println("||| LISTA DE OPÇÕES |||");
                    System.out.println("1 | Login");
                    System.out.println("2 | Voltar Menu Anterior");
                    System.out.print("Sua opção: ");
                    opcao4 = Integer.parseInt(scanner.nextLine()); // lê a opção do usuário
                    switch (opcao4) {
                        case 1:
                            loop3 = true;
                            while (loop3 == true) {
                                System.out.print("\nInforme o ID do usuário: ");
                                int pesquisaUsuario = Integer.parseInt(scanner.nextLine());

                                for (Usuario user : usuarios) {
                                    if (user.getId() == pesquisaUsuario) {
                                        System.out.println("\n Perfil: " + user.getNome());
                                        System.out.println("LIVROS DISPONIVEIS");

                                        for (Livro liv : livros) {
                                            System.out.println("Nº: " + (livros.lastIndexOf(liv)) + "||" + liv);
                                        }
                                        System.out.println("Quantidade de livros : " + livros.size());
                                        System.out.print("Informe o 'ID' do livro que deseja: ");
                                        int livroEscolhido = Integer.parseInt(scanner.nextLine());

                                        for (Livro liv : livros) {
                                            if (liv.getId() == livroEscolhido) {

                                                Emprestimo emprestimo = new Emprestimo("17/01/2023","28/02/2023", liv, user);
                                                System.out.println(emprestimo.toString());
                                            }else {
                                                System.out.println("Id inválido");
                                            }
                                            
                                        }

                                    } else {
                                        System.out.println("Usuario inválido");
                                    }
                                    break;
                                }
                                break;
                            }
                        case 2:
                            loop3 = false;
                            break;
                    }

                    break;

                case 4: // Encerra o sistema
                    System.out.println("\nSistema de Biblioteca Encerrado\n");
                    System.exit(0);
            }
        }
    }
}