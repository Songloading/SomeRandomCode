
public class StringCompression {
	/**
	 * Given an array of characters, compress it in-place.
	 * The length after compression must always be smaller than or equal to the
	 * original array.
	 * Every element of the array should be a character (not int) of length 1.
	 * After you are done modifying the input array in-place, return the new
	 * length of the array.
	 * 
	 * Example 1: 
	 * Input: ["a","a","b","b","c","c","c"]
	 * Output: Return 6, and the first 6 characters of the input array should
	 * be: ["a","2","b","2","c","3"]
	 * Explanation: "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is
	 * replaced by "c3". 
	 * 
	 * Example 2: 
	 * Input: ["a"]
	 * Output: Return 1, and the first 1 characters of the input array should
	 * be: ["a"]
	 * Explanation: Nothing is replaced. 
	 * 
	 * Example 3: 
	 * Input: ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
	 * Output: Return 4, and the first 4 characters of the input array should
	 * be: ["a","b","1","2"].
	 * Explanation: Since the character "a" does not repeat, it is not
	 * compressed. "bbbbbbbbbbbb" is replaced by "b12". Notice each digit has
	 * it's own entry in the array.
	 * 
	 */
	
	public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray()) 
                    chars[indexAns++] = c;
        }
        return indexAns;
    }
	/**
	 *  IM A DOLL IM A DOLL IM A DOLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
	 *  Smart algorithm here. Using a int from 0 to keep track of the each character.(character + amount)
	 */
	
}