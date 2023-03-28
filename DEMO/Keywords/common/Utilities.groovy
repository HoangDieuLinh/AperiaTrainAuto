package common

public class Utilities {

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
	
	/**
     * Get random number
     * @param total
     * @param numOfItems
     * @return
     */
	public static List<String> getRandom(int total, int numOfItems){
	Random rand = new Random()
		Set<String> set = new LinkedHashSet<Integer>();
		while (set.size() < numOfItems) {
			int random = rand.nextInt(total) + 1
			set.add(random.toString())
			}
		
		List<String> result = new ArrayList<>(set)
		return result
		}
}

