import java.util.Arrays;
import java.util.Scanner;

public class bota {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nBotas = in.nextInt();
		int vetorE[] = new int[nBotas];
		int vetorD[] = new int[nBotas];
		int indiceE = 0;
		int indiceD = 0;
		for (int i = 0; i < nBotas; i++) {
			int tamanho = in.nextInt();
			String pe = in.next();

			if (pe.trim().equals("E")) {
				vetorE[indiceE++] = tamanho;
			} else {
				vetorD[indiceD++] = tamanho;
			}
		}

		int nPares = 0;

		for (int i = 0; i < indiceE; i++) {
			for (int j = 0; j < indiceD; j++) {
				if(vetorE[i]== vetorD[j]) {
					nPares++;
					vetorD[j] = -1;
					break;
				}
			}
		}

		System.out.println(nPares);
	}
}
