package controller;

public class OperacoesController {

	public OperacoesController(){
		super();
	}

	//Concatena 32768 caracteres, 1 a 1, em uma variável String
	public void concatenaString(){
		String cadeia = "";
		double tempoInicial = System.nanoTime(); // <ctrl + 1> aparece a opção do sistema criar uma variavel para vc
		for (int i = 0; i < 32768; i++){
			cadeia = cadeia + "a";
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;

		//tempoTotal nano segundos é 10^-9 segundos
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String -> " + tempoTotal + "s.");
	}

	//Concatena 32768 caracteres, 1 a 1, em um buffer de Strings
	public void concatenaBuffer(){
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime(); // <ctrl + 1> aparece a opção do sistema criar uma variavel para vc
		for (int i = 0; i < 100000; i++){
			buffer.append("a");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;

		//tempoTotal nano segundos é 10^-9 segundos
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer -> " + tempoTotal + "s.");
	}

	//Recebe uma frase, divide em palavras, imprime cada palavra
	public void divideFrase(String frase){
		String[] vetorPalavras = frase.split(" ");
		//int length = vetorPalavras.length;
		//for(int i = 0; i < length; i++) {}
		//foreach - for (TipoDado var : vetor)
		for (String palavra : vetorPalavras){
			System.out.println(palavra);
		}

	}
}

