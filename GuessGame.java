public class GuessGame
{
	Player p1;
	Player p2;
	Player p3;

	public void startGame()
	{
	  p1=new Player();
	  p2=new Player();
	  p3=new Player();

	  int guessp1=0;
	  int guessp2=0;
	  int guessp3=0;

	  boolean p1isRight=false;
	  boolean p2isRight=false;
	  boolean p3isRight=false;

	  int targetNumber=(int) (Math.random()*10);
	  System.out.println("я загадываю число от 0 до 9...");

	  while (true)
	  {
	   System.out.println("число которое нужно угадать-" + targetNumber);
	   
	   p1.guess();
	   p2.guess();
	   p3.guess();

	   guessp1=p1.number;
	   System.out.println("первый игрок думает это число-" + guessp1);

	   guessp2=p2.number;
	   System.out.println("второй игрок думает это число-" + guessp2);

	   guessp3=p3.number;
	   System.out.println("третий игрок думает это число-" + guessp3);

	   if (guessp1 == targetNumber){
	   p1isRight=true;}

	   if (guessp2 == targetNumber){
	   p2isRight=true;}

	   if (guessp3 == targetNumber){
	   p3isRight=true;}

	   if (p1isRight || p2isRight || p3isRight){
		System.out.println("у нас есть победитель");
		System.out.println("угадал первый игрок" + p1isRight);
		System.out.println("угадал второй игрок" + p2isRight);
		System.out.println("угадал тертий игрок" + p3isRight);
		System.out.println("конец игры");
		break;
		}else{
			System.out.println("игроки должны попробывать еще!!");
			}
		}
	}
	   
	
}