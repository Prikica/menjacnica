package menjacnica;

import java.util.LinkedList;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursnaLista = new LinkedList<Kurs>();

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public LinkedList<Kurs> getKursnaLista() {
		return kursnaLista;
	}

	public void setKursnaLista(LinkedList<Kurs> kursnaLista) {
		this.kursnaLista = kursnaLista;
	}

}
