package br.com.unifacisa.map.adapter;

public class ImagemPNG {

  public void pngCarregarImagem(String arquivo) {
    System.out.println("Imagem " + arquivo + " carregada.");
  }

  public void pngDesenharImagem(int largura, int altura, int posicaoX,
      int posicaoY) {
    System.out.println("Imagem PNG desenhada");
  }
}