package dani.rafa.elena;

public class Love {
	
	//This method should be written in the front side of the t-shirt
	public static void main(String[] args) {
		int love_length = 12; 

		StringBuilder love = new StringBuilder();
		for (int i = 0; i < love_length; i++) {
			String word = getWordFromBack(i);
			
			love.append(word).append((char) 32);
		}
		
		System.out.println(love.toString());
		
		//The two lines below should be removed
		String mustbe = "I have found the one whom my soul loves. Happy birthday sweetie. ";
		System.out.println(mustbe.equals(love.toString()));
	}

	//This method should be written in the back side of the t-shirt
	private static String getWordFromBack(int i) {
		switch(i){
		case 9: return "friends".replace("ends", "py").replace("fri", "Hap"); //Happy
		case 1: return new String(new byte[]{(byte)(13 << 3), 'a', 0x76, 'e'}); //have
		case 7: return "aNsLouleeNa".replaceAll("[eLeNa]", "");//soul
		case 8: return "farlrofvaearfs.".replaceAll("[rafa]", ""); //loves.
		case 0: return (char)('i' - 32) + "";  //I
		case 11: return new StringBuilder(".eiteews").reverse().toString(); //sweetie.
		case 3: return "tie".replace("i", "h"); //the
		case 6: return (char)('6'+'7') + "" + (char)('<'+'=') + ""; //my
		case 2: return "bifOroAuainrad".replaceAll("[bOrAiTa]", "");
		case 4: return "one".trim().intern(); //one
		case 10: return "birthbirthdayday".substring(5, 13); //birthday
		case 5: return new String(new byte[]{'w', 0150, (byte)(27<<2)+3, 0155}); //whom
		default: 
			throw new IllegalStateException("There is a bug in the t-shirt!.");
		}
	}

}
