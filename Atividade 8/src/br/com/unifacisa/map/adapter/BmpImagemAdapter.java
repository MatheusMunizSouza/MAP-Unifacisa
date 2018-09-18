package br.com.unifacisa.map.adapter;

public class BmpImagemAdapter extends ImagemPNG implements ImagemTarget {
  @Override
  public void carregarImagem(String nomeDoArquivo) {
    pngCarregarImagem(nomeDoArquivo);
  }

  @Override
  public void desenharImagem(int posX, int posY, int largura, int altura) {
    pngDesenharImagem(largura, altura, posX, posY);
  }
}
