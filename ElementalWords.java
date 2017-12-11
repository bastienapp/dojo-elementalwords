import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class ElementalWords {

	Map<String, String> periodicTable;
	List<String[]> results;

	public ElementalWords() {
		this.periodicTable = getPeriodicTable();
		this.results = new ArrayList<String[]>();
	}

	public String[][] elementalForms(String word) {

		process(word, new ArrayList<String>());

		return this.results.toArray(new String[0][0]);
	}

	public void process(String chunk, List<String> elements) {
		String current = "";
		for (int i = 0; i < chunk.length() && (i <= 1); i++) {
			current += chunk.charAt(i);
			String element = getElement(current);
			if (element != null) {
				List<String> clonedElements = new ArrayList<String>(elements);
				clonedElements.add(element);
				String nextChunck = chunk.substring(i + 1);
				if (nextChunck.length() > 0) {
					process(nextChunck, clonedElements);
				} else {
					results.add(clonedElements.toArray(new String[0]));
				}
			}
		}
	}

	private String getElement(String letters) {
		String element = this.periodicTable.get(letters);
		if (element != null) {
			element += " (" + letters + ")";
		}
		return element;
	}

	private Map<String, String> getPeriodicTable() {
		Map<String, String> hmap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
		hmap.put("H", "Hydrogen");
		hmap.put("He", "Helium");
		hmap.put("Li", "Lithium");
		hmap.put("Be", "Beryllium");
		hmap.put("B", "Boron");
		hmap.put("C", "Carbon");
		hmap.put("N", "Nitrogen");
		hmap.put("O", "Oxygen");
		hmap.put("F", "Fluorine");
		hmap.put("Ne", "Neon");
		hmap.put("Na", "Sodium");
		hmap.put("Mg", "Magnesium");
		hmap.put("Al", "Aluminium");
		hmap.put("Si", "Silicon");
		hmap.put("P", "Phosphorus");
		hmap.put("S", "Sulfur");
		hmap.put("Cl", "Chlorine");
		hmap.put("Ar", "Argon");
		hmap.put("K", "Potassium");
		hmap.put("Ca", "Calcium");
		hmap.put("Sc", "Scandium");
		hmap.put("Ti", "Titanium");
		hmap.put("V", "Vanadium");
		hmap.put("Cr", "Chromium");
		hmap.put("Mn", "Manganese");
		hmap.put("Fe", "Iron");
		hmap.put("Co", "Cobalt");
		hmap.put("Ni", "Nickel");
		hmap.put("Cu", "Copper");
		hmap.put("Zn", "Zinc");
		hmap.put("Ga", "Gallium");
		hmap.put("Ge", "Germanium");
		hmap.put("As", "Arsenic");
		hmap.put("Se", "Selenium");
		hmap.put("Br", "Bromine");
		hmap.put("Kr", "Krypton");
		hmap.put("Rb", "Rubidium");
		hmap.put("Sr", "Strontium");
		hmap.put("Y", "Yttrium");
		hmap.put("Zr", "Zirconium");
		hmap.put("Nb", "Niobium");
		hmap.put("Mo", "Molybdenum");
		hmap.put("Tc", "Technetium");
		hmap.put("Ru", "Ruthenium");
		hmap.put("Rh", "Rhodium");
		hmap.put("Pd", "Palladium");
		hmap.put("Ag", "Silver");
		hmap.put("Cd", "Cadmium");
		hmap.put("In", "Indium");
		hmap.put("Sn", "Tin");
		hmap.put("Sb", "Antimony");
		hmap.put("Te", "Tellurium");
		hmap.put("I", "Iodine");
		hmap.put("Xe", "Xenon");
		hmap.put("Cs", "Cesium");
		hmap.put("Ba", "Barium");
		hmap.put("La", "Lanthanum");
		hmap.put("Ce", "Cerium");
		hmap.put("Pr", "Praseodymium");
		hmap.put("Nd", "Neodymium");
		hmap.put("Pm", "Promethium");
		hmap.put("Sm", "Samarium");
		hmap.put("Eu", "Europium");
		hmap.put("Gd", "Gadolinium");
		hmap.put("Tb", "Terbium");
		hmap.put("Dy", "Dysprosium");
		hmap.put("Ho", "Holmium");
		hmap.put("Er", "Erbium");
		hmap.put("Tm", "Thulium");
		hmap.put("Yb", "Ytterbium");
		hmap.put("Lu", "Lutetium");
		hmap.put("Hf", "Hafnium");
		hmap.put("Ta", "Tantalum");
		hmap.put("W", "Tungsten");
		hmap.put("Re", "Rhenium");
		hmap.put("Os", "Osmium");
		hmap.put("Ir", "Iridium");
		hmap.put("Pt", "Platinum");
		hmap.put("Au", "Gold");
		hmap.put("Hg", "Mercury");
		hmap.put("Tl", "Thallium");
		hmap.put("Pb", "Lead");
		hmap.put("Bi", "Bismuth");
		hmap.put("Po", "Polonium");
		hmap.put("At", "Astatine");
		hmap.put("Rn", "Radon");
		hmap.put("Fr", "Francium");
		hmap.put("Ra", "Radium");
		hmap.put("Ac", "Actinium");
		hmap.put("Th", "Thorium");
		hmap.put("Pa", "Protactinium");
		hmap.put("U", "Uranium");
		hmap.put("Np", "Neptunium");
		hmap.put("Pu", "Plutonium");
		hmap.put("Am", "Americium");
		hmap.put("Cm", "Curium");
		hmap.put("Bk", "Berkelium");
		hmap.put("Cf", "Californium");
		hmap.put("Es", "Einsteinium");
		hmap.put("Fm", "Fermium");
		hmap.put("Md", "Mendelevium");
		hmap.put("No", "Nobelium");
		hmap.put("Lr", "Lawrencium");
		hmap.put("Rf", "Rutherfordium");
		hmap.put("Db", "Dubnium");
		hmap.put("Sg", "Seaborgium");
		hmap.put("Bh", "Bohrium");
		hmap.put("Hs", "Hassium");
		hmap.put("Mt", "Meitnerium");
		hmap.put("Ds", "Darmstadtium");
		hmap.put("Rg", "Roentgenium");
		hmap.put("Cn", "Copernicium");
		hmap.put("Nh", "Nihonium");
		hmap.put("Fl", "Flerovium");
		hmap.put("Mc", "Moscovium");
		hmap.put("Lv", "Livermorium");
		hmap.put("Ts", "Tennessine");
		hmap.put("Og", "Oganesson");

		return hmap;
	}
}
