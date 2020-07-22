package com.lams1989.encryption;

public class Encryption {
	/*
	 * length = 24 sizesubstring = rdx 24 = 5 tamano del vectorc = 5 tamano del
	 * substring = 5 definir el vector partir es Strin en substring
	 */
	public static String encryption(String s) {
		s = s.trim().replace(" ", "");
		int size = s.length();
		int subsize = radixUpRedon(size);
		int arraySize = radixRedon(size);
		String[] array = createArray(s, size, subsize, arraySize);

		return getResult(subsize, arraySize, array);

	}

	private static String getResult(int subsize, int arraySize, String[] array) {
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < subsize; i++) {
			for (int j = 0; j < arraySize; j++) {
				if (i < array[j].length()) {
					char aux = array[j].charAt(i);
					result.append(aux);
				}
			}
			result.append(" ");

		}
		return result.toString().trim();
	}

	private static String[] createArray(String s, int size, int subsize, int arraySize) {
		String[] array = new String[arraySize];
		for (int i = 0; i < array.length; i++) {
			int secund = (i * subsize) + (subsize);
			if (secund < size) {
				array[i] = s.substring(i * subsize, secund);
			} else {
				array[i] = s.substring(i * subsize, size);

			}

		}
		return array;
	}


	static int radixUpRedon(int l) {
		double rad = Math.sqrt(l);
		return (int) Math.ceil(rad);
	}

	static int radixRedon(int l) {
		double rad = Math.sqrt(l);
		return (int) Math.round(rad);
	}

}
