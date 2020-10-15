package controller;

import javax.swing.*;
import java.time.LocalDate;
import java.util.*;

public class GestaoAluno {

    private List<Aluno> alunos = new ArrayList<>();

    public void criar(int indice) {
        try {
            if (alunos.get(indice).getRa() != null) {
                JOptionPane.showMessageDialog(null, "Já existe um aluno cadastrado nesse indice, informe outro indice.", "Indice " + indice + " já possui cadastro (RA: " + alunos.get(indice).getRa() + ")", JOptionPane.ERROR_MESSAGE);
            } else {
                novoAluno(indice);
            }
        } catch (IndexOutOfBoundsException e) {
            novoAluno(indice);
        }
    }

    private void novoAluno(int indice) {
        Aluno aluno = montaAluno();
        try {
            alunos.add(indice, aluno);
        } catch (IndexOutOfBoundsException e2) {
            for (int i = 0; i < indice; i++) {
                alunos.add(i, new Aluno(null, null, null));
            }
        }
        alunos.add(indice, aluno);
        JOptionPane.showMessageDialog(null, "ALUNO CADASTRADO COM SUCESSO\n"
                + "ID: " + aluno.getId()
                + "\nRA: " + aluno.getRa()
                + "\nNome: " + aluno.getNome()
                + "\nData de Nascimento: " + aluno.getNascimento());
    }

    private Aluno montaAluno() {

        String topo = "=====CADASTRO DE ALUNOS=====\n";
        LocalDate dataNasc = LocalDate.now();
        String ra = JOptionPane.showInputDialog(topo + "Informe o RA");
        String nome = JOptionPane.showInputDialog(topo + "Informe o nome completo");

        boolean erro = false;
        try {
            do {
                int dia;
                dia = Integer.parseInt(JOptionPane.showInputDialog(topo + "Informe a data de  nascimento\n" +
                        "DIA"));
                int mes = Integer.parseInt(JOptionPane.showInputDialog(topo + "Informe a data de  nascimento\n" +
                        dia + "/MÊS(apenas números)"));
                int ano = Integer.parseInt(JOptionPane.showInputDialog(topo + "Informe a data de  nascimento\n" +
                        dia + "/" + mes + "/ANO"));
                dataNasc = LocalDate.of(ano, mes, dia);
            } while (erro);

        } catch (Exception e) {
            erro = true;
        }

        return new Aluno(nome, ra, dataNasc);

    }

    private void subMenuAtualizar(Aluno aluno) {
        String opt;
        do {
            opt = JOptionPane.showInputDialog("Digite o número em destaque para acessar a opção desejada" +
                    "\n[1]Para atualizar o nome" +
                    "\n[2]Para atualizar a data de nascimento" +
                    "\n[9]Para voltar ao menu anterior");
            switch (opt) {
                case "1":
                    atualizarNome(aluno);
                    break;
                case "2":
                    atualizarNascimento(aluno);
                    break;
                case "9":
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (!opt.equalsIgnoreCase("9"));

    }

    private void atualizarNascimento(Aluno aluno) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia do nascimento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês do nascimento"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do nascimento"));
        LocalDate dataNasc = LocalDate.of(ano, mes, dia);
        aluno.setNascimento(dataNasc);

        alunoAtualizado(aluno);
    }

    private void atualizarNome(Aluno aluno) {
        String nome = JOptionPane.showInputDialog("informe o nome do Aluno: ");
        aluno.setNome(nome);

        alunoAtualizado(aluno);
    }

    private void alunoAtualizado(Aluno aluno) {
        JOptionPane.showMessageDialog(null, "Nome atualizado!" +
                "\n RA: " + aluno.getRa() +
                "\n ID: " + aluno.getId() +
                "\n Nome: " + aluno.getNome() +
                "\n Nascimeto: " + aluno.getNascimento()
        );
    }

    public void atualizar(String ra) {
        String menssagem;
//        String ra =

        Aluno filtrado = findAluno(ra);

        if (filtrado != null) {
            subMenuAtualizar(filtrado);
        }

        menssagem = filtrado != null ? "Usuário atualizado" : "Usud ário não encontrado";
        JOptionPane.showMessageDialog(null, menssagem);
    }

    public void excluir(String ra) {
        Aluno aluno = findAluno(ra);
        if (aluno == null) {
            System.out.println("Não foi encontrado aluno com RA: " + ra);
        } else {
            int remover;
            remover = JOptionPane.showConfirmDialog(null, "Deseja remover o Aluno" +
                    "\nID: " + aluno.getId() +
                    "\nRA: " + aluno.getRa() +
                    "\nNome: " + aluno.getNome() +
                    "\nData de Nascimento: " + aluno.getNascimento(), "Remover Aluno RA: " + aluno.getRa(), JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (remover == 0) {
                alunos.removeIf(alunoRemover -> alunoRemover.equals(aluno));
                JOptionPane.showMessageDialog(null, "Aluno removido");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno não foi removido, retornando ao menu principal.");
            }
        }
    }

    public void exibir(String ra) {
        Aluno alunoFiltrado = findAluno(ra);
        if (alunoFiltrado != null) {
            alunoFiltrado.exibir();
        } else {
            JOptionPane.showMessageDialog(null, "Aluno nao encontrado");
        }
    }

    private Aluno findAluno(String ra) {
        return alunos.stream()
                .filter(aluno -> ra.equals(aluno.getRa()))
                .findFirst()
                .orElse(null);
    }

    public void menu() {
        String opt;
        do {
            opt = JOptionPane.showInputDialog("Digite a letra em destaque para acessar a opção desejada\n" +
                    "(C)riar\n(E)xibir\n(R)emover\n(A)tualizar\n(S)air");
            switch (opt.toUpperCase()) {
                case "C":
                    int indice = Integer.parseInt(JOptionPane.showInputDialog("Informe em qual índice deseja criar o aluno"));
                    this.criar(indice);
                    break;
                case "E":
                    this.exibir(JOptionPane.showInputDialog("Digite o RA"));
                    break;
                case "R":
                    this.excluir(JOptionPane.showInputDialog("Digite o RA"));
                    break;
                case "A":
                    this.atualizar(JOptionPane.showInputDialog("Digite o RA do aluno"));
                    break;
                case "S":
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida","",JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (!opt.equalsIgnoreCase("s"));
    }
}