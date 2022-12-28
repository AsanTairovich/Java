public class Main {
    public static void main(String[] args) {

        System.out.println(number(11,2,3,45,4,5,65,6));
        System.out.println();
    }
    static int number (int ...arr){
        int num1 = 0;
        for (int i = 0; i < arr.length; i++) {
           num1 +=arr[i];
        }
        return num1;

    }
}