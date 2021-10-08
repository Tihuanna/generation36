package Poo;

public class TestaEmpregado {

	public static void main(String[] args) {
		
		ExemploEmpregado[] lista = new ExemploEmpregado [3];
		int x;
		
		lista[0] = new ExemploEmpregado("Kevin Sousa", 12000);
		lista[1] = new ExemploEmpregado("Juliana Macedo", 6000);
		lista[2] = new ExemploEmpregado ("Luis Roberto", 30000);
		
		for(ExemploEmpregado roda:lista)
		{
			roda.imprimir();
		}
		System.out.println("***************************");
		for(ExemploEmpregado roda:lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
		
	}

}
