public class XO {
  
  public static boolean getXO (String str) {

        //need a count for both x's and o's
        int xCount = 0;
        int oCount = 0;

        //need a for loop to go through the given string
        // use .charAt to get the individual char from the String given.
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String currentLetter = "" + currentChar;

            //need an if statement to check whether there is an x or o
            //increment the count based on the if statement
            if (currentLetter.toLowerCase().equals("x")) {
                xCount++;
            }else if (currentLetter.toLowerCase().equals("o")) {
                oCount++;
            }
            currentLetter = "";
        }
        
        //if the x's and o's in the string are equal, then return true.
        //if the count of both x's and o's is 0, the above condition already returns true as they are equal.
        //if one is greater than the other, then it is false. So anything other then the above, return false.

        if (xCount == oCount) {
            return true;
        }else {
            return false;
        }
    }
}