
public class PrimitiveDatatypes {

	public static void main (String []args) {
		int integer_num;
		char character;
		short short_int;
		byte byte_int;
		long long_int;
		float float_num;
		double double_num;
		boolean bool_num;
		integer_num = 32;
		short_int = 68;
		byte_int = 8;
		character = 'b';
		long_int = integer_num + short_int + byte_int + character;
		float_num = 232.3f;
		double_num = (2*float_num);
		if (double_num > long_int){
			bool_num = true;
			}
		else{
			bool_num = false;
		}
		System.out.println("integer nuber is " +integer_num);
		System.out.println("short integer is " +short_int);
		System.out.println("byte nuber is " +byte_int);
		System.out.println("value of character is " +character);
		System.out.println("long integer is " +long_int);
		System.out.println("float number is " +float_num);
		System.out.println("value of double is " +double_num);
		System.out.println("boolean = " +bool_num);
		
			
	}
}
