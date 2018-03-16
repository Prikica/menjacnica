package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import specifikacijainterfejsa.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKursValute(Valuta valuta, Kurs kurs) {
		if (valuta == null || kurs == null) {
			throw new RuntimeException("Neispravni parametri!");
		}

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getSkraceniNaziv().equals(valuta.getSkraceniNaziv())) {
				valute.get(i).getKursnaLista().add(kurs);
			}
		}

	}

	@Override
	public void obrisiKursValute(GregorianCalendar datumZaBrisanje, Valuta valuta) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs nadjiIVratiKursValute(GregorianCalendar datum, Valuta valuta) {
		// TODO Auto-generated method stub
		return null;
	}

}
