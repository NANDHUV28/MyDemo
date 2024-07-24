public class MultipleCatchBlock {
    public static void main(String args[]){
        try{
            int[] arr={1,2,3};
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Caught ArrayIndexException: "+arrayIndexOutOfBoundsException.getMessage());
        }catch (Exception e){
            System.out.println("Generic Exception: "+e.getMessage());
        }
    }
}
