package Poo;

public class TestaAutomovel1 
{

	public static void main(String[] args) 
	{
		//instanciando um objeto da classe automovel
		
		ExemploAutomovel auto1 = new ExemploAutomovel("Ana Prado", "Jeep","CHA2903",2021);
		auto1.imprimirInfo();
		System.out.println("\n**Mudança de proprietario ");
		auto1.setNomeProprietario("Kevin Leal");
		auto1.imprimirInfo();
		System.out.println("\n------------------------------------------------ ");
		
		ExemploAutomovel auto2 = new ExemploAutomovel("Thais", "Porshe","CHW3603",2010);
		auto2.imprimirInfo();
		System.out.println("\n**Mudança de placa");
		auto2.setPlaca("EHO2S85");
		auto2.imprimirInfo();
		
	}
}
