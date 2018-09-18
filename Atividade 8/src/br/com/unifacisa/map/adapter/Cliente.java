package br.com.unifacisa.map.adapter;

public class Cliente {
  public static void main(String[] args) {


    ImagemTarget imagem = new JpegImagemAdapter();
    imagem.carregarImagem("teste.jpeg");
    imagem.desenharImagem(0, 0, 10, 10);

    imagem = new PngImagemAdapter();
    imagem.carregarImagem("teste.png");
    imagem.desenharImagem(0, 0, 10, 10);

    imagem = new BmpImagemAdapter();
    imagem.carregarImagem("teste.bmp");
    imagem.desenharImagem(0, 0, 10, 10);
  }
}
