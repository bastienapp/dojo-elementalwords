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
		return this.periodicTable.get(letters);
	}

	private Map<String, String> getPeriodicTable() {
		Map<String, String> hmap = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
		hmap.put("H", "Hydrogen (H)");
		hmap.put("He", "Helium (Hd)");
		hmap.put("Li", "Lithium (Li)");
		hmap.put("Be", "Beryllium (Be)");
		hmap.put("B", "Boron (B)");
		hmap.put("C", "Carbon (C)");
		hmap.put("N", "Nitrogen (N)");
		hmap.put("O", "Oxygen (O)");
		hmap.put("F", "Fluorine (F)");
		hmap.put("Ne", "Neon (Ne)");
		hmap.put("Na", "Sodium (Na)");
		hmap.put("Mg", "Magnesium (Mg)");
		hmap.put("Al", "Aluminium (Al)");
		hmap.put("Si", "Silicon (Si)");
		hmap.put("P", "Phosphorus (P)");
		hmap.put("S", "Sulfur (S)");
		hmap.put("Cl", "Chlorine (Cl)");
		hmap.put("Ar", "Argon (Ar)");
		hmap.put("K", "Potassium (K)");
		hmap.put("Ca", "Calcium (Ca)");
		hmap.put("Sc", "Scandium (Sc)");
		hmap.put("Ti", "Titanium (Ti)");
		hmap.put("V", "Vanadium (V)");
		hmap.put("Cr", "Chromium (Cr)");
		hmap.put("Mn", "Manganese (Mn)");
		hmap.put("Fe", "Iron (Fe)");
		hmap.put("Co", "Cobalt (Co)");
		hmap.put("Ni", "Nickel (Ni)");
		hmap.put("Cu", "Copper (Cu)");
		hmap.put("Zn", "Zinc (Zn)");
		hmap.put("Ga", "Gallium (Ga)");
		hmap.put("Ge", "Germanium (Ge)");
		hmap.put("As", "Arsenic (As)");
		hmap.put("Se", "Selenium (Se)");
		hmap.put("Br", "Bromine (Br)");
		hmap.put("Kr", "Krypton (Kr)");
		hmap.put("Rb", "Rubidium (Rb)");
		hmap.put("Sr", "Strontium (Sr)");
		hmap.put("Y", "Yttrium (Y)");
		hmap.put("Zr", "Zirconium (Zr)");
		hmap.put("Nb", "Niobium (Nb)");
		hmap.put("Mo", "Molybdenum (Mo)");
		hmap.put("Tc", "Technetium (Tc)");
		hmap.put("Ru", "Ruthenium (Ru)");
		hmap.put("Rh", "Rhodium (Rh)");
		hmap.put("Pd", "Palladium (Pd)");
		hmap.put("Ag", "Silver (Ag)");
		hmap.put("Cd", "Cadmium (Cd)");
		hmap.put("In", "Indium (In)");
		hmap.put("Sn", "Tin (Sn)");
		hmap.put("Sb", "Antimony (Sb)");
		hmap.put("Te", "Tellurium (Te)");
		hmap.put("I", "Iodine (I)");
		hmap.put("Xe", "Xenon (Xe)");
		hmap.put("Cs", "Cesium (Cs)");
		hmap.put("Ba", "Barium (Ba)");
		hmap.put("La", "Lanthanum (La)");
		hmap.put("Ce", "Cerium (Ce)");
		hmap.put("Pr", "Praseodymium (Pr)");
		hmap.put("Nd", "Neodymium (Nd)");
		hmap.put("Pm", "Promethium (Pm)");
		hmap.put("Sm", "Samarium (Sm)");
		hmap.put("Eu", "Europium (Eu)");
		hmap.put("Gd", "Gadolinium (Gd)");
		hmap.put("Tb", "Terbium (Tb)");
		hmap.put("Dy", "Dysprosium (Dy)");
		hmap.put("Ho", "Holmium (Ho)");
		hmap.put("Er", "Erbium (Er)");
		hmap.put("Tm", "Thulium (Tm)");
		hmap.put("Yb", "Ytterbium (Yb)");
		hmap.put("Lu", "Lutetium (Lu)");
		hmap.put("Hf", "Hafnium (Hf)");
		hmap.put("Ta", "Tantalum (Ta)");
		hmap.put("W", "Tungsten (W)");
		hmap.put("Re", "Rhenium (Re)");
		hmap.put("Os", "Osmium (Os)");
		hmap.put("Ir", "Iridium (Ir)");
		hmap.put("Pt", "Platinum (Pt)");
		hmap.put("Au", "Gold (Au)");
		hmap.put("Hg", "Mercury (Hg)");
		hmap.put("Tl", "Thallium (Tl)");
		hmap.put("Pb", "Lead (Pb)");
		hmap.put("Bi", "Bismuth (Bi)");
		hmap.put("Po", "Polonium (Po)");
		hmap.put("At", "Astatine (At)");
		hmap.put("Rn", "Radon (Rn)");
		hmap.put("Fr", "Francium (Fr)");
		hmap.put("Ra", "Radium (Ra)");
		hmap.put("Ac", "Actinium (Ac)");
		hmap.put("Th", "Thorium (Th)");
		hmap.put("Pa", "Protactinium (Pa)");
		hmap.put("U", "Uranium (U)");
		hmap.put("Np", "Neptunium (Np)");
		hmap.put("Pu", "Plutonium (Pu)");
		hmap.put("Am", "Americium (Am)");
		hmap.put("Cm", "Curium (Cm)");
		hmap.put("Bk", "Berkelium (Bk)");
		hmap.put("Cf", "Californium (Cf)");
		hmap.put("Es", "Einsteinium (Es)");
		hmap.put("Fm", "Fermium (Fm)");
		hmap.put("Md", "Mendelevium (Md)");
		hmap.put("No", "Nobelium (No)");
		hmap.put("Lr", "Lawrencium (Lr)");
		hmap.put("Rf", "Rutherfordium (Rf)");
		hmap.put("Db", "Dubnium (Db)");
		hmap.put("Sg", "Seaborgium (Sg)");
		hmap.put("Bh", "Bohrium (Bh)");
		hmap.put("Hs", "Hassium (Hs)");
		hmap.put("Mt", "Meitnerium (Mt)");
		hmap.put("Ds", "Darmstadtium (Ds)");
		hmap.put("Rg", "Roentgenium (Rg)");
		hmap.put("Cn", "Copernicium (Cn)");
		hmap.put("Nh", "Nihonium (Nh)");
		hmap.put("Fl", "Flerovium (Fl)");
		hmap.put("Mc", "Moscovium (Mc)");
		hmap.put("Lv", "Livermorium (Mv)");
		hmap.put("Ts", "Tennessine (Ts)");
		hmap.put("Og", "Oganesson (Og)");

		return hmap;
	}
}
