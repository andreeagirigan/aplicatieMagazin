import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class TestMagazin {
	public static void main (String[] args) {
		ArrayList<Magazin> magazine = new ArrayList<>();
		ArrayList<Sediu> sedii = new ArrayList<>();
		ArrayList<AdresaSediu> adrese = new ArrayList<>();
		
		Scanner z = new Scanner(System.in);
		String denumire = null , taraDeOrigine = null, listaSedii = null , oras = null, tara = null, strada = null;
		int numarAngajati = 0, gradIncredere = 0,numar = 0;
		double venituriSediu = 0;
		boolean c = true;
		do
		{
			meniu();
			System.out.println("Alegeti operatia dorita.");
			int b = z.nextInt();
			Scanner d = new Scanner(System.in);
			switch(b) 
			{
				case 1:
					System.out.println("Adaugare magazin.");
					System.out.println("Introduceti denumirea magazinului: ");
					denumire = d.nextLine();
					System.out.println("Introduceti tara de origine a magazinului: ");				
					taraDeOrigine = d.nextLine();
					System.out.println("Introduceti sediul magazinului: \n");	
					listaSedii = d.nextLine();
					Magazin Nou = new Magazin(denumire, taraDeOrigine,  listaSedii);
					magazine.add(Nou);
					break;
				case 2:
					System.out.println("Adaugare sediu");
					System.out.println("Pentru care magazin?");
					denumire = d.nextLine();
					System.out.println("Introduceti numarul angajatilor: ");
					numarAngajati = d.nextInt();
					System.out.println("Introduceti veniturile sediului: ");
					venituriSediu = d.nextDouble();
					System.out.println("Introduceti gradul de incredere al sediului: ");
					gradIncredere = d.nextInt();
					System.out.println("Introduceti tara sediului: ");
					tara = d.nextLine();
					System.out.println("Introduceti orasul sediului: ");
					oras = d.nextLine();
					System.out.println("Introduceti strada sediului: ");
					strada = d.nextLine();
					System.out.println("Introduceti numarul sediului: ");
					numar = d.nextInt();
					Sediu Nou1 = new  Sediu (denumire, taraDeOrigine,  listaSedii , numarAngajati,  venituriSediu, gradIncredere);
					sedii.add(Nou1);
					break;
				case 3:
					System.out.println("Afisarea magazinelor impreuna cu sediile");
					for (Magazin m:magazine)
						System.out.printf("%-15s %-15s \n", denumire, listaSedii);
					break;
				case 4:
					System.out.println("Afisarea magazinelor ce au sedii in Brasov");
					for (AdresaSediu a:adrese) {
						
						if (oras == "Brasov") {
							System.out.printf("%s\n", denumire);
							}else System.out.printf("Nu exista magazine cu sedii in Brasov");	
					}	
					break;
				case 5:
					System.out.println("Sortarea magazinelor dupa numarul total de angajati din toate sediile");
					ArrayList<String> nrangajati = new ArrayList<String>();
					for (Magazin m:magazine) {
						int nrtotal = 0;
						for (Sediu s:sedii) {
						
						if (m.denumire == s.denumire) {
							nrtotal +=s.getNumarAngajati();
										
						}
						nrangajati.add(nrtotal + " -" + s.denumire);
						Collections.sort(nrangajati);		
						}
					
					System.out.println(nrangajati);			
					}
					break;
				case 6:
						System.out.println("Sortarea magazinelor dupa media veniturilor sediilor sale");
						ArrayList<String> medievenituri = new ArrayList<String>();
						for (Magazin m:magazine) {
						int i = 0;
						float medie = 0;

							for (Sediu s:sedii) {
							i +=s.getVenituriSediu();
							
							if (m.denumire == s.denumire) {
								medie +=s.getVenituriSediu()/i;											
							}
							medievenituri.add(medie + " -" + s.denumire);
							Collections.sort(medievenituri);	
							System.out.println(medievenituri);
							}
						}
						break;
				case 7:
						System.out.println("Afisarea magazinelor cu cel mai mare grad de incredere");
						ArrayList<String> maxgrad = new ArrayList<String>();
						for (Magazin m:magazine) {
						int grad = 0;
							for (Sediu s:sedii) {
							
							if (m.denumire == s.denumire) {
								grad +=s.getGradIncredere();										
							}
							maxgrad.add(grad + " -" + s.denumire);
							Collections.sort(maxgrad);	
							if (grad == 5) {
								System.out.println(maxgrad);
							}
								else if (grad == 4) {
									System.out.println(maxgrad);
								}
									if (grad == 3) {
										System.out.println(maxgrad);
									}
										else if (grad == 2) {
											System.out.println(maxgrad);
											}
												else if (grad == 2) {
													System.out.println(maxgrad);						
												}
												else if (grad == 1) {
													System.out.println(maxgrad);						
												}									
							}	
					}
						break;
				case 8:
						System.out.println("Afisarea sediului de magazin din Romania cu cele mai mari venituri");
						ArrayList<String> veniturimaxime = new ArrayList<String>();
						for (Magazin m:magazine) {
							int i = 0;
							int vmax = 0;

								for (Sediu s:sedii) {
									i +=s.getVenituriSediu();
								
									for (AdresaSediu a:adrese) {
										
								if (m.listaSedii == s.listaSedii && a.getTara() == "Romania") {
									vmax +=s.getVenituriSediu();		
									}
								}
									veniturimaxime.add(vmax + " - " + s.denumire);
								Collections.sort(veniturimaxime);	
								System.out.println(veniturimaxime);
								}

							}
						break;
						
			}
			
		}while(c);
}
			public static void meniu()
			{
				System.out.println("Meniu");
				System.out.println("[1] Adaugarea unui magazin.");
				System.out.println("[2] Adaugare unui sediu de magazin.");
				System.out.println("[3] Afisarea magazinelor impreuna cu sediile.");
				System.out.println("[4] Afisarea magazinelor ce au sedii in Brasov.");
				System.out.println("[5] Sortarea magazinelor dupa numarul total de angajati din toate sediile.");
				System.out.println("[6] Sortarea magazinelor dupa media veniturilor sediilor sale.");
				System.out.println("[7] Afisarea magazinelor cu cel mai mare grad de incredere.");
				System.out.println("[8] Afisarea sediului de magazin din Romania cu cele mai mari venituri.");		
				System.out.println("[9] Iesire din program \n");
			}
	}
	
