/**
 * Created by Bernard on 3-1-2017.
 */
public class Logic_1
{
    public boolean cigarParty(int cigars, boolean isWeekend)
    {
        return isWeekend ? cigars >= 40 : (cigars >= 40 && cigars <= 60);
    }

    public int dateFashion(int you, int date)
    {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer)
    {
        return isSummer ? (temp >= 60 && temp <= 100) : (temp >= 60 && temp <= 90);
    }

    public int caughtSpeeding(int speed, boolean isBirthday)
    {
        if (isBirthday)
        {
            if (speed <= 65) return 0;
            if (speed <= 85) return 1;
            return 2;
        }
        if (speed <= 60) return 0;
        if (speed <= 80) return 1;
        return 2;
    }

    public int sortaSum(int a, int b)
    {
        return (a + b >= 10 && a + b <= 19) ? 20 : a + b;
    }

    public String alarmClock(int day, boolean vacation)
    {
        if (vacation)
        {
            if (day == 0 || day == 6) return "off";
            return "10:00";
        }
        if (day == 0 || day == 6) return "10:00";
        return "7:00";
    }

    public boolean love6(int a, int b)
    {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }

    public boolean in1To10(int n, boolean outsideMode)
    {
        return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
    }

    public boolean specialEleven(int n)
    {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean more20(int n)
    {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n)
    {
        return (n % 3 == 0) != (n % 5 == 0);
    }

    public boolean less20(int n)
    {
        return n % 20 == 19 || n % 20 == 18;
    }

    public boolean nearTen(int num)
    {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    public int teenSum(int a, int b)
    {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        return !isAsleep && (!isMorning || isMom);
    }

    public int teaParty(int tea, int candy)
    {
        if (tea < 5 || candy < 5) return 0;
        if (tea >= candy * 2 || candy >= tea * 2) return 2;
        return 1;
    }

    public String fizzString(String str)
    {
        if (str.startsWith("f") & str.endsWith("b")) return "FizzBuzz";
        if (str.startsWith("f")) return "Fizz";
        if (str.endsWith("b")) return "Buzz";
        return str;
    }

    public String fizzString2(int n)
    {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c)
    {
        return a + b == c || a + c == b || b + c == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk)
    {
        return (bOk) ? c > b : c > b && b > a;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk)
    {
        return (equalOk) ? c >= b && b >= a : c > b && b > a;
    }

    public boolean lastDigit(int a, int b, int c)
    {
        return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
    }

    public boolean lessBy10(int a, int b, int c)
    {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        return noDoubles && die1 == die2 ? die1 % 6 + 1 + die2 : die1 + die2;
    }

    public int maxMod5(int a, int b)
    {
        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a, b);
        return Math.max(a, b);
    }

    public int redTicket(int a, int b, int c)
    {
        if (a == 2 && b == 2 && c == 2) return 10;
        if (a == b && b == c) return 5;
        if (b != a && c != a) return 1;
        return 0;
    }

    public int greenTicket(int a, int b, int c)
    {
        if (a == b && b == c) return 20;
        if (a == b || b == c || a == c) return 10;
        return 0;
    }

    public int blueTicket(int a, int b, int c)
    {
        if (a + b == 10 || b + c == 10 || a + c == 10) return 10;
        if (a + b - 10 == b + c || a + b - 10 == a + c) return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b)
    {
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10;
    }

    public int sumLimit(int a, int b)
    {
        return Math.floor(Math.log(a) / Math.log(10)) < Math.floor(Math.log(a + b) / Math.log(10)) ? a : a + b;
    }

}
