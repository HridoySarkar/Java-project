import java.util.Scanner;
public class ATM_Machine{
	public static void main(String args[]){
        int balance = 100; //default amount
        int deposit= 0;
        int withdraw;
        
        Scanner sr = new Scanner(System.in);
        while(true){
            System.out.println("ATM MACHINE ONLINE \n");
            System.out.println("Choose 1 for Withdrow");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Balance Check");
            System.out.println("Choose 4 for Exit \n");
            
            System.out.println("Choose any Operation:");
            int choice = sr.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter money amount to Withdrow:"); 
                    withdraw = sr.nextInt();
                    if(balance>=withdraw){
                        balance = balance -withdraw;
                        System.out.println("Collect your money!");
                    }
                    else{
                System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter your amount to Deposit:"); 
                    deposit = sr.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your moneyhas been added" + balance);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance:" + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
            
        }
        
    }
}
