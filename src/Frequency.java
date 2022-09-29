public class Frequency {
    public static void main(String[] args) {
        //Initializing an array f
        int [] numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        //This array  has to store frequency to find
        int [] frequency = new int [numbers.length];
        int counted = -1;
        for(int i = 0; i < numbers.length; i++){
            int count = 1;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                    // frequency of same element again not come again
                    frequency[j] = counted;
                }
            }
            if(frequency[i] != counted)
                frequency[i] = count;
        }

        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != counted)
                System.out.println("Element: "+numbers[i] + " Frequency: " + frequency[i]);
        }
    }
}
