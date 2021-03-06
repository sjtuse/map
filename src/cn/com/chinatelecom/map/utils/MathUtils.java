package cn.com.chinatelecom.map.utils;

import java.text.DecimalFormat;

/**
 * @author joseph
 *
 */
public class MathUtils {

	public static double getTitude(double number, double decimal) {
		String format = "0.";
		for (int i = 0; i < decimal; i++) {
			format += '0';
		}
		DecimalFormat df = new DecimalFormat(format);
		return Double.parseDouble(df.format(number));
	}

}
