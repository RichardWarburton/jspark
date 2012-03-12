import static org.junit.Assert.assertEquals;
import jspark.JSpark;

import org.junit.Test;

public class TestJSpark {

	@Test
	public void examples() {
		assertEquals("\u2581\u2582\u2584\u2583\u2588", JSpark.render(1, 5, 22, 13, 53));
		assertEquals("\u2581\u2582\u2584\u2585\u2583\u2588", JSpark.render(0, 30, 55, 80, 33, 150));
		assertEquals("\u2584\u2586\u2583\u2588\u2581", JSpark.render(9, 13, 5, 17, 1));
	}

}
