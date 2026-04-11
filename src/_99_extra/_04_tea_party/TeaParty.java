package _99_extra._04_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        if(isWoman == false && isKnighted == true) {
	        	return "Hello Sir " + name;
	        }
	        else if(isWoman == false) {
	        	return "Hello Mr. " + name;
	        }
	        else if(isWoman && isKnighted) {
	        	return "Hello Lady " + name;
	        }
	        else {
	        	return "Hello Ms. " + name;
	        }
	       
	}

}
