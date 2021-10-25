package pl.MaciejPrzezwicki;

public class Main {
//Simple FizzBuzz game - when a number between 0-100 is divisible by 3, the program displays "Fizz",
// when it is divisible by 5, the program displays "Buzz",
// when it is divisible by 3 and by 5 simultaneously, the program displays "FizzBuzz"
    public static void main(String[] args) {
	    for (int i = 0; i <101; i++){
            if(i % 3 ==0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
