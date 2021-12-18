/**Exercise01. Write a Java program to create a method CountVowelsInAWord(string 
word) that count all vowels in a string. For example, the word “taibah university” has 7 
vowels. 
Note: These letters are vowels in English: a, e, i, o, u.  */

//writing by Ghada
public class Exercise01Lap9 {
  
public static void main(String[] strings) {
    String s="taibah";
    System.out.println("the number of vowel is "+s+"is"+countvowel(s));
}
public static int  countvowel(String word){
  int count = 0;//قيمة العداد الاولي 
    for(int i=0;i<word.length();i++){
          
        if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='o'||word.charAt(i)=='i'||word.charAt(i)=='u')
         count++;   
    }
    return count;
}
}