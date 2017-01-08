/**
 * Created by Bernard on 7-1-2017.
 */
public class String_2
{
    public String doubleChar(String str)
    {
        String result = "";
        for (int i = 0; i < str.length(); i++)
        {
            result += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return result;
    }

    public int countHi(String str)
    {
        return (str.length() - str.replaceAll("hi", "").length()) / 2;
    }

    public boolean catDog(String str)
    {
        return str.replaceAll("dog", "").length() == str.replaceAll("cat", "").length();
    }

    public int countCode(String str)
    {
        return (str.length() - str.replaceAll("co.e", "").length()) / 4;
    }

    public boolean endOther(String a, String b)
    {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }

    public boolean xyzThere(String str)
    {
        return str.replaceAll("\\.xyz", "").length() > str.replaceAll("xyz", "").length();
    }

    public boolean bobThere(String str)
    {
        return str.matches(".*b.b.*");
    }

    public boolean xyBalance(String str)
    {
        String temp = str.replaceAll("[^xy]", "");
        return !temp.endsWith("x");
    }

    public String mixString(String a, String b)
    {
        String result = "";
        if (a.length() > b.length())
        {
            for (int i = 0; i < b.length(); i++)
            {
                result += a.substring(i, i + 1) + b.substring(i, i + 1);
            }
            return result + a.substring(b.length());
        } else
        {
            for (int i = 0; i < a.length(); i++)
            {
                result += a.substring(i, i + 1) + b.substring(i, i + 1);
            }
            return result + b.substring(a.length());
        }
    }

    public String repeatEnd(String str, int n)
    {
        String result = "";
        for (int i = 0; i < n; i++)
        {
            result += str.substring(str.length() - n);
        }
        return result;
    }

    public String repeatFront(String str, int n)
    {
        String result = "";
        for (int i = 0; i < n; i++)
        {
            result += str.substring(0, n - i);
        }
        return result;
    }

    public String repeatSeparator(String word, String sep, int count)
    {
        if (count == 0) return "";
        String result = word;
        for (int i = 0; i < count - 1; i++)
        {
            result += sep + word;
        }
        return result;
    }

    public boolean prefixAgain(String str, int n)
    {
        return str.substring(n).contains(str.substring(0, n));
    }

    public boolean xyzMiddle(String str)
    {
        if (!str.contains("xyz")) return false;
        if (str.equals("xyz")) return true;

        int mid = str.length() / 2;

        if (str.length() % 2 != 0)
            return str.substring(mid - 1, mid + 2).equals("xyz");
        return str.substring(mid - 1, mid + 2).equals("xyz") || str.substring(mid - 2, mid + 1).equals("xyz");
    }

    public String getSandwich(String str)
    {
        int i_f = str.indexOf("bread");
        int i_l = str.lastIndexOf("bread");
        if (i_f != -1 && i_l != -1 && i_f != i_l)
            return str.substring(i_f + 5, i_l);
        return "";
    }

    public boolean sameStarChar(String str)
    {
        for (int i = 1; i < str.length() - 1; i++)
        {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
            {
                return false;
            }
        }
        return true;
    }

    public String oneTwo(String str)
    {
        String result = "";
        for (int i = 0; i < str.length() - 2; i += 3)
        {
            result += str.substring(i + 1, i + 3) + str.substring(i, i + 1);
        }
        return result;
    }

    public String zipZap(String str)
    {
        return str.replaceAll("z(.){1}p", "zp");
    }

    public String starOut(String str)
    {
        return str.replaceAll("\\*+", "*").replaceAll("(.)?\\*(.)?", "");
    }

    public String plusOut(String str, String word)
    {
        if (str.length() < word.length()) return "";
        if (str.equals(word)) return word;

        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (str.substring(i).startsWith(word))
            {
                result += word;
                i += word.length() - 1;
            } else
                result += "+";
        }
        return result;
    }

    public String wordEnds(String str, String word)
    {
        if (str.length() <= word.length()) return "";
        String result = "";
        if (str.startsWith(word)) result += str.substring(word.length(), word.length() + 1);
        for (int i = 1; i < str.length() - word.length(); i++)
        {
            if (str.substring(i, i + word.length()).equals(word))
            {
                result += str.substring(i - 1, i) + str.substring(i + word.length(), i + word.length() + 1);
            }
        }
        if (str.endsWith(word)) result += str.substring(str.length() - word.length() - 1, str.length() - word.length());
        return result;
    }
}
