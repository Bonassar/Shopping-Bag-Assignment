
public class groceryItem {

	 private String name;
	 private int sizeVal, weightVal, squishVal, breakyVal;
	 
	 public groceryItem(String nameIn, String sizeIn, String weightIn, String squishIn, String breakyIn){
		 	//name
			name = nameIn;
			//size
			if(sizeIn.equals("small")){
				sizeVal = 1;
			}
			if(sizeIn.equals("medium")){
				sizeVal = 2;
			}	
			if(sizeIn.equals("large")){
				sizeVal = 3;
			}
			//weight
			if(weightIn.equals("light")){
				weightVal = 1;
			}
			if(weightIn.equals("medium")){
				weightVal = 2;
			}
			if(weightIn.equals("heavy")){
				weightVal = 3;
			}
			//squish
			if(squishIn.equals("soft")){
				squishVal = 1;
			}
			if(squishIn.equals("flexible")){
				squishVal = 2;
			}
			if(squishIn.equals("rigid")){
				squishVal = 3;
			}
			//breaky
			if(breakyIn.equals("nonbreakable")){
				breakyVal = 1;
			}
			if(breakyIn.equals("breakable")){
				breakyVal = 2;
			}
	 }
	 

	

}
