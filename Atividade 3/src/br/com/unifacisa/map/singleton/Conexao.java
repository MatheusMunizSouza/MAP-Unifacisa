package br.com.unifacisa.map.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Atividade: Aplique o padrão Singleton na classe abaixo.
 *
 **/
public final class Conexao {

  private static Conexao conexao = null;
  public Connection con = null;

  private Conexao () {
  }

  public void Conectar() {
    System.out.println("Conectando ao banco...");
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/banco","usuario","senha");
      System.out.println("Conectado.");
    } catch(SQLException | ClassNotFoundException e) {
      System.out.println(e);
      throw new RuntimeException(e);
    }
  }

  public synchronized static Conexao getInstance() {
    if (conexao == null) {
      conexao = new Conexao();
    }

    return conexao;
  }
}