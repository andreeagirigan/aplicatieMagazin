import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class CitireFisier {
	
	private Scanner citire;
	
	public void openFile() {
		try {
			/*FileWriter fw = new FileWriter ("magazin.txt", true); //scrie in fisierul magazin cuvantul auchan
			FileWriter fw2 = new FileWriter ("sediu.txt", true); //scrie in fisierul sediu cuvantul coresi , dar nu e bine pt in magazin se regaseste si sediul
			fw.write("Auchan");
			fw.close();
			fw2.write("Coresi");
			fw2.close();*/

			citire = new Scanner (new File("magazin.txt"));

		}
		/*catch (IOException ex){
		System.out.println("Fisier inexistent");
		}*/
		catch(Exception deschidere) {
			System.out.println("Fisierul nu a putut fi deschis");
			
			
		
		}
	}
	public void readFile() {

		/*while (citire.hasNext()) {
			String denumire = citire.next();
			String taraDeOrigine = citire.next();
			String sediu = citire.next();
			String numarAngajati = citire.next();
			String venituriSediu = citire.next();
			String gradIncredere = citire.next();
			String oras = citire.next();
			String tara = citire.next();
			String strada = citire.next();
			String numar = citire.next();
			//System.out.printf("%-15s %-15s\n", denumire, sediu);

			System.out.printf("%-15s %-15s %-15s\n", denumire, strada, numar);
		}*/

}	
	public void closeFile() {
		citire.close();
	}
}
