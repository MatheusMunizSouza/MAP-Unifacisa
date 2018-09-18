package br.com.unifacisa.map.adapter;

public class ImagemBMP {

  public void bmpCarregarImagem(String arquivo) {
    System.out.println("Imagem " + arquivo + " carregada.");
  }

  public void bmpDesenharImagem(int largura, int altura, int posicaoX,
      int posicaoY) {
    System.out.println("Imagem BMP desenhada");
  }
}
