package br.com.unifacisa.map.composicao;

public class Agente {

  private Long idAgente;
  private Pessoa pessoa;

  public Agente(Long idAgente, Pessoa pessoa) {
    this.idAgente = idAgente;
    this.pessoa = pessoa;
  }

  public Long getIdAgente() {
    return idAgente;
  }

  public void setIdAgente(Long idAgente) {
    this.idAgente = idAgente;
  }

  public String getNome() {
    return this.pessoa.getNome();
  }

  public void setNome(String nome) {
    this.pessoa.setNome(nome);
  }

  public String getEndereco() {
    return this.pessoa.getEndereco();
  }

  public void setEndereco(String endereco) {
    this.pessoa.setEndereco(endereco);
  }
}
