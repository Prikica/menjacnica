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
			if (valute.get(i).equals(valuta)) {
				valute.get(i).getKursnaLista().add(kurs);
			}
		}

	}

	@Override
	public void obrisiKursValute(GregorianCalendar datumZaBrisanje, Valuta valuta) {
		if (datumZaBrisanje == null || valuta == null) {
			throw new RuntimeException("Neispravni parametri");
		}

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(valuta)) {
				for (int j = 0; j < valute.get(i).getKursnaLista().size(); j++) {
					if (valute.get(i).getKursnaLista().get(j).getDatum().equals(datumZaBrisanje))
						valute.get(i).getKursnaLista().remove(valute.get(i).getKursnaLista().get(j));
				}
			}

		}

	}

	@Override
	public Kurs nadjiIVratiKursValute(GregorianCalendar datum, Valuta valuta) {
		if (datum == null || valuta == null) {
			throw new RuntimeException("Neispravni parametri");
		}

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).equals(valuta)) {
				for (int j = 0; j < valute.get(i).getKursnaLista().size(); j++) {
					if (valute.get(i).getKursnaLista().get(j).getDatum().equals(datum))
						return valute.get(i).getKursnaLista().get(j);
				}
			}

		}
		return null;
	}

}
