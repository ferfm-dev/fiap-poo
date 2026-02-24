package br.com.Hyundai.main;
import br.com.Hyundai.model.Carro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.modelo = "hb20";
		carro1.cor = "branco";
		carro1.velocidadeAtual = 0;
		carro1.estaLigado = false;
		
		System.out.println("Informações do Carro 1:");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Cor: " + carro1.cor);
		System.out.println("Velocidade Atual: " + carro1.velocidadeAtual);
		System.out.println("Está ligado: " + carro1.estaLigado);
	}

}
