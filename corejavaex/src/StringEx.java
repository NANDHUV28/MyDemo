public class StringEx {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        //== checks reference of obj
        //isequals checks only the objs
        if(s1.equals(s2)){
            System.out.println("1-Equals");
        }
        if(s1==s2){
            System.out.println("1-Identical");
        }

        s2=new String("Helo");
        if(s1.equals(s2)){
            System.out.println("2-Equals");
        }
        if(s1==s2){
            System.out.println("2-Identical");
        }

        String s3="Helo";
        s1=s3;
        s2=s1;

        if((s1.equals(s2) && s2.equals(s3) && s3.equals(s1) && (s1==s2 && s2==s3 && s3==s1))){
            System.out.println("All are identical and equal");
        }
//        if(s1.equals(s2)){
//            System.out.println("3-Equals");
//        }
//        if(s1==s2){
//            System.out.println("3-Identical");
//        }
    }
}
