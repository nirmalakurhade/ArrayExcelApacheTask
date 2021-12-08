package jbk;

public class MaxElement {
   public static boolean isRepeat(String word) {
   boolean isFound= false;
   char[] ch = word.toCharArray();
   outer:
	   for(int i=0; i<ch.length;i++)
	   {
		   inner:
			   for(int j =i+1; j<ch.length;j++)
			   {
				   if(ch[i]==ch[j])
				   {
					   isFound=true;
					   break outer;
					   
					   
				   }
			   }
	   }
   return isFound;
   } 
   public static void main(String[] args) {
	String s ="nirmala sdashiv kurhade";
	String[] words=s.split(" ");
	String maxString="nir";
	for(String word :words)
	{
		if(!isRepeat(word))
		{
			if(word.length()>maxString.length())
			{
				maxString=word;
			}
		}
	}
	System.out.println(words);
}
}
