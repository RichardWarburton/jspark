package jspark;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * It's worth noting that JSpark uses a slightly different calculation algorithm to Spark, so it may not produce identical graphs.
 * 
 * @author Richard Warburton
 */
public class JSpark {

	private static final List<Character> ticks = Arrays.asList('▁', '▂', '▃', '▄', '▅', '▆', '▇', '█');

	/**
	 * Renders an ascii graph.
	 * 
	 * @param values
	 *            a collection of integers to be rendered
	 * @return a String containing an ascii graph of the values
	 */
	public static String render(final Collection<Integer> values) {
		final int max = Collections.max(values), min = Collections.min(values);
		final float scale = (max - min) / 7f;
		final StringBuilder accumulator = new StringBuilder();
		for (final Integer value : values) {
			final int index = Math.round((value - min) / scale);
			accumulator.append(ticks.get(index));
		}
		return accumulator.toString();
	}

	/**
	 * Renders an ascii graph.
	 * 
	 * @param values
	 *            an arrays of integers to be rendered
	 * @return a String containing an ascii graph of the values
	 */
	public static String render(final Integer... values) {
		return render(asList(values));
	}

}
