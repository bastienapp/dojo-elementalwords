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
			{"Sulfur (s)", "Nitrogen (n)", "Actinium (ac)", "Potassium (k)"},
			{"Sulfur (s)", "Sodium (na)", "Carbon (c)", "Potassium (k)"},
			{"Tin (sn)", "Actinium (ac)", "Potassium (k)"}
		};
		ElementalWords ElementalWords = new ElementalWords();
		String[][] elementalForms = ElementalWords.elementalForms("snack");
		Assert.assertArrayEquals(results, elementalForms);
	}
}