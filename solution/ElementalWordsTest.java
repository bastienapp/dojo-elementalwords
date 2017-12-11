import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import java.util.ArrayList;

public class ElementalWordsTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		String[][] results = new String[][]{
			{"Beryllium (Be)", "Actinium (Ac)", "Hydrogen (H)"}
		};
		ElementalWords ElementalWords = new ElementalWords();
		String[][] elementalForms = ElementalWords.elementalForms("beach");
		Assert.assertArrayEquals(results, elementalForms);
	}

	@Test
	public void test2() throws Exception {
		String[][] results = new String[][]{
			{"Sulfur (S)", "Nitrogen (N)", "Actinium (Ac)", "Potassium (K)"},
			{"Sulfur (S)", "Sodium (Na)", "Carbon (C)", "Potassium (K)"},
			{"Tin (Sn)", "Actinium (Ac)", "Potassium (K)"}
		};
		ElementalWords ElementalWords = new ElementalWords();
		String[][] elementalForms = ElementalWords.elementalForms("snack");
		Assert.assertArrayEquals(results, elementalForms);
	}
}