package br.com.unifacisa.map.composicao;

public class Tripulacao {

  private Long idTripulacao;
  private Pessoa pessoa;

  public Tripulacao(Long idTripulacao, Pessoa pessoa) {
    this.idTripulacao = idTripulacao;
    this.pessoa = pessoa;
  }

  public Long getIdTripulacao() {
    return idTripulacao;
  }

  public void setIdTripulacao(Long idTripulacao) {
    this.idTripulacao = idTripulacao;
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
