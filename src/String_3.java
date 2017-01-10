import java.util.Arrays;

/**
 * Created by Bernard on 9-1-2017.
 */
public class String_3
{
    public int countYZ(String str)
    {
        return str.toLowerCase().endsWith("y") || str.toLowerCase().endsWith("z") ?
                (str.length() - str.toLowerCase().replaceAll("[yz][^a-z]", "").length()) / 2 + 1 :
                (str.length() - str.toLowerCase().replaceAll("[yz][^a-z]", "").length()) / 2;
    }

    public String withoutString(String base, String remove)
    {
        return base.replaceAll("(?i)" + remove, "");
    }

    public boolean equalIsNot(String str)
    {
        return (str.length() - str.replaceAll("is", "").length()) / 2
                == (str.length() - str.replaceAll("not", "").length()) / 3;
    }

    public boolean gHappy(String str)
    {
        return !str.replaceAll("g{2,}", "").contains("g");
    }

    public int countTriple(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++)
        {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) count++;
        }
        return count;
    }

    public int sumDigits(String str)
    {
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(str.substring(i, i + 1));
        }
        return sum;
    }

    public String sameEnds(String string)
    {
        int count = 0;
        for (int i = 1; i <= string.length() / 2; i++)
        {
            if (string.substring(0, i).equals(string.substring(string.length() - i))) count = i;
        }
        return string.substring(0, count);
    }

    public String mirrorEnds(String string)
    {
        String result = "";
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i))
            {
                result += String.valueOf(string.charAt(i));
            } else break;
        }
        return result;
    }

    public int maxBlock(String str)
    {
        if (str.length() == 0) return 0;
        int count = 0;
        int temp = 1;
        for (int i = 0; i < str.length() - 1; i++)
        {
            if (str.charAt(i) == str.charAt(i + 1)) temp++;
            else
            {
                if (temp > count) count = temp;
                temp = 1;
            }
        }
        return temp > count ? temp : count;
    }

    public int sumNumbers(String str)
    {
        String[] arr = str.split("[^\\d+]");
        int sum = 0;
        for (String s :
                arr)
        {
            if (!s.equals("")) sum += Integer.parseInt(s);
        }
        return sum;
    }

    public String notReplace(String str)
    {
        // special cases
        if (str.equals("is")) return "is not";
        if (str.equals("")) return "";
        if (str.length() < 3) return str;

        // init
        String result = "";
        int i = 0;

        // front (of string)
        if (str.substring(0, 3).matches("is[^\\w]"))
        {
            result += "is not";
            i = 2;
        }

        // middle
        while (i <= str.length() - 4)
        {
            if (str.substring(i, i + 4).matches("[^\\w]is[^\\w]"))
            {
                result += str.substring(i, i + 1) + "is not";
                i += 2;
            } else result += str.substring(i, i + 1);
            i++;
        }

        // end
        if (str.substring(str.length() - 3).matches("[^\\w]is"))
        {
            result += str.substring(str.length() - 3, str.length() - 2) + "is not";
        } else result += str.substring(str.length() - 3);

        return result;
    }
}
