
public class AdresaSediu extends Sediu{
	private String oras;
	private String tara;
	private String strada;
	private int numar;
	
	public AdresaSediu (String denumire, String taraDeOrigine, String listaSedii, int numarAngajati, double venituriSediu,int gradIncredere, String oras, String tara, String strada,int numar) {
	
		super (denumire, taraDeOrigine, listaSedii, numarAngajati, venituriSediu,gradIncredere);

	      this.setOras(oras);
	      this.setTara(tara);
	      this.setStrada(strada);
	      this.setNumar(numar);
	   }

	public AdresaSediu() {
		
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}

	public String getStrada() {
		return strada;
	}

	public void setStrada(String strada) {
		this.strada = strada;
	}

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}
	
	 
	 
	 
	public void afisare2() {
		System.out.println("metoda clasei adresa sediu");
		
	}

}


