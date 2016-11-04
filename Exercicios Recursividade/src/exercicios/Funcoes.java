package exercicios;

public class Funcoes {
	
	
	//Calcula o produto através de somas sucessivas;
	public static int multiPorSoma(int n1, int n2){
		if (n1<1 || n2<1)
			return 0;
		else if (n2==1)
			return n1;
		else 
			return n1+(multiPorSoma(n1, n2-1));
	}
	
	//A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.
	
	public static int somaVetor(int[] v, int cont){
		int s=0;
		if(v.length-1==cont)
			return v[cont];
		else {
			s = somaVetor(v, cont+1);
			s+= v[cont];
			return s;
		}
	}
	
	public static int multiplicaVetor(int[] v, int cont){
		int s=1;
		if(v.length-1==cont)
			return v[cont];
		else {
			s = multiplicaVetor(v, cont+1);
			s*=v[cont];
			return s;
		}
	}
	
	/*
	 * Faça uma função recursiva que calcule e retorne o N-ésimo termo da sequência Fibonacci. 
	 * Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
	*/
	
	public static int fibonacci(int num){
		if (num<=2)
			return 1;
		else
			return fibonacci(num-1)+fibonacci(num-2);
	}
	
	/*
	 * Escreva uma função recursiva que determine quantas vezes um dígito K ocorre em um número natural N. 
	 * Por exemplo, o dígito 2 ocorre 3 vezes em 762021192.
	*/
	
	public static int frequenciaDigito(int num, int k, int cont){
		if ( num==0)
			return cont;
		else {
			if (num%10==k)
				cont++;
			num=num/10;
			return frequenciaDigito(num, k, cont);
		}
	}
}
