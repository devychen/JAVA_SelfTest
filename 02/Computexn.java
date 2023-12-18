import java.util.Scanner;

public class Computexn {
    public static void main(String[] args) {
        
        int x = 0;
        int n = 0;

        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("Enter the value of the base x: ");
            if(keyboard.hasNextInt()){
                x =  keyboard.nextInt();
                break;
            } else {
                System.out.println("Error: Bad Input. Need to be integers.");
                keyboard.nextLine();
            }
        }

        while (true){
            System.out.println("Enter the value of the component n: ");
            if(keyboard.hasNextInt()){
                n =  keyboard.nextInt();
                if (n >= 0){
                    break;
                } else {
                    System.out.println("Error: Bad Input. Need to >= 0.");
                }
                break;
            } else {
                System.out.println("Error: Bad Input. Need to be integers. ");
                keyboard.nextLine();
            }     
        }

        int result = 1; // defalt value=1, var[result] to store result;
        for (int i = 0; i < n; i++) { // defalt loop var[i] = 0; condition until >=; add value after each loop;
            result *= x; // result*x after each loop and store to [result], loop n times;
        }

        System.out.println(x + " ^ " + n + " = " + result);

        keyboard.close(); 
    }
}    

/* 
        System.out.println("Enter the value of the exponent n ");
        if(!keyboard.hasNextInt()){
            System.out.println("Error: Bad Input.");
            System.exit(1);
        }
        int n = keyboard.nextInt();

        if(n < 0){
            System.out.println("Error: Bad Input.");
            System.exit(1);
        }
    }    
}

*/