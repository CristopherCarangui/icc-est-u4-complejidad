import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int nu =10;
        int [] array =new int[] {1,2,6,70,5};
        System.out.println(nu);
        System.out.println(Arrays.toString(array));
        for(int i= 0; i<array.length;i++){
            System.out.println(i);
        }
        for(int i : array){
            System.out.println(i);
        }
    }
}
