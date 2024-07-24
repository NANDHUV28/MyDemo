public class StrMethods {
    public static void main(String[] args) {
        String name="Nandhini";

        for(int i=0;i<name.length();i++){
            // charAt - reading letter by letter by indexed
            System.out.print(name.charAt(i));
        }
        System.out.println();
        //contains - checks whether the string is present
        System.out.println(name.contains("in"));
        //length - prints the length of string
        System.out.println(name.length());
        //indexOf - prints the particular index number string
        System.out.println(name.indexOf('d'));
        //equals - checks the string are identical
        System.out.println(name.equals("NandhinI"));
        //equalsIgnorecase - ignores case senstive
        System.out.println(name.equalsIgnoreCase("NandhinI"));
        //join/concatenate - adds to the exisiting string
        System.out.println(name.concat(" Venkatesan"));
        //lastIndexOf - traverse from last
        System.out.println(name.lastIndexOf('n'));
        //substring - start & end element but end is explicit
        System.out.println(name.substring(5,8));
        //toLowerCase - lowercase
        System.out.println(name.toLowerCase());
        //toUpperCase - uppercase
        System.out.println(name.toUpperCase());
        //trim - removes trailing or whitespace from front & back
        String str="      Hello World  ";
        System.out.println(str);
        System.out.println(str.trim());




    }
}
