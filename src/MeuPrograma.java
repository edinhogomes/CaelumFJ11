
public class MeuPrograma {

	public static void main (String[] args) {

		//GeraPDF gerapdf = new GeraPDF();
		//Thread threadDoPdf = new Thread(gerapdf);
		//threadDoPdf.start();
		GeraPDF gera = new GeraPDF();
	
		gera.start();

		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		Thread threadDaBarra = new Thread(barraDeProgresso);
		threadDaBarra.start();
		
		//threadDaBarra.sleep(3 * 1000);

	}
}

