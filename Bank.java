package JavaAss;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class BankWork
{
          final int max_limit=20;
          final  int min_limit=1;
          final double min_bal=500;
         private  String name[]=new String[20];
         private int accNo[]=new int[20];
         private  String accType[]=new String[20];
         private double balAmt[]=new double[20];
         static int totRec=0;
        //constructor
        BankWork()
        {
             for(int i=0;i<max_limit;i++)
             {
                name[i]="";
                accNo[i]=0;
                accType[i]="";
                balAmt[i]=0.0;
            }
        }

        
        
     public void newEntry()
        {
               String str;
               int acno;
               double amt;
               boolean permit;
                permit=true;

               if (totRec>max_limit)
               {
                    System.out.println("\n\n\nSorry we cannot admit you in our bank...\n\n\n");
                    permit=false;
               }

               if(permit = true)   
               {
               totRec++;                  
               System.out.println("\n\n\n=====RECORDING NEW ENTRY=====");
               try{
                          accNo[totRec]=totRec;   
                        System.out.println("Account Number :  "+accNo[totRec]);
                        
                     BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                     System.out.print("Enter Name :  ");
                     System.out.flush();
                     name[totRec]=obj.readLine();

                     System.out.print("Enter Account Type : ");
                     System.out.flush();
                     accType[totRec]=obj.readLine();

                    do{
                           System.out.print("Enter Initial  Amount to be deposited : ");
                           System.out.flush();
                           str=obj.readLine();
                           balAmt[totRec]=Double.parseDouble(str);
                         }while(balAmt[totRec]<min_bal);     

                  System.out.println("\n\n\n");
                    }
                catch(Exception e)
                {}
            }
        }

        
        
        public void display()
        {
              String str;
              int acno=0;
              boolean valid=true;
                           
              System.out.println("\n\n=====DISPLAYING DETAILS OF CUSTOMER=====\n");
              try{
                 BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                 System.out.print("Enter Account number : ");
                 System.out.flush();
                 str=obj.readLine();
                 acno=Integer.parseInt(str);
                  if (acno<min_limit  || acno>totRec)  
                     {
                          System.out.println("\n\n\nInvalid Account Number \n\n");
                          valid=false;
                     }

                    if (valid==true)
                      {     
                        System.out.println("\n\nAccount Number : "+accNo[acno]);
                        System.out.println("Name : "+name[acno]);
                        System.out.println("Account Type : "+accType[acno]);
                        System.out.println("Balance Amount : "+balAmt[acno]+"\n\n\n");
                      }
                 }
            catch(Exception e)
            {}
        }


public void deposit()
          
        {
              String str;
              double amt;
              int acno;
              boolean valid=true;
              System.out.println("\n\n\n=====DEPOSIT AMOUNT=====");
              
              try{
            
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

                        System.out.print("Enter Account No : ");
                        System.out.flush();
                        str=obj.readLine();
                        acno=Integer.parseInt(str);
                         if (acno<min_limit || acno>totRec)   
                         {
                              System.out.println("\n\n\nInvalid Account Number \n\n");
                              valid=false;
                         }
           
                        if (valid==true)
                       {
                            System.out.print("Enter Amount you want to Deposit  : ");
                            System.out.flush();
                            str=obj.readLine();
                            amt=Double.parseDouble(str);

                            balAmt[acno]=balAmt[acno]+amt;

                            System.out.println("\nAfter Updation...");
                            System.out.println("Account Number :  "+acno);
                            System.out.println("Balance Amount :  "+balAmt[acno]+"\n\n\n");
                        }
                 }
            catch(Exception e)
            {}
       }



 public void withdraw()
        {
              String str;
              double amt,checkamt;
              int acno;
              boolean valid=true;
              System.out.println("\n\n\n=====WITHDRAW AMOUNT=====");
              
              try{
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                   
                        System.out.print("Enter Account No : ");
                        System.out.flush();
                        str=obj.readLine();
                        acno=Integer.parseInt(str);

                          if (acno<min_limit || acno>totRec)   
                             {
                                System.out.println("\n\n\nInvalid Account Number \n\n");
                                valid=false;
                            }

                        if (valid==true)
                        {
                                System.out.println("Balance is : "+balAmt[acno]);
                                System.out.print("Enter Amount you want to withdraw  : ");
                                System.out.flush();
                                str=obj.readLine();
                                amt=Double.parseDouble(str);

                                checkamt=balAmt[acno]-amt;

                                if(checkamt >= min_bal)
                                 {
                                    balAmt[acno]=checkamt;
                                    //Displaying Depsit Details
                                    System.out.println("\nAfter Updation...");
                                    System.out.println("Account Number :  "+acno);
                                    System.out.println("Balance Amount :  "+balAmt[acno]+"\n\n\n");
                                }
                                else
                                 {
                                    System.out.println("\n\nAs per Bank Rule you should maintain minimum balance of Rs 500\n\n\n");
                                }
                        }
                 }
            catch(Exception e)
            {}
       }

};

public class  Bank
{
    public static void main(String args[]) 
    {
        String str;
        int choice;
        choice=0;

        BankWork BW_obj = new BankWork();
        

        do
        {
        System.out.println("Choose Your Choices ...");
        System.out.println("1) New Record Entry ");
        System.out.println("2) Display Record Details ");
        System.out.println("3) Deposit...");
        System.out.println("4) Withdraw...");
        System.out.println("5) Exit");
         System.out.print("Enter your choice :  ");
        System.out.flush();
              try{
                   BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                   str=obj.readLine();
                   choice=Integer.parseInt(str);

                          switch(choice)
                           {
                            case 1 :  
                                            BW_obj.newEntry();
                                           break;
                            case 2 : 
                                           BW_obj.display();
                                           break;
                            case 3 : 
                                            BW_obj.deposit();
                                           break;
                            case 4 : 
                                            BW_obj.withdraw();
                                            break;
                            case 5  :  System.out.println("\n\n.....THANKS FOR VISITING.....");
                                            break;
                            default : System.out.println("\nInvalid Choice \n\n");
                          }
                    }
                catch(Exception e)
                {}
            }while(choice!=5);
    }
}

// output Choose Your Choices ...
/*
1) New Record Entry 
2) Display Record Details 
3) Deposit...
4) Withdraw...
5) Exit
Enter your choice :
//*/