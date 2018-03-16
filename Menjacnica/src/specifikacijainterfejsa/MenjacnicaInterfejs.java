package specifikacijainterfejsa;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKursValute(Valuta valuta, Kurs kurs);

	public void obrisiKursValute(GregorianCalendar datumZaBrisanje, Valuta valuta);

	public Kurs nadjiIVratiKursValute(GregorianCalendar datum, Valuta valuta);
}
