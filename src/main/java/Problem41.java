import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Java Data Structures Data Java Hashset
class Player implements Comparable<Player>
{
    private String name;
    private int score;

    public Player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public String getName()
    {
        return this.name;
    }

    public int getScore()
    {
        return this.score;
    }

    @Override
    public String toString()
    {
        return this.name +" "+ this.score;
    }

    @Override
    public int compareTo(Player t)
    {
        if(this.getScore()!=t.getScore())
            return t.getScore()-this.getScore();
        return this.getName().compareTo(t.getName());
    }

}

public class Problem41
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        ArrayList<Player> arr=new ArrayList<>();
        int n = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            String name = scan.next();
            int score = scan.nextInt();

            Player tmp=new Player(name, score);
            arr.add(tmp);
        }
        Collections.sort(arr);

        arr.forEach(item -> System.out.println(item));
    }
}
