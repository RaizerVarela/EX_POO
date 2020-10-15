package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestaoFuncionarios {

    private Scanner sc = new Scanner(System.in);
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void criar(int indice) {
        try {
            if (funcionarios.get(indice).getMatricula() != null) {
                System.out.println("Já existe um funcionário cadastrado nesse indíce.");
            } else {
                novoFuncionario(indice);
            }
        } catch (IndexOutOfBoundsException e) {
            novoFuncionario(indice);
        }

    }

    private void novoFuncionario(int indice) {
        Funcionario funcionario = montarFuncioario();
        try {
            funcionarios.add(indice, funcionario);
        } catch (IndexOutOfBoundsException e) {
            for (int i = 0; i < indice; i++) {
                funcionarios.add(i, new Funcionario(null, null, null, 0, null));
            }
        }
        funcionarios.add(indice, funcionario);
        System.out.println("Funcionário Cadastrado com Sucesso!");
        funcionario.exibir();
    }

    private Funcionario montarFuncioario() {

        System.out.println("Digite o nome do funcionário: ");
        String nome = sc.next();

        System.out.println("Digite a matrícula do funcionário: ");
        String matricula = sc.next();

        System.out.println("Digite o Ano, Mês e Dia de Nascimento.");
        LocalDate admissao = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Digite o salário do funcionário");
        double salario = sc.nextDouble();

        System.out.println("Digite o horário de trabalho: MANHÃ, TARDE ou NOITE");
        String horario = sc.next();
        return new Funcionario(nome, matricula, admissao, salario, horario);
    }

    public void atualizar(String matricula) {

        Funcionario filtrado = encontrarFuncionario(matricula);
        if (filtrado != null) {
            subMenuAtualizar(filtrado);
        }
        System.out.println(filtrado != null ? "Usuário atualizado" : "Usuário não encontrado");
    }

    private void subMenuAtualizar(Funcionario filtrado) {
        int opt;
        do {
            System.out.println("Digite o que deseja atualizar: \n" +
                    "[1]Nome(Atual> " + filtrado.getNome() + ")\n" +
                    "[2]Salário(Atual> " + filtrado.getSalario() + ")\n" +
                    "[3]Horário(Atual> " + filtrado.getHorario() + ")\n" +
                    "[4]Demitir\n" +
                    "[9]Sair"
            );
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    atualizarNome(filtrado);
                    break;
                case 2:
                    atualizarSalario(filtrado);
                    break;
                case 3:
                    atualizarHorario(filtrado);
                    break;
                case 4:
                    demitir(filtrado);
                    break;
                case 9:
                    System.out.println("Retornado ao menu anterior");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opt != 9);
    }

    private void demitir(Funcionario funcionario) {
        System.out.println("Digite a data do desligamento(na ordem> ANO, MES, DIA): ");
        funcionario.setDemissao(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    private void atualizarHorario(Funcionario funcionario) {
        System.out.println("Digite o novo horário de trabalho(MANHÃ, TARDE, NOITE)");
        funcionario.setHorario(sc.next());
    }

    private void atualizarSalario(Funcionario funcionario) {
        System.out.println("Digite o nove salário");
        funcionario.setSalario(sc.nextDouble());
    }

    private void atualizarNome(Funcionario funcionario) {
        System.out.println("Digite o novo nome: ");
        funcionario.setNome(sc.next());
    }

    private Funcionario encontrarFuncionario(String matricula) {
        return funcionarios.stream()
                .filter(funcionario -> matricula.equalsIgnoreCase(funcionario.getMatricula()))
                .findFirst()
                .orElse(null);
    }

    public void excluir(String matricula) {
        Funcionario funcionario = encontrarFuncionario(matricula);
        if (funcionario != null) {
            System.out.println("Você deseja remover o funcionário: ");
            funcionario.exibir();
            System.out.println("[S]im // [N]ão");
            String opt = sc.next();
            if (opt.equalsIgnoreCase("S")) {
                funcionarios.removeIf(remover -> remover.equals(funcionario));
            }
            System.out.println(
                    opt.equalsIgnoreCase("S") ?
                            "funcionário removido" :
                            "Funcionário não removido, retornando ao menu anterior"
            );
        }

    }

    public void exibir(String matricula) {
        Funcionario funcionario = encontrarFuncionario(matricula);
        if (funcionario != null) {
            funcionario.exibir();
        }else {
            System.out.println("Funcionário não encontrado");
        }
    }

    public void menu() {
        String opt;
        do {
            System.out.println("Digite a letra em destaque para acessar a opção desejada\n" +
                    "(C)riar\n(E)xibir\n(R)emover\n(A)tualizar\n(S)air");
            opt = sc.next();
            switch (opt.toUpperCase()) {
                case "C":
                    System.out.println("Informe em qual índice deseja criar o funcionário");
                    int indice = sc.nextInt();
                    this.criar(indice);
                    break;
                case "E":
                    System.out.println("Digite a matrícula");
                    this.exibir(sc.next());
                    break;
                case "R":
                    System.out.println("Digite a matrícula");
                    this.excluir(sc.next());
                    break;
                case "A":
                    System.out.println("Digite a matrícula");
                    this.atualizar(sc.next());
                    break;
                case "S":
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (!opt.equalsIgnoreCase("s"));
    }
}