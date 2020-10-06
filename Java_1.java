package Java_Code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[-+_!@#$%^&*., ?]).+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("#GeeksForGeeks123@");
		if(m.find())
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
