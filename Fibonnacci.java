public class Fibonnacci{
	public static void main (String [ ] args) {
		int qt = 10;
		int ant=0;
		int atual=1;
		int prox=0;
		System.out.print("Fibonnacci usando FOR com  " + qt + " números:          <<< " + ant + " " + atual);
		for (int i=0; i < qt-2; i++)
		{
			prox = ant + atual;
			System.out.print(" " + prox);
			ant  = atual;
			atual= prox;
		}
		System.out.println(" >>> ");
		
		ant=0;
		atual=1;
		prox = ant+atual;
		int cont=0;
		System.out.print("Fibonnacci usando DO...WHILE... com " + qt + " números: <<< " + ant + " " + atual);
		do {
			System.out.print(" " + prox);
			ant=atual;
			atual=prox;
			prox=ant+atual;
			cont++;
		}
		while (cont < qt-2);
		System.out.println(" >>> ");


		ant=0;
		atual=1;
		prox = ant+atual;
		cont=0;
		System.out.print("Fibonnacci usando WHILE...DO... com " + qt + " números: <<< " + ant + " " + atual);
		while (cont < qt-2)
		{
			System.out.print(" " + prox);
			ant=atual;
			atual=prox;
			prox=ant+atual;
			cont++;
		}

		System.out.println(" >>> ");


		}
}
