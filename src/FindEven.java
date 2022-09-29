public class FindEven {
    public static void main(String[] args)
    {
        int [] a = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Elements which are at  even position: ");

        for (int i = 1; i < a.length; i = i+2){
            System.out.print(a[i] + " ");
        }
    }
}
