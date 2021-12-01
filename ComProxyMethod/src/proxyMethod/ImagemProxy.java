package proxyMethod;

public class ImagemProxy implements Desenhos {

	private Imagem Imagem;
	private String Arquivonome = "VINGADOR";
	
	public ImagemProxy(String nomeArquivo){
		this.Arquivonome = nomeArquivo;
	}
	
	@Override
	public void desenha() {
		if(Imagem == null) {
			System.out.println("\nImagem n�o existe... Criando Imagem...\n");
			Imagem = new Imagem(Arquivonome);
		}else{
			System.out.println("\nRecuperando Imagem " + Arquivonome + " criada anteriormente...\n");
		}
		
		Imagem.desenha();
	}


}
