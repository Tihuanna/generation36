package Poo;

public class ExAviao {
//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.
	private String modelo;
	private String marca;
	private String cor;
	private double velocidadeMax;
	
	public ExAviao (String modelo,String marca,String cor,int velocidadeMax)
	{
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.velocidadeMax =velocidadeMax;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("Avi�o do modelo "+modelo+" da companhia "+marca+" ele vem na cor "+cor+" e atinge a velocidade maxima de: "+velocidadeMax+" Km/h");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
	
	

}
