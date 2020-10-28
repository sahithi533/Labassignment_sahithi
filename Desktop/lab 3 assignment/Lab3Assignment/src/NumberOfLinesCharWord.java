/**
 * desc: program that displays the number of characters, lines and words in a text
 * author@ Yerram Sahithi
 * Date:28-10-2020
 */

public class NumberOfLinesCharWord {
	public static void main(String args[]) {
		int character=1,count_word=1,count_line=1,len;
		String text= "Good Morning\nMy name is Sahithi Yerram\nThis is a Java program";
		len=text.length();
		for(int i=0;i<len;i++) {
		character++;
		
		//counting words
		if (text.charAt(i) == ' '|| text.charAt(i) == '\n')
		{
			count_word++;
		}
		//cpunting lines
		if(text.charAt(i)=='\n' )
		{
			count_line++;
		}
    }
	System.out.println("Number of characters "+character);       //printing number of characters
	System.out.println("Number of words "+count_word);           //printing number of words
	System.out.println("Number of lines "+count_line);           //printing number of lines
	}
}
