
public class Ej_Arreglo {
	private double venta[];
	private int tam;
	
	public double[] getVentas() {
		return venta;
	}
	

	public void setVentas(double venta[]) {
		this.venta = venta;
	}
	
	public int getTam() {
		return tam;
	}


	public void setTam(int tam) {
		this.tam = tam;
	}

	public void ventaSemanal(double ventas[], int t) {
		int i;
		for(i=0; i<t; i++)
			System.out.println("Numero: "+ventas[i]);
			i++;
		}

}

