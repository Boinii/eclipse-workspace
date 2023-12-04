package Com.Stringcomparaction;

public class Stringcomparationexamples {

	public static void main(String[] args) {
		String string1="LiveTech";
		String string2="LiveTech";

		int a=30;
		int b=20;

		if(string1.equals(string2))
		{
		System.out.println(" string1 variable value is EQUAL to string2 variable value ");
		}
		else
		{
		System.out.println(" string1 variable value is NOT EQUAL to string2 variable value ");
		}

		System.out.println(" ########################################## ");
		System.out.println();

		String string3="LiveTech";
		String string4="Livetech";
		if(string3.equals(string4))
		{
		System.out.println(" string3 variable value is EQUAL to string4 variable value ");
		}
		else
		{
		System.out.println(" string3 variable value is NOT EQUAL to string4 variable value ");
		}


		System.out.println(" ########################################## ");
		System.out.println();


		String string5="LiveTech"; // expected text - client
		String string6="LIVETECH"; // actual text - developer developed
		if(string6.equalsIgnoreCase(string5))
		{
		System.out.println(" string6 variable value is EQUAL to string5 variable value ");
		}
		else
		{
		System.out.println(" string6 variable value is NOT EQUAL to string5 variable value ");
		}
		


		String string7="LiveTech"; // expected text - client
		String string8="Tech"; // actual text - developer developed

		if(string8.contains(string7))
		{
		System.out.println(" String8 variable value Contains String7 variable value ");
		}
		else
		{
		System.out.println(" String8 variable value Does NOT Contains String7 variable value ");
		}


		System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$44 ");



		String string9="LiveTech"; // expected text - client
		String string10="Tech"; // actual text - developer developed

		if(string9.contains(string10))
		{
		System.out.println(" String9 variable value Contains String10 variable value ");
		}
		else
		{
		System.out.println(" String9 variable value Does NOT Contains String10 variable value ");
		}

		System.out.println();

		System.out.println(" ******** String value convertion to UpperCase ********** ");

		String stringToUpperCase=string9.toUpperCase();
		System.out.println(" The value of the String value stringToUpperCase after converting to UpperCase is :- "+stringToUpperCase);

		System.out.println(" ******** String value convertion to LowerCase ********** ");

		String stringToLowerCase=string9.toLowerCase();
		System.out.println(" The value of the String value stringToLowerCase after converting to UpperCase is :- "+stringToLowerCase);

		System.out.println();
		System.out.println(" ***** Finding the Number of Characters in a String ******* ");

		int string10CharacterLength=string10.length();
		System.out.println(" The number of Characters of the String Variable String10 is :-"+string10CharacterLength);

		System.out.println();
		char hello=string9.charAt(7);
		System.out.println("Finding the 4th character of the String variable string9 is :- "+hello);

		System.out.println();
		System.out.println(string9.charAt(5));

		System.out.println();

		String string11="LiveTech"; 
		String string12="Technologies"; 

		int string11Length=string11.length();
		int string12Length=string12.length();

		System.out.println(" The string11 variable length is :- "+string11Length);
		System.out.println(" The string12 variable length is :- "+string12Length);

		if(string11Length>string12Length)
		{
		System.out.println(" The number of characters of string11 variable value is greater than string12 variable value ");
		}
		else
		{
		System.out.println(" The number of characters of string12 variable value is greater than string11 variable value ");
		}


	}

}
