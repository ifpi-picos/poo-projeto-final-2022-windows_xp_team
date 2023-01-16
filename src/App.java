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
        int opcao, opcao2, opcao3, qtdLivros = 0;
        boolean loop2, loop1 = true;
        qtdLivros = livros.size();

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
                        System.out.println("\n|| M E N U   L I V R O S ||\n");
                        System.out.println("|Digite a opção desejada|");
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
                                System.out.println("Area de conhecimento");
                                System.out.print("\nTema: ");
                                String tema = scanner.nextLine();
                                System.out.print("\nDescrição: ");
                                String descrição = scanner.nextLine();
                                AreaCon areaCon = new AreaCon(tema, descrição);

                                System.out.print("\nTitulo: ");
                                String titulo = scanner.nextLine();
                                System.out.print("\nAutor: ");
                                String autor = scanner.nextLine();
                                System.out.print("Data da publicação: ");
                                String dataPub = scanner.nextLine();
                                System.out.print("Quantidade de copias: ");
                                int qtdCopias = Integer.parseInt(scanner.nextLine());

                                // novo objeto da classe Usuario
                                Livro livro = new Livro(titulo, autor, dataPub, qtdCopias, areaCon, qtdLivros);
                                // adicionar no ArrayList de usuários
                                livros.add(livro);
                                qtdLivros = (livros.size());
                                livro.setQtdLivros(qtdLivros);

                                System.out.println("\nLivro cadastrado com sucesso");
                                break;

                            case 2:
                                // Listar Livros
                                System.out.println("LIVROS CADASTRADOS");
                                qtdLivros = (livros.size());
                                for (Livro liv : livros) {
                                    System.out.println(liv);
                                    
                                    
                                }
                                break;

                            // PAREI AQUIII ADICIONAR A OÇÃO REMOVER
                            case 3:

                                System.out.println("SELECIONE O Nº'0'  QUE DESEJA EXCLUIR");
                                for (Livro liv : livros) {
                                    qtdLivros = (livros.size());
                                    System.out.println(liv);
                                }
                                System.out.print("Nº: ");
                                int delete0 = Integer.parseInt(scanner.nextLine());
                                livros.remove(delete0);
                                qtdLivros = (livros.size());
                                System.out.println("LIVROS ATUALIZADOS");
                                for (Livro liv : livros) {

                                    System.out.println(liv);
                                }
                                break;

                            case 4:
                                System.out.println("SELECIONE O Nº'0'  QUE DESEJA ATUALIZAR");

                                break;

                            case 5:
                                loop1 = false;
                                break;
                        }
                    }
                    break;

                case 2:
                    // gerenciamento de usuários
                    loop2 = true;
                    while (loop2 == true) {
                        System.out.println("\n|| M E N U   U S U Á R I O S ||\n");
                        System.out.println("|Digite a opção desejada|");
                        System.out.println("1 | Novo Usuário");
                        System.out.println("2 | Listar Usuários");
                        System.out.println("3 | Excluir Usuário");
                        System.out.println("4 | Alterar Usuário");
                        System.out.println("5 | Voltar Menu Anterior");
                        System.out.print("Sua opção: ");
                        // lê a opção do usuário
                        opcao3 = Integer.parseInt(scanner.nextLine());

                        switch (opcao3) {
                            case 1:
                                // Cadastrar um novo usuário
                                // ENDEREÇO
                                System.out.print("\nCidade: ");
                                String cidade = scanner.nextLine();
                                System.out.print("\nBairro: ");
                                String bairro = scanner.nextLine();
                                System.out.print("Rua: ");
                                String rua = scanner.nextLine();
                                System.out.print("Numero: ");
                                int numero = Integer.parseInt(scanner.nextLine());
                                Endereco endereco = new Endereco(cidade, bairro, rua, numero);
                                // DADOS PESSOAIS
                                System.out.print("\nNome: ");
                                String nomeUsuario = scanner.nextLine();
                                System.out.print("\nEmail: ");
                                String email = scanner.nextLine();
                                System.out.print("Data de Nascimento: ");
                                String dataNasc = scanner.nextLine();

                                // novo objeto da classe Usuario
                                Usuario usuario = new Usuario(nomeUsuario, email, dataNasc, endereco, 0);
                                // adicionar no ArrayList de usuários
                                usuarios.add(usuario);
                                usuario.setQtdUsuarios(usuarios.size());

                                System.out.println("\nO usuário foi cadastrado com sucesso");
                                break;

                            case 2:
                                // Listar usuarios
                                System.out.println("USUARIOS CADASTRADOS");
                                for (Usuario user : usuarios) {
                                    System.out.println(user);
                                }
                                break;

                            // PAREI AQUIII ADICIONAR A OÇÃO REMOVER
                            case 3:
                                System.out.println("SELECIONE O Nº'0'  QUE DESEJA EXCLUIR");
                                for (Usuario user : usuarios) {
                                    System.out.println(user);
                                }
                                System.out.print("Nº: ");
                                int delete = Integer.parseInt(scanner.nextLine());
                                usuarios.remove(delete);

                                System.out.println("USUARIOS ATUALIZADOS");
                                for (Usuario user : usuarios) {
                                    user.setQtdUsuarios(usuarios.size());
                                    System.out.println(user);
                                }
                                break;

                            case 4:
                                System.out.println("SELECIONE O Nº'0'  QUE DESEJA ATUALIZAR");
                                for (Usuario user : usuarios) {
                                    System.out.println(user);
                                }

                                break;

                            case 5:
                                loop2 = false;
                                break;
                        }
                    }

                case 3:
                    // chama o menu de gerenciamento de emprestimos

                    break;

                case 4:
                    System.out.println("\nObrigado por usar o Sistema de Biblioteca\n");
                    System.exit(0);
            }
        }
    }
}