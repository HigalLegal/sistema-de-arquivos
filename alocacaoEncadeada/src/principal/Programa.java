package principal;

import java.util.Scanner;

import utils.ListaEncadeada;
import utils.ListaEncadeadaImpl;

public class Programa {
	
	public static void main(String[] args) {
		
		var scan = new Scanner(System.in);
		
		ListaEncadeada<Character, String> alocacaoEncadeada = new ListaEncadeadaImpl<>();
		
		boolean condicao = true;
		
		int i = 0;
		
		while(condicao) {
			i++;
			
			System.out.println("Para parar digite 'PARAR'.");
			System.out.println("Digite o " + i + "º valor: ");
			
			String valor = scan.next();
			
			if(valor.equals("PARAR")) {
				condicao = false;
			}
			
			else {
				alocacaoEncadeada.adicionar(null, valor);
				
				if(alocacaoEncadeada.tamanho() > 1) {
					int posicao = alocacaoEncadeada.tamanho() - 2;
					char chave = alocacaoEncadeada.getValor(alocacaoEncadeada.tamanho() - 1).charAt(0);
					alocacaoEncadeada.alterarChave(posicao, chave);
				}
			}
			
		}
		
		System.out.println();
		
		System.out.println("Chaves e valores:");
		alocacaoEncadeada.imprimirChavesComValores();
		
		scan.close();
	}

}
