package proxyMethod;

public class Imagem implements Desenhos {


private String imagem;
	
	public Imagem(String imagem) {
		this.imagem = imagem;
		carregandoImagem(imagem);
	}

	@Override
	public void desenha() {
		System.out.println("Desenhando imagem: \n"
				+ "      !!!!!!!!!!!!!!!!!!!!!\r\n"
				+ "    !!!!'                 '!!!!!\r\n"
				+ "  !!!!!'                     '!!!!\r\n"
				+ " !!'                         '!!\r\n"
				+ "!'                              '!\r\n"
				+ "!                                !\r\n"
				+ "!                                !\r\n"
				+ "!                                !\r\n"
				+ "!   &&&&&                &&&&&   !\r\n"
				+ "!  &&@@@&&&            &&&@@@&&  !\r\n"
				+ "!  &&@@@@@&&          &&@@@@@&&  !\r\n"
				+ "!  &&@@@@@@&&        &&@@@@@@&&  !\r\n"
				+ "!_  &&&&@@@@&&      &&@@@@&&&&  _!\r\n"
				+ "*!!_  *&&&@@@&&    &&@@@&&&*   !!*\r\n"
				+ "  !_    *&&&&&*    *&&&&&*   _!*\r\n"
				+ " _!!           _0─0_          !!!_\r\n"
				+ " !!!           00─00         !!!\r\n"
				+ " !!!                          !!!\r\n"
				+ "  *!!  !!-!!  !  !  !  !!-!!  !!*\r\n"
				+ "    *!!!*─!!  !  !  !  !!  !!!!*\r\n"
				+ "     *!*  !!  !  !  !  !!  *!*\r\n"
				+ "        !!  !  !  !  !!\r\n"
				+ "          !!  !  !  !  !!\r\n"
				+ "          !!  !  !  !  !!\r\n"
				+ "          !!  !  !  !  !!\r\n"
				+ "          !!  !  !  !  !!\r\n"
				+ "           !__!__!__!__!\r\n"
				+ "________O_VINGADOR________");
	}
	
	private void carregandoImagem(String imagem) {
		System.out.println("Carregando arquivo " + imagem + " do banco de dados.\n");
	}
	
}
