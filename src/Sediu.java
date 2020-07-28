
public class  Sediu extends Magazin   {
	private int numarAngajati;
	private double venituriSediu;
	private int gradIncredere;
		
	public Sediu (String denumire, String taraDeOrigine, String listaSedii, int numarAngajati, double venituriSediu,int gradIncredere ) {
		 super (denumire, taraDeOrigine, listaSedii);
	     
	      this.setNumarAngajati(numarAngajati);
	      this.setVenituriSediu(venituriSediu);
	      this.setGradIncredere(gradIncredere);
	   }

	public int getNumarAngajati() {
		return numarAngajati;
	}
	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}

	public double getVenituriSediu() {
		return venituriSediu;
	}
	public void setVenituriSediu(double venituriSediu) {
		this.venituriSediu = venituriSediu;
	}
	public int getGradIncredere() {
		return gradIncredere;
	}
	public void setGradIncredere(int gradIncredere) {
		this.gradIncredere = gradIncredere;
	}
	
	 public Sediu ()
	 {
		
	 }


}