import static org.junit.Assert.assertEquals;
import jspark.JSpark;

import org.junit.Test;

public class TestJSpark {

	@Test
	public void examples() {
		assertEquals("▁▂▄▃█", JSpark.render(1, 5, 22, 13, 53));
		assertEquals("▁▂▄▅▃█", JSpark.render(0, 30, 55, 80, 33, 150));
		assertEquals("▄▆▃█▁", JSpark.render(9, 13, 5, 17, 1));
	}

}
