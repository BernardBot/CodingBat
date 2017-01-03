/**
 * Created by Bernard on 3-1-2017.
 */
public class String_1
{
    public String helloName(String name)
    {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b)
    {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word)
    {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word)
    {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str)
    {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
    }

    public String firstTwo(String str)
    {
        return (str.length() > 1) ? str.substring(0, 2) : str;
    }

    public String firstHalf(String str)
    {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str)
    {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b)
    {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }

    public String nonStart(String a, String b)
    {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str)
    {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str)
    {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front)
    {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    public String withouEnd2(String str)
    {
        return str.length() > 1 ? str.substring(1, str.length() - 1) : "";
    }

    public String middleTwo(String str)
    {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str)
    {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n)
    {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index)
    {
        return (index + 1 < str.length() && index > -1) ? str.substring(index, index + 2) : str.substring(0, 2);
    }

    public String middleThree(String str)
    {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str)
    {
        return str.length() != 0 && (str.startsWith("bad") || str.substring(1).startsWith("bad"));
    }

    public String atFirst(String str)
    {
        if (str.length() == 0) return "@@";
        return str.length() == 1 ? str + "@" : str.substring(0, 2);
    }

    public String lastChars(String a, String b)
    {
        String first, last;
        first = (a.length() == 0) ? "@" : a.substring(0, 1);
        last = (b.length() == 0) ? "@" : b.substring(b.length() - 1);
        return first + last;
    }

    public String conCat(String a, String b)
    {
        return (a.equals("") || b.equals("") || a.charAt(a.length() - 1) != b.charAt(0)) ? a + b : a + b.substring(1);
    }

    public String lastTwo(String str)
    {
        return str.length() < 2 ? str : str.substring(0, str.length() - 2) + str.substring(str.length() - 1, str.length()) + str.substring(str.length() - 2, str.length() - 1);
    }

    public String seeColor(String str)
    {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    public boolean frontAgain(String str)
    {
        return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    public String minCat(String a, String b)
    {
        if (a.length() > b.length()) return a.substring(a.length() - b.length()) + b;
        if (a.length() < b.length()) return a + b.substring(b.length() - a.length());
        return a + b;
    }

    public String extraFront(String str)
    {
        return str.length() < 2 ? str + str + str : str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    public String without2(String str)
    {
        return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2)) ? str.substring(2) : str;
    }

    public String deFront(String str)
    {
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') return str;
        if (str.charAt(0) == 'a') return str.substring(0, 1) + str.substring(2);
        if (str.charAt(1) == 'b') return str.substring(1);
        return str.substring(2);
    }

    public String startWord(String str, String word)
    {
        if (str.length() == 0) return "";
        if (str.startsWith(word)) return word;
        if (str.substring(1).startsWith(word.substring(1))) return str.substring(0, word.length());
        return "";
    }

    public String withoutX(String str)
    {
        if (str.equals("x") || str.length() == 0) return "";
        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') return str.substring(1, str.length() - 1);
        if (str.charAt(0) == 'x') return str.substring(1);
        if (str.charAt(str.length() - 1) == 'x') return str.substring(0, str.length() - 1);
        return str;
    }

    public String withoutX2(String str)
    {
        if (str.equals("x") || str.length() == 0) return "";
        if (str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(2);
        if (str.charAt(0) == 'x') return str.substring(1);
        if (str.charAt(1) == 'x') return str.substring(0, 1) + str.substring(2);
        return str;
    }

}
