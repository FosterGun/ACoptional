package simulator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tpal, tb, tc, pr, db = 0, op;

		System.out.println("Simulador de cache simple - Creado por: Ferran Tudela Garc�a y Miguel �ngel Blanco Fern�ndez\n");
		
		
		do {
			
			System.out.print("Escriba de que tama�o quiere que sean las palabras: 4 - 8 bytes\n> ");
			tpal = sc.nextInt();
			
			if(tpal != 4 && tpal != 8) {
				System.out.print("\nValor no v�lido. ");
			}
			
		} while(tpal != 4 && tpal != 8);
		
		System.out.println("\n");
		
		
		do {
			
			System.out.println("Escriba de que tama�o quiere que sean los bloques: 32 - 64 bytes\n> ");
			tb = sc.nextInt();
			
			if(tb != 32 && tb != 64) {
				System.out.print("\nValor no v�lido. ");
			}
			
		} while(tb != 32 && tb != 64);
		
		System.out.println("\n");
		
		
		do {
			
			System.out.println("Escriba de que tama�o quiere que sean los conjuntos: 1 - 2 - 4 - 8 conjuntos\n> ");
			tc = sc.nextInt();
			
			if(tc != 1 && tc != 2 && tc != 4 && tc != 8) {
				System.out.print("\nValor no v�lido. ");
			}
			
		} while(tc != 1 && tc != 2 && tc != 4 && tc != 8);
		
		System.out.println("\n");
		
		
		do {
			
			System.out.println("Escriba pol�tica de remplazo deseada: 0 (FIFO) - 1 (LRU)\n>");
			pr = sc.nextInt();
			
			if(pr != 1 && pr != 2) {
				System.out.print("\nValor no v�lido. ");
			}
			
		} while(pr != 1 && pr != 2);
		
		System.out.println("\n");
		
		Table tab = new Table(tpal, tb, tc);
		
		//TODO: Comprobaci�n de introducci�n correcta de la direcci�n
		while(db != -1) {
			System.out.println("\nEscriba direcci�n byte: (-1 para salir)\n>");
			db = sc.nextInt();
			System.out.println("Load (0) / Store (1)\n>");
			op = sc.nextInt();
			
			tab.colocaBloq(db, op);
			tab.imprimirResultado(db, 8/tc);
			tab.imprimirEstado(op, 0, tb/tpal);
			tab.imprimeTabla(tab.getMc(), tc);
		}
		
		tab.calculaTiempoTot();
	}
	
}
