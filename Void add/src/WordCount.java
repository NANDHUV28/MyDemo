public class WordCount {
    public static void main(String[] args) {
        String input="Sum of 12 and 20 is 32";
        int word=countWords(input);
        System.out.println(word);
    }

    public static int countWords(String input) {
        //isEmpty operator checks if a string contains no characters and is only whitespace
        //isNull operator checks a string and returns a boolean value
        if(input==null || input.isEmpty()){
            return 0;
        }
        //remove trailing or whitespace - trim
        //split the string into string of array with separator as space or multiple spaces
        String[] words=input.split(" ");

        int wordCount=0;
        for(String word:words){
            try {
                //parseint - parses a string and returns an integer
                Integer.parseInt(word);
            }
            catch(NumberFormatException e){
                wordCount++;
               // System.out.println(word+word.length());
            }
        }

        return wordCount;
    }
}

