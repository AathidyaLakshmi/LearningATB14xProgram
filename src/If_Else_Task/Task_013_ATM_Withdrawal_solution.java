package If_Else_Task;

import java.util.Scanner;

public class Task_013_ATM_Withdrawal_solution {
    /*1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
      The amount should be greater than zero.
      The amount should be a multiple of 100 (common ATM rule).
      The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.*/
    public static void main(String[] args) {
        int bank_balance=10000;
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int withdraw_amount= sc.nextInt();
            if(withdraw_amount<=0)
            {
                System.out.println("Entered withdrawal amount should be greater than 0 ");
            }
            else if(withdraw_amount%100!=0) {
                System.out.println("Kindly enter amount in multiples of 100s");
            }
            else if(withdraw_amount>10000)
            {
                System.out.println("Withdrawal amount exceed bank balance");
            }
            else{
                bank_balance=bank_balance-withdraw_amount;
                System.out.println("Amount successfully withdrawn");
                System.out.println("Your Account Balance is Rs:"+bank_balance);
            }
            System.out.println("Transaction failed");
        }
        else{
            System.out.println("Enter amount in numbers");
        }
    }
}
