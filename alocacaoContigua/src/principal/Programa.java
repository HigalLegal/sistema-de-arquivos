package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		
		List<String> valores = new ArrayList<>();
		
		boolean condicao = true;
		
		while(condicao) {
			System.out.println("Pra encerrar, digite 'PARAR'.");
			
			System.out.print("Digite o valor do bloco: ");
			String valor = scan.next();
			
			if(valor.equals("PARAR")) {
				condicao = false;
			}
			
			else {
				System.out.print("Digite o tamanho do arquivo: ");
				int tamanho = scan.nextInt();
				
				for(int i = 0; i < tamanho; i++) {
					valores.add(valor);
				}
			}
		}
		
		System.out.println("Valores:");
		valores.forEach(System.out::println);
		
		scan.close();
	}

}
