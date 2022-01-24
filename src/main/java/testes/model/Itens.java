package testes.model;

public class Itens {
	
	private double numero1;
	private double numero2;
	private double numero3;
	private double numero4;
	
	public Itens(double numero1, double numero2, double numero3, double numero4) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		this.numero4 = numero4;
	}
	
	
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	public double getNumero3() {
		return numero3;
	}
	public void setNumero3(double numero3) {
		this.numero3 = numero3;
	}
	public double getNumero4() {
		return numero4;
	}
	public void setNumero4(double numero4) {
		this.numero4 = numero4;
	}



	public double CalculaMedia(double n1, double n2, double n3, double n4 ){
		double media = (n1 + n2 + n3 + n4) /4;
		return media;
	}
	
	public boolean Resultado(double notas){
		if (notas >= 5){
			return true;
		} return false;
		
	}
	
}
