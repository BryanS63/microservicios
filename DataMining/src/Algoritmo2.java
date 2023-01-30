import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Algoritmo2 {
	public static void main(String[] args) throws IOException{
		String kata;
		StringBuffer teks = new StringBuffer ();
		Algoritmo car;
		System.out.println(" Ingrese la frase: ");
		InputStreamReader kt = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (kt);
		teks.append(br.readLine());
		System.out.println("\n\nPalabra a buscar: ");
		kata= br.readLine();
		car = new Algoritmo(teks,kata);
		System.out.println("Numero de veces que se repite : "+ car.find()+"\n");
	}
}
