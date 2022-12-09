import java.util.Scanner;
public class Rock_Paper_Scisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets Play Rock ");
        System.out.println("When I Say 'Shout' Choose Rock , Paper , Scissors..");
        System.out.println("Are You ready ?? Type 'yes' if you are ");
        String ready = sc.nextLine();
        
        if(ready.equals("yes")){
            System.out.println("\n Great !!");
            System.out.println(" rock - paper - scissors, Shout!!");
            String choice = sc.nextLine();
            sc.close();
        String compChoice = compChoice();
        System.out.println("You Chose : " + choice);
        System.out.println("Computer chose :" + compChoice);
        String result = result(choice , compChoice);
        System.out.println(result);
       
        }

        else{System.out.println("OK Lets play Some Other time ..");}

    }
        
   
    public static String compChoice(){
        double randomNum = Math.random()*3;
        int integer =(int)randomNum;
        switch(integer){
            case 0 : return "rock";
        
            case 1 : return "paper";
            case 2 : return "scissors";
            default : return " ";
        }
    }

    public static String result(String yourchoice , String computerChoice){
        String result =" ";
        if(yourchoice.equals("rock") && computerChoice.equals("scissors")){
            return "You Win !!";
        }else if(yourchoice.equals("paper") && computerChoice.equals("rock") ){
            return "You Win";
        }else if(yourchoice.equals("scissors") && computerChoice.equals("paper")){
            return "You Win ";
        }else if(yourchoice.equals("scissors") && computerChoice.equals("rock")){
            return "You Lose";
        }else if(yourchoice.equals("rock") && computerChoice.equals("paper")){
            return "You Lose";
        }else if(yourchoice.equals("paper") && computerChoice.equals("scissors")){
            return "You Lose";

        }else if(yourchoice.equals(computerChoice)){
            return "Its an Tie";
        }else{
            System.out.println("Invalid!!!!");
            System.exit(0);
        }
        return result;
    }
    

    }
 

      



