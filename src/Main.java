import java.util.Scanner;

//Program that prompts user for age. The age needed is 21+ to enter a 21+ club.
//Program will prompt user 3 times then terminate, if 21 & over is entered before 3rd attempt program will also terminate.

/**
 * Published by:
 * @ Juan Salgado
 *
 */

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int age;
                for(int i = 0; i< 3; i++) {

                    System.out.print("Enter your age: ");
                    age = scanner.nextInt();

                    if(age >= 21){
                        System.out.println("PLease Enter");
                        break;
                    }
                    else {
                        System.out.println("Underage");
                    }
                }

                scanner.close();
            }

        }
