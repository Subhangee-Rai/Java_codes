import java.util.Random;
import java.util.Scanner;

class Game{
    int comp_num,user_num,count;
    public  Game()
    {
        Random random=new Random();
        comp_num=random.nextInt(100);
    }
     public void userInput(int un){
        user_num=un;
     }
     public void check(){
        count=1;
        while(!(user_num==comp_num))
        {
            Scanner sc=new Scanner(System.in);
            if(user_num<comp_num)
            {
                System.out.println("Think for a larger number");
                user_num=sc.nextInt();
                count++;
            }
            else if(user_num>comp_num)
            {
                System.out.println("Think of a smaller number");
                user_num=sc.nextInt();
                count++;
            }
        }
        System.out.println("Number matched");
     }
     public void getScore()
     {
         System.out.println("Your score out of 10 is: "+(10-count));
     }
}


public class OOPs_guess_number_game {
    public static void main(String[] args) {
        Game obj=new Game();
        int uno;
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess a number: ");
        uno=sc.nextInt();
        obj.userInput(uno);
        obj.check();
        obj.getScore();
    }
}
