import java.util.Scanner;

// DA AGGIUNGERE I CONTROLLI PER GLI SCANNER
public class Main {
    public static void main(String[] args) {
        Oven myOven = new Oven("Samsung", 0,0, false, false);

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Digit 1 and then ENTER to Turn On the Oven: ");

            int choice = sc.nextInt();

            if(choice == 1){
                myOven.setIsOn();
                System.out.println("The oven is now on!\n");
                break;
            } else{
                continue;
            }
        }

        while(true){
            System.out.print("Choose the task you wanna do: " +
                    "\n 1. Set time: (" + myOven.getTime() +  " mins)" +
                    "\n 2. Set Degrees (" + myOven.getDegrees() + " degrees)" +
                    "\n 3. Cooking" +
                    "\n 4. Turn Off The Oven " +
                    "\n-->  ");

            int task = sc.nextInt();

            switch (task) {
                case 1:
                    System.out.print("Enter time in minutes: ");
                    int minutes = sc.nextInt();
                    myOven.setTime(minutes);
                    break;
                    case 2:
                        System.out.print("Enter degrees: ");
                        int power = sc.nextInt();
                        myOven.setDegrees(power);
                        break;
                        case 3:
                            if(myOven.getDegrees() != 0 && myOven.getTime() != 0){
                                System.out.print("What do you want to eat? ");
                                String food = sc.next();
                                myOven.cooking(food);

                                if(myOven.getIsReady()){
                                    myOven.eating(food);
                                    myOven.setTime(0);
                                    break;
                                }
                            }else{
                                System.out.println("\nBefore cooking you have to set TIME and DEGREES!\n");
                            }
                            break;
                case 4:
                    myOven.setIsOff();
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }
}
