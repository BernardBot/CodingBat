/**
 * Created by Bernard on 3-1-2017.
 */
public class Recursion_1
{
    public int factorial(int n)
    {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies)
    {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n)
    {
        if (n == 0) return 0;
        if (n < 3) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies)
    {
        if (bunnies == 0) return 0;
        return (bunnies % 2 == 0) ? 3 + bunnyEars2(bunnies - 1) : 2 + bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows)
    {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n)
    {
        if (n < 10) return n;
        return n % 10 + sumDigits(n / 10);
    }

    public int count7(int n)
    {
        if (n < 10) return (n == 7) ? 1 : 0;
        return (n % 10 == 7) ? 1 + count7(n / 10) : count7(n / 10);
    }

    public int count8(int n)
    {
        if (n < 10) return n == 8 ? 1 : 0;
        return (n % 10 == 8) ? (n % 100 == 88) ? 2 + count8(n / 10) : 1 + count8(n / 10) : count8(n / 10);
    }

    public int powerN(int base, int n)
    {
        if (n == 1) return base;
        return base * powerN(base, n - 1);
    }

    public int countX(String str)
    {
        if (str.length() < 2) return str.equals("x") ? 1 : 0;
        return str.charAt(0) == 'x' ? 1 + countX(str.substring(1)) : countX(str.substring(1));
    }

    public int countHi(String str)
    {
        if (str.length() < 3) return str.equals("hi") ? 1 : 0;
        return str.substring(0, 2).equals("hi") ? 1 + countHi(str.substring(1)) : countHi(str.substring(1));
    }

    //I'm lazy, same principal as previous two methods
    public String changeXY(String str)
    {
        return str.replaceAll("x", "y");
    }

    //These aren't the methods you're looking for
    public String changePi(String str)
    {
        return str.replaceAll("pi", "3.14");
    }

    public String noX(String str)
    {
        return str.replaceAll("x", "");
    }

    public boolean array6(int[] nums, int index)
    {
        if (nums.length == 0) return false;
        if (index > nums.length - 1) return false;
        return nums[index] == 6 || array6(nums, index + 1);
    }

    public int array11(int[] nums, int index)
    {
        if (nums.length == 0) return 0;
        if (index > nums.length - 1) return 0;
        return nums[index] == 11 ? 1 + array11(nums, index + 1) : array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index)
    {
        if (nums.length < 2) return false;
        if (index > nums.length - 2) return false;
        return 10 * nums[index] == nums[index + 1] || array220(nums, index + 1);
    }

    public String allStar(String str)
    {
        if (str.length() < 2) return str;
        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }

    public String pairStar(String str)
    {
        if (str.length() < 2) return str;
        return str.substring(0, 1).equals(str.substring(1, 2)) ? str.substring(0, 1) + "*" + pairStar(str.substring(1)) : str.substring(0, 1) + pairStar(str.substring(1));
    }

    public String endX(String str)
    {
        if (str.length() < 2) return str;
        return str.substring(0, 1).equals("x") ? endX(str.substring(1)) + "x" : str.substring(0, 1) + endX(str.substring(1));
    }

    public int countPairs(String str)
    {
        if (str.length() < 3) return 0;
        return str.substring(0, 1).equals(str.substring(2, 3)) ? 1 + countPairs(str.substring(1)) : countPairs(str.substring(1));
    }

    public int countAbc(String str)
    {
        if (str.length() < 3) return 0;
        return str.startsWith("abc") || str.startsWith("aba") ? 1 + countAbc(str.substring(1)) : countAbc(str.substring(1));
    }

    public int count11(String str)
    {
        if (str.length() < 2) return 0;
        return str.startsWith("11") ? 1 + count11(str.substring(2)) : count11(str.substring(1));
    }

    public String stringClean(String str)
    {
        if (str.length() < 2) return str;
        return str.substring(0, 1).equals(str.substring(1, 2)) ? stringClean(str.substring(1)) : str.substring(0, 1) + stringClean(str.substring(1));
    }

    public int countHi2(String str)
    {
        if (str.length() < 2) return 0;
        return str.startsWith("xhi") ? countHi2(str.substring(3)) : str.startsWith("hi") ? 1 + countHi2(str.substring(2)) : countHi2(str.substring(1));
    }

    public String parenBit(String str)
    {
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') return str;
        if (str.charAt(0) == '(') return parenBit(str.substring(0, str.length() - 1));
        if (str.charAt(str.length() - 1) == ')') return parenBit(str.substring(1));
        return parenBit(str.substring(1, str.length() - 1));
    }

    public boolean nestParen(String str)
    {
        if (str.length() < 1) return true;
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
            return nestParen(str.substring(1, str.length() - 1));
        return str.equals("") || (!str.contains("(") && !str.contains(")") && str.length() < 2);
    }

    public int strCount(String str, String sub)
    {
        if (str.length() < sub.length()) return 0;
        return str.startsWith(sub) ? 1 + strCount(str.substring(sub.length()), sub) : strCount(str.substring(1), sub);
    }

    public boolean strCopies(String str, String sub, int n)
    {
        if (str.length() < sub.length()) return n < 1;
        return str.startsWith(sub) ? strCopies(str.substring(1), sub, n - 1) : strCopies(str.substring(1), sub, n);
    }

    public int strDist(String str, String sub)
    {
        if (str.startsWith(sub) && str.endsWith(sub)) return str.length();
        if (str.startsWith(sub)) return strDist(str.substring(0, str.length() - 1), sub);
        if (str.endsWith(sub)) return strDist(str.substring(1), sub);
        return str.length() < 2 ? 0 : strDist(str.substring(1, str.length() - 1), sub);
    }
}
