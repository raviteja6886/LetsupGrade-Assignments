public class PalindromeExample
	{
	public static void main(String[] args)
	{
		String str = "abba";
		String reverse="";
		int len = str.length();
		for(int i = len-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("given string is Palindrome");
		}
		else
		{
			System.out.println("given string is Palindrome");
		}
			
	}
}