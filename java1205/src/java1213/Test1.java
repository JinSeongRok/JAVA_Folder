package java1213;


public class Test1 {
	
	
	public static void main(String[] args) {
		
		
		SutdaCard card1 = new SutdaCard(3, false); //  card1 num : 3, isKwang : false
		SutdaCard card2 = new SutdaCard(); // card2 num : 1, isKwang : true
		
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
		}
	}		
	
		class SutdaCard {
			int num;
			boolean isKwang;			
		
		SutdaCard(){
				this.num = 1;
				this.isKwang = true;
		}
		
		SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}
		
		public String info() {
			if(isKwang) return num+"K";
			else return num+"";
		}
	
		
}

