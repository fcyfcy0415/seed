package reserve;

public class add { 
	public static void main(String[] args) {
		String str = "";
		while(true){
			str += (int)(Math.random()*9999999);
			if(str.length() == 7){
				break;
			}
		}
		System.out.println(str);
	}

}
