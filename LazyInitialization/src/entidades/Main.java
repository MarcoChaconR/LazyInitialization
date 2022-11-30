package entidades;

import lazyInitializacion.Fruta;
import lazyInitializacion.TipoFruta;

public class Main {

	public static void main(String[] args) {
		Fruta.getFrutaByTypeName(TipoFruta.Banano);
		Fruta.showAll();
		Fruta.getFrutaByTypeName(TipoFruta.Manzana);
		Fruta.showAll();
		Fruta.getFrutaByTypeName(TipoFruta.Pera);
		Fruta.showAll();
	}

}
