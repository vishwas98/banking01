package banking01;
import java.util.*;


/**
 * THIS PROGRAM DEALS WITH BASIC OPERAIONS OF BANK
 * The case 1 deals with creation of account
 * The case 2 deals with deposit of money
 * The case 3 deals with withdraw of money
 * The case 4 deals with transfer of money from one account to another
 * The case 5 deals with finding the total amount of money in the bank
 * Case 6 will find the richest person in the bank
 * @author ATOMIC FLEA
 */
public class Banking01
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int choice,i,accno,balance=0,amt,sum=0,max,j,acc_withdraw,acc_deposit,account_no;
        int a[]=new int[10];
        boolean found4=false;
        Application[] obj=new Application[6];
        for(i=0;i<obj.length;i++)
        {
            obj[i]=new Application();
        }
        i=0;
        do
        {
            System.out.println("Enter \n1.Add account\n2.Deposit money\n3.Withdraw money\n4.Transfer money into other account\n5.Total amount of money in the bank\n6.Richoiceest person in the bank.");
            choice=inp.nextInt();
            switch(choice)
            {
                case 1:
                    obj[i].create();
                    for(j=0;j<i;j++)
                    {
                        if(obj[j].account_no==obj[i].account_no)
                            found4=true;
                    }
                    if(found4)
                    {
                        System.out.println("Account no already exist Please re-enter the account no::");
                        obj[i].create();
                    }
                    else
                         obj[i].display();
                    i++;
                    break;
                case 2:System.out.println("Enter the account no::");
                        accno=inp.nextInt();
                        boolean found=false;
                        for(i=0;i<obj.length;i++)
                        {
                            if(obj[i].account_no==accno)
                            {
                                 found=true;
                                 break;
                            }
                        }                        
                        if(!found)
                            System.out.println("Account doesnot exist");
                        else
                        {     
                            System.out.println("Enter the amount to deposit::");
                            amt=inp.nextInt();
                            System.out.println("balance :"+obj[i].deposit(accno,amt,balance)); 
                        }
                        break;
                case 3:System.out.println("Enter the account no::");
                        accno=inp.nextInt();
                        boolean found1=false;
                        for(i=0;i<obj.length;i++)
                        {
                             if(obj[i].account_no==accno)
                            {
                                 found1=true;
                                 break;
                            }
                        }
                        if(found1)
                        {
                            System.out.println("Enter the amount to withdraw::");
                            amt=inp.nextInt();
                            System.out.println("Balance="+obj[i].withdraw(accno,amt,balance));
                        }
                        else
                            System.out.println("Account doesnot exist");
                        break;
                case 4:System.out.println("Enter the account no of transferer:");
                        acc_withdraw=inp.nextInt();
                        System.out.println("Enter the account no to whom you want to transfer :");
                        acc_deposit=inp.nextInt();
                        boolean found3=false;
                        for(i=0;i<obj.length;i++)
                        {
                            for(j=0;j<obj.length;j++)
                            {
                                if(obj[i].account_no==acc_withdraw&&obj[j].account_no==acc_deposit)
                                {
                                   System.out.println("Enter the amount to be transferred :");
                                    amt=inp.nextInt();
                                    if(obj[i].balance>amt)
                                    {
                                         obj[i].balance-=amt;
                                         obj[j].balance+=amt;
                                         System.out.println("Balance of account from which money is transferred ::"+obj[i].balance);
                                         System.out.println("Balance of account to which  money is recieved::"+obj[j].balance);
                                    }
                                            
                                    
                                }
                            }
                        }
                        if(!found3)
                        {
                            System.out.println("Wrong account number entered!!!");
                        }
                        break;
                case 5: System.out.println("Total amount of money in the bank is::");   
                        for(i=0;i<obj.length;i++)
                        {
                            sum+=obj[i].balance;
                        }
                        System.out.println(sum);
                        break;
                case 6:max=0;
                        for(j=1;j<obj.length;j++)
                        {
                            if(obj[j].balance>obj[max].balance)
                            {
                                max=j;
                            }
                        }
                    System.out.println("The richest person in the bank is::"+obj[max].name+" whose account number is::"+obj[max].account_no);
                    break;                   
            }
        }while(choice!=7);
    }
}
