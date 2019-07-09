package socket;

//456
public class Demo {
	public static int inc (int temp){
		if(temp>0){
			return temp*2;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		System.out.println(inc(10)+inc(8)+inc(-10));
	}

}
