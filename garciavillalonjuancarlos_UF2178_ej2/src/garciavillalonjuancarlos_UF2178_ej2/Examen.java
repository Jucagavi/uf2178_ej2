package garciavillalonjuancarlos_UF2178_ej2;

public class Examen {
	
	public static void mostrar_imcs(double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%.2f ",matriz[i][j]);
			}
		System.out.println();
		}
	}
	
	public static double media_paciente(double matriz[][], int numero) {
		double suma=0;
			for (int j = 0; j < matriz[0].length; j++) {
				suma=suma+matriz[numero][j];	
		}
		return suma/12;
	}
}