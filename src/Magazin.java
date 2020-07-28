
public class Magazin {
	protected String denumire;
	protected String taraDeOrigine;
	protected  String listaSedii;
	
	public Magazin (String denumire, String taraDeOrigine, String listaSedii) {
	      this.setDenumire (denumire);
	      this.setTaraDeOrigine(taraDeOrigine);
	      this.setListaSedii(listaSedii);
	   }
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getTaraDeOrigine() {
		return taraDeOrigine;
	}
	public void setTaraDeOrigine(String taraDeOrigine) {
		this.taraDeOrigine = taraDeOrigine;
	}
	public String getListaSedii() {
		return listaSedii;
	}
	public void setListaSedii(String listaSedii) {
		this.listaSedii = listaSedii;
	}
	 public Magazin ()
	 {
		 
	 }

	 public void afisareMagazin()
		{
			System.out.println("Numele magazinului: " + denumire +" " + " tara de origine : " + taraDeOrigine + " Sediul "+ listaSedii +".");
		}
}
