
public class Stringrev {

	public static void main(String[] args) {
		
		String str = "teajfhka";
		String Rev = "";
		
		byte[] ArrayStr = str.getBytes();
		byte[] result = new byte[ArrayStr.length];
		
		for(int i=0;i<str.length();i++)
			result[i]=ArrayStr[ArrayStr.length-i-1];
		System.out.println(new String(result));

	}

}
