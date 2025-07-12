import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class string{
    public static void main(String[] args){
        //----------------Is Anagram-------------------
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(isAnagram(a,b));

        //----------------------Repeated String---------------------
        // Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();
        // String b = sc.nextLine();
        // System.out.println(repeatedStringMatch(a,b));

        //----------Longest Palindrome in String------------
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(longestPalindrome(str));

        //---------String Buffer-----------
        // StringBuffer sb = new StringBuffer("Suraj");
        // System.out.println(sb.length());
        // sb.insert(5, "Jha");
        // sb.replace(0, 5, "Dhiraj");
        // sb.delete(6, 9);
        // System.out.println(sb);

        //---------Intern() Method---------
        // String s =new String("Suraj");
        // String s1 = "Suraj";
        //Case 1
        //System.out.println(s == s1); //False due to different references

        //Case 2
        // s = s.intern();
        // System.out.println(s == s1); //True due to same references

        //----Count of Lower Case Vowels in String-----
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(countOfLowerCaseVowels(str));

        //------Compressed String------
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(CompString(str));

        //------TOupperCase--------
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(toUpperCase(str));

        //-------String Builder--------
        // StringBuilder sb = new StringBuilder("");
        // for(char i ='a';i<'z';i++)
        // {
        //     sb.append(i);
        // }
        // System.out.println(sb);
        // System.out.println(sb.length());

        //--------Shortest Path---------
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println(shortestPath(s));

        //---------Check If Palindrome-------
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println(isPalindrome(s));

        //---------concatenation-----------
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // String j = sc.nextLine();
        // //System.out.println(s+" "+j);
        // System.out.println(s.concat(" "+j));
        // for (char c : s.toCharArray()) {
        //     System.out.print(c+" ");
        // }
    }

    public static String toUpperCase(String str)
    {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i = 1;i< str.length();i++)
        {
            if(str.charAt(i) == ' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static double shortestPath(String path)
    {
        int x = 0, y = 0;
        double f = 0;
        for(int i =0;i<path.length();i++)
        {
            if(path.charAt(i) == 'E')
            {
                x++;
            }else if(path.charAt(i) == 'N')
            {
                y++;
            }else if(path.charAt(i) == 'W')
            {
                x--;
            }else
            {
                y--;
            }
        }
        f = Math.sqrt(x*x+y*y);
        return f;
    }

    public static boolean isPalindrome(String s)
    {
        boolean b = false;
        
        for(int i =0;i<=(s.length()/2);i++)
        {
            if(s.charAt(i) == s.charAt(s.length()-1-i))
            {
                b = true;
            }else{
                b = false;
                break;
            }
        }
        return b;
    }

    public static String CompString(String str)
    {
        String compStr = "";
        for(int i = 0;i<str.length();i++)
        {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            compStr += str.charAt(i);
            if(count>1)
            {
                compStr+=count.toString();
            }
        }
        return compStr;
    }

    public static int countOfLowerCaseVowels(String str)
    {
        char arr[] = {'a','e','i','o','u'};
        int count = 0;
        for(int i = 0;i<str.length();i++)
        {          
            int j = 0;
            while(j<arr.length)
            {
                if(str.charAt(i) == arr[j])
                {
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    //----------Longest Palindrome in String------------
    public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";

    String longest = "";

    for (int i = 0; i < s.length(); i++) {
        // Check for odd-length palindrome
        int low = i, high = i;
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
        }
        String oddPalindrome = s.substring(low + 1, high);
        if (oddPalindrome.length() > longest.length()) {
            longest = oddPalindrome;
        }

        // Check for even-length palindrome
        low = i;
        high = i + 1;
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
        }
        String evenPalindrome = s.substring(low + 1, high);
        if (evenPalindrome.length() > longest.length()) {
            longest = evenPalindrome;
        }
    }
    return longest;
}

    //----------Roman to Integer--------
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);

        int result = m.get(s.charAt(s.length()-1));

        for(int i = s.length()-2;i>=0;i--)
        {
            if(m.get(s.charAt(i)) < m.get(s.charAt(i+1)))
            {
                result -= m.get(s.charAt(i));
            }
            else
            {
                result += m.get(s.charAt(i));
            }
        }
        return result;
    }

    //----------------------Repeated String---------------------
    public static int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if (sb.toString().contains(b)) {
            return count;
        }

        sb.append(a);
        count++;

        if (sb.toString().contains(b)) {
            return count;
        }

        return -1;
    }

    //----------------Is Anagram-------------------
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}

//---------------------------------Notes-------------------------------------

//1. intern() Method in String
//The intern() method in Java is used to manage memory efficiently
// by storing only one copy of each distinct string value in the string pool.
//E.g.:
// public class Test {
//     public static void main(String[] args) {
//         String s1 = new String("hello");
//         String s2 = "hello";

//         System.out.println(s1 == s2); // false (different references)

//         s1 = s1.intern();

//         System.out.println(s1 == s2); // true (same reference from string pool)
//     }
// }

//2. String Buffer
//StringBuffer is a mutable, thread-safe class used to handle modifiable strings. It is part of java.lang package
// and is an alternative to String when you need to perform frequent string modifications like appending, inserting, deleting, or reversing.
//Common Mehtods
//append(String s)	Adds text to the end
// insert(int offset, ...)	Inserts text at a specific position
// replace(int start, int end, String str)	Replaces characters between indices
// delete(int start, int end)	Deletes characters between indices
// reverse()	Reverses the content
// toString()	Converts StringBuffer to String
// length()	Returns the current length
// capacity()	Returns the current capacity