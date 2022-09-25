import java.util.Scanner;

public class botav2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nBotas = in.nextInt();
		int vetorE[] = new int[61];
		int vetorD[] = new int[61];
		
		for (int i = 0; i < nBotas; i++) {
			int tamanho = in.nextInt();
			String pe = in.next();

			if (pe.trim().equals("E")) {
				vetorE[tamanho]++;
			} else {
				vetorD[tamanho]++;	
			}
		}
		int nPares = 0;
		for (int i = 0; i < 61; i++) {
			nPares += Math.min(vetorE[i], vetorD[i]);
		}
		System.out.println(nPares);
	}
}
