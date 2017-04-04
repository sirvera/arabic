package tddTest;

public class ArabicToRomans {

	public String convert(int i) {
			String[] arrArabic = {"I","IV","V","IX","X","XL","L","XC","IC","C","D","M"};
			int[] arrDecimal = {1,4,5,9,10,40,50,90,99,100,500,1000};
			int j = arrDecimal.length - 1;
			do {
				if (i >= arrDecimal[j]) {
						i = i - arrDecimal[j];
						return String.valueOf(arrArabic[j]) + convert(i);
				}
				j--;
			} while (i>0);
			return "";
	}
	//prueba

}
