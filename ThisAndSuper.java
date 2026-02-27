package forLearning;

public class ThisAndSuper {
	
	int num;
	
	ThisAndSuper(int num){
		this.num = num;
	}
	void show() {
		System.out.println(num);
	}
	
	ThisAndSuper(){
		this(10);
		System.out.println("Chaining");
	}
	
	

	public static void main(String[] args) {
		
		ThisAndSuper obj = new ThisAndSuper();
		obj.show();
		
		 
		
		
		
	}

}
