/* Program to check the case of a character in java */

import java.util.Scanner;

class CharCase
{
	public boolean UpCse (char CompChar)
	{
		boolean Rslt;
		Rslt = Character.isUpperCase(CompChar);
		return (Rslt);
	}
}


class CheckCase
{
	public static void main (String args[])
	{	
		Scanner UserInput = new Scanner(System.in);
		String CheckChar =new String();
		System.out.print ("Enter the character to be checked: ");
		CheckChar = UserInput.next();
		CharCase Obj = new CharCase();
		System.out.println();
		if (Obj.UpCse(CheckChar.charAt(0))== true) System.out.println ("This is in Upper Case");
		else System.out.println ("This is in Lower Case");
	}
}