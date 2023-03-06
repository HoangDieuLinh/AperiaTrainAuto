package common

public class Color {

/**
     * Convert code RGBA to Hexa
     * @param backgroundColor
     * @return
     */
	public static String convertRGBAToHex(String backgroundColor){
		String[] hexValue = backgroundColor.split("[, rgba()]+")
		
			int hexValue1 = Integer.valueOf(hexValue[1])
			int hexValue2 = Integer.valueOf(hexValue[2])
			int hexValue3 = Integer.valueOf(hexValue[3])
			
			String result = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3)
			return result
		
	}
}

