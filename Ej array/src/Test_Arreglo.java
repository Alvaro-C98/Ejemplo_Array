import java.util.Scanner;
public class Test_Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ej_Arreglo n1 = new Ej_Arreglo();
		Scanner ent = new Scanner(System.in);
		double ventas[];
		int tam;
		ventas = new double[100];
		System.out.println("Ingrese tamaño: "+ventas[0]);
		tam=ent.nextInt();
		for(int i=0; i<tam; i++) {
			System.out.println("Ingrese numero: ");
			ventas[i]=ent.nextInt();
		}
		n1.ventaSemanal(ventas, tam);
	}

}
