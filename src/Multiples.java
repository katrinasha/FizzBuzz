public class Multiples {
    public static void main(String[] args) {
        //write a main method that prints how many multiples of 3 or 5 there are below 1000
        int count = 0;
        for (int i = 1; i < 1000; i++){

            boolean multiplesOf3 = i % 3 == 0;
            boolean multiplesOf5 = i % 5 == 0;
            if (multiplesOf3){

                count += 1;

            }else if (multiplesOf5){

                count += 1;
            }
        }
        System.out.println(count);
    }
}
