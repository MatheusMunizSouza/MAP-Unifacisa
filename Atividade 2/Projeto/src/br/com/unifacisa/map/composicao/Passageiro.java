package br.com.unifacisa.map.composicao;

public class Passageiro {

  private Long numeroSmile;
  private Pessoa pessoa;

  public Passageiro(Long numeroSmile, Pessoa pessoa) {
    this.numeroSmile = numeroSmile;
    this.pessoa = pessoa;
  }

  public Long getNumeroSmile() {
    return numeroSmile;
  }

  public void setNumeroSmile(Long numeroSmile) {
    this.numeroSmile = numeroSmile;
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
