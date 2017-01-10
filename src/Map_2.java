import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bernard on 10-1-2017.
 */
public class Map_2
{
    // provided by CodingBat
    public Map<String, Integer> word0(String[] strings)
    {
        Map<String, Integer> map = new HashMap();
        for (String s : strings)
        {
            map.put(s, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings)
    {
        Map<String, Integer> map = new HashMap();
        for (String s :
                strings)
        {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings)
    {
        Map<String, String> map = new HashMap();
        for (String s :
                strings)
        {
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings)
    {
        Map<String, Integer> map = new HashMap();
        for (String s :
                strings)
        {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings)
    {
        Map<String, String> map = new HashMap();
        for (String s :
                strings)
        {
            String c = s.substring(0, 1);
            if (map.containsKey(c))
                map.put(c, map.get(c) + s);
            else map.put(c, s);
        }
        return map;
    }

    public String wordAppend(String[] strings)
    {
        String result = "";
        Map<String, Integer> map = new HashMap();
        for (String s :
                strings)
        {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else map.put(s, 1);
            if (map.get(s) % 2 == 0) result += s;
        }
        return result;
    }

    public Map<String, Boolean> wordMultiple(String[] strings)
    {
        Map<String, Boolean> result = new HashMap();
        Map<String, Integer> map = new HashMap();
        for (String s :
                strings)
        {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);

            if (map.get(s) > 1) result.put(s, true);
            else result.put(s, false);
        }
        return result;
    }

    public String[] allSwap(String[] strings)
    {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++)
        {
            char c = strings[i].charAt(0);
            if (map.containsKey(c) && map.get(c) != -1)
            {
                swap(strings, map.get(c), i);
                map.put(c, -1);
            } else map.put(strings[i].charAt(0), i);
        }
        return strings;
    }

    public String[] firstSwap(String[] strings)
    {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++)
        {
            char c = strings[i].charAt(0);
            if (map.containsKey(c) && map.get(c) == -1) continue; //do nothing
            else if (map.containsKey(c))
            {
                swap(strings, map.get(c), i);
                map.put(c, -1);
            } else map.put(strings[i].charAt(0), i);
        }
        return strings;
    }

    public void swap(String[] strings, int i, int j)
    {
        String t = strings[i];
        strings[i] = strings[j];
        strings[j] = t;
    }
}
