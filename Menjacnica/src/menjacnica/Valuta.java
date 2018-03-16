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
		if (naziv == null)
			throw new RuntimeException("Naziv ne sme biti Null");
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null)
			throw new RuntimeException("Skraceni naziv ne sme biti Null");
		this.skraceniNaziv = skraceniNaziv;
	}

	public LinkedList<Kurs> getKursnaLista() {
		return kursnaLista;
	}

	public void setKursnaLista(LinkedList<Kurs> kursnaLista) {
		if (kursnaLista == null)
			throw new RuntimeException("Lista ne sme biti null");
		this.kursnaLista = kursnaLista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursnaLista == null) ? 0 : kursnaLista.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kursnaLista == null) {
			if (other.kursnaLista != null)
				return false;
		} else if (!kursnaLista.equals(other.kursnaLista))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String tekst = "";
		tekst += "Valuta [" + skraceniNaziv + "] " + naziv + "\n";
		for (int i = 0; i < kursnaLista.size(); i++) {
			tekst += kursnaLista.get(i).toString();
		}
		return tekst;
	}

}
