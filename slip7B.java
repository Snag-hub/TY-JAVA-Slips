import java.util.Scanner;

/*Write a java program to accept details of ‘n’ cricket player (pid, pname, totalRuns, InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the details of player having maximum average. (Use Array of Object*/

class slip7B {
    public static void main(String arg[])

    {

        long Matches, runs, innings, notout;

        double avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of matches played");

        Matches = sc.nextLong();

        while (true) {
            System.out.println("enter the number innings batted");

            innings = sc.nextLong();

            if (innings <= Matches)
                break;

            System.out.println("enter the number innings batted correctly <=matches");

        }

        while (true) {

            System.out.println("enter number of times notout");

            notout = sc.nextLong();

            if (notout <= innings)
                break;

            System.out.println("enter the number times became notout correctly <=innings");
        }

        System.out.println("enter runs scored");

        runs = sc.nextLong();

        if (innings == notout)
            avg = runs;
        else
            avg = runs / (innings - notout);

        System.out.println("batting average=" + avg);

    }
}