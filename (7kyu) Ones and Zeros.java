import java.util.List;

public class BinaryArrayToNumber {

        public static int ConvertBinaryArrayToInt(List<Integer> binary) {

            // take in the list of numbers
            // maybe convert the numbers into an integer, or maybe not as iterating through them individually is probably easier
            // run the numbers through the binary to int formula
            // assign the current Total of the formula calculations to a variable outside the scope, that increases

            int binaryAsInteger = 0;

            for (int i = 0; i < binary.size(); i++) {
                int currentListNumber = binary.get(i);
                int numberConverted = (2*binaryAsInteger) + currentListNumber;
                binaryAsInteger = numberConverted;
            }
            return binaryAsInteger;
        }
    }