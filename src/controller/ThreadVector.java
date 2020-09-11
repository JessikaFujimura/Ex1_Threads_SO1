package controller;

/*Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um valor numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para percorrer o vetor.  Caso o valor numérico seja ímpar, a thread deve percorrer o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No final, ambas as possibilidades devem apresentar o tempo em segundos.
A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a 100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, passar o número 2 e o mesmo vetor.
*/

public class ThreadVector extends Thread{
	
	private int valor;
	private int[] group;
	
	public ThreadVector(int valor, int[] group){
		this.valor = valor;
		this.group = group;
	}
	
	@Override
	public void run() {
		int result = valor%2;
		if(result == 0){
			par();
		}
		else {
			impar();
		}
		
	}
	
	private void par(){
		double tempoInicial = System.nanoTime();
		int soma = 0;
		for (int i = 0 ; i < group.length; i++){
			soma += group[i];
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo de processamento for: " + tempoTotal + " segundos");
	}
	
	private void impar(){
		double tempoInicial = System.nanoTime();
		int soma = 0;
		for (int i: group){
			soma += group[i];
		}
		double tempoFinal = System.nanoTime() ;
		double tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo de processamento foreach: " + tempoTotal + " segundos");
		
	}
	
	
}
