

/*write a java program how to atm works ,like my atm pin=1234 .when we entere this pin
then show other function like,check balance,withraw,...and oterwise exit*/

import java.util.Scanner;
class Main{
  //suppose my balance=15000
    static int bal=15000;
    public static void main(String[]args){
      //you have only three chances are given
        int pin,pinchances=3,amt;
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to central bank of india::");
        while(true){
          //what is your atm pin enter here .

            System.out.println("enter your at pin::");
            pin=sc.nextInt();
            if(pin==1111||pin==2222||pin==3333){
                while(true){
                  /*while atm pin is correct then show this function.
                  if you enter 1 then show check balance......*/
                    System.out.println("1.CHECK BALANCE\n2.DEPOSITE\n3.WITHRAW.\n4EXIT");
                    switch(sc.nextInt()){
                      //here show your bank balance
        case 1:
             System.out.println("Available bal:"+bal);
             break;
             //how many money you want to deposite in your account4
      case 2:
            System.out.println("enter amount");
             amt=sc.nextInt();
            if(amt%100==0){
             bal+=amt;
            System.out.println("Available Bal:"+bal);
          }
            else
             System.out.println("Invalid format");
             break;
     case 3:
     //how many you want to withraw 
           System.out.println("Enter Amount");
         amt= sc.nextInt();
         if(amt%100==0){
          if(amt<=bal)
         {
             bal-=amt;
         System.out.println("Available Bal:"+bal);
         }
         else
           System .out.println("IF");
                                
           }
         else
           System.out.println("Invalid format");
         break;
     case 4:
         System.out.println("Thank you");
         System.exit(0);
         default:
       System.out.println("Invalid choice,please enter valid choice");
        }
    }
}
                           
      else{ 
          System.out.println("wrong pin");
       System.out.println("LEFT over Chances::"+--pinchances);
       if(pinchances==0){
      System.out.println("Invalid pin THANK YOU!!");
      System.out.println("if youu want to change atm pin then you go to first bank and verify it ");
       System.exit(0);
                }
            }
        }

    }
}
