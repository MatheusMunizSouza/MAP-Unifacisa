package br.com.unifacisa.map.singleton;

public class Main {

  public static void main(String[] args) {
    Conexao conexao1 = Conexao.getInstance();
    Conexao conexao2 = Conexao.getInstance();

    if (conexao1.equals(conexao2)) {
      System.out.println("É da mesma instância.");
    } else {
      System.out.println("É de instâncias diferentes.");
    }
  }
}
