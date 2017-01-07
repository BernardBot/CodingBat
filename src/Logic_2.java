/**
 * Created by Bernard on 5-1-2017.
 */
public class Logic_2
{
    public boolean makeBricks(int small, int big, int goal)
    {
        return (big * 5 >= goal) ? goal % 5 <= small : goal - big * 5 <= small;
    }

    public int loneSum(int a, int b, int c)
    {
        if (a == b)
        {
            if (b == c)
            {
                return 0;
            }
            if (a == c)
            {
                return 0;
            }
            return c;
        }
        if (b == c)
        {
            if (a == c)
            {
                return 0;
            }
            return a;
        }
        if (a == c)
        {
            return b;
        }
        return a + b + c;
    }

    public int luckySum(int a, int b, int c)
    {
        if (a == 13)
        {
            return 0;
        }
        if (b == 13)
        {
            return a;
        }
        if (c == 13)
        {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c)
    {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n)
    {
        return (n != 15 && n != 16 && n <= 19 && n >= 13) ? 0 : n;
    }

    public int roundSum(int a, int b, int c)
    {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num)
    {
        return (num % 10 < 5) ? (num / 10) * 10 : (num / 10 + 1) * 10;
    }

    public boolean closeFar(int a, int b, int c)
    {

        return (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) ||
                (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2);
    }

    public int blackjack(int a, int b)
    {
        if (a > 21)
            return b > 21 ? 0 : b;
        if (b > 21)
            return a;
        return a >= b ? a : b;
    }

    public boolean evenlySpaced(int a, int b, int c)
    {
        return a - b == b - c || c - a == a - b || c - a == b - c;
    }

    public int makeChocolate(int small, int big, int goal)
    {
        return (big * 5 >= goal) ?
                (goal % 5 <= small ? goal % 5 : -1) :
                (goal - big * 5 <= small ? goal - big * 5 : -1);
    }
}
