package aula06;

public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume=50;
		this.ligado=false;
		this.tocando=false;
	}

	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);	
	}

	@Override
	public void desligar() {
		this.setLigado(false);	
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? "+this.isLigado());
		System.out.println("Está tocando?"+this.isTocando());
		System.out.print("Volume: "+this.getVolume());
		for(int i = 1; i<=this.getVolume();i+=10) System.out.print("[]");
	}

	@Override
	public void fecharMenu() {
		System.out.print("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume()+5);
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume()-5);
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado()&&this.getVolume()!=0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado()&&this.getVolume()==0) {
			this.setVolume(15);
		}
	}

	@Override
	public void play() {
		if(this.isLigado()&&!(this.isTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if(this.isLigado()&&this.isTocando()) {
			this.setTocando(false);
		}
	}
}
