package br.com.unifacisa.map.composicao;

public class Main {

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    Tripulacao tripulacao = new Tripulacao(1L, pessoa1);
    tripulacao.setEndereco("Endereço do tripulante");
    tripulacao.setNome("Tripulante");

    System.out.println(tripulacao.getNome());

    Pessoa pessoa2 = new Pessoa();
    Passageiro passageiro = new Passageiro(1L, pessoa2);
    passageiro.setEndereco("Endereço do passageiro");
    passageiro.setNome("Passageiro");

    System.out.println(passageiro.getNome());

    Pessoa pessoa3 = new Pessoa();
    Agente agente = new Agente(1L, pessoa3);
    agente.setEndereco("Endereço do agente");
    agente.setNome("Agente");

    System.out.println(agente.getNome());

  }
}
