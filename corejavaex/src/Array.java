import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        char[] consonants = {'u','a','o','e','i'};
//
//        Arrays.sort(consonants);
//        //System.out.println(Arrays.toString(consonants));
//        for(int i=0; i<consonants.length; i++){
//            System.out.println(consonants[i]);
//        }

        char[] consonants = {'n','d','h','p','r'};

        Arrays.sort(consonants);
        System.out.println(Arrays.toString(consonants));
        for(int i=0; i<consonants.length; i++){
            System.out.println(consonants[i]);
        }

        //sort the array in descending order
        char[] reverse = new char[consonants.length];
        for (int i = 0; i < consonants.length; i++) {
            reverse[i] = consonants[consonants.length - 1 - i];
        }
        System.out.println("Sorted array in descending order: " + Arrays.toString(reverse));
        String customToString = "[";
        for(int i = 0; i<consonants.length;i++){
            if(i == (consonants.length -1) ) {
                customToString = customToString + consonants[i] ;
            }
            else
            {
                customToString = customToString + consonants[i] + " ,";
            }
        }
        customToString += "]";
        System.out.println(customToString);

        // Normal (linear) search for an element in the array
        char searchChar = 'r';
        int index = -1;
        for (int i = 0; i < consonants.length; i++) {
            if (consonants[i] == searchChar) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element " + searchChar + " found at index: " + index);
        } else {
            System.out.println("Element " + searchChar + " not found in the array.");
        }
    }
}
