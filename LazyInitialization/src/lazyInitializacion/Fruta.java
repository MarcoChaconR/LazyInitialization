package lazyInitializacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fruta {
	private static Map<TipoFruta, Fruta> mapaTipos = new HashMap<>();

	private Fruta(TipoFruta type) {
	}

	public static Fruta getFrutaByTypeName(TipoFruta type) {
		Fruta Fruta;

		if (!mapaTipos.containsKey(type)) {
			Fruta = new Fruta(type);
			mapaTipos.put(type, Fruta);
		} else {
			Fruta = mapaTipos.get(type);
		}

		return Fruta;
	}

	public static Fruta getFrutaByTypeNameHighConcurrentVersion(TipoFruta type) {
		if (!mapaTipos.containsKey(type)) {
			synchronized (mapaTipos) {
				if (!mapaTipos.containsKey(type)) {
					mapaTipos.put(type, new Fruta(type));
				}
			}
		}

		return mapaTipos.get(type);
	}

	public static void showAll() {
		if (mapaTipos.size() > 0) {

			System.out.println("Number of instances made = " + mapaTipos.size());

			for (Entry<TipoFruta, Fruta> entry : mapaTipos.entrySet()) {
				String Fruta = entry.getKey().toString();
				Fruta = Character.toUpperCase(Fruta.charAt(0)) + Fruta.substring(1);
				System.out.println(Fruta);
			}

			System.out.println();
		}
	}
}
