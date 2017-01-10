import java.util.Map;

/**
 * Created by Bernard on 10-1-2017.
 */
public class Map_1
{
    // provided by CodingBat
    public Map<String, String> mapBully(Map<String, String> map)
    {
        if (map.containsKey("a"))
        {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map)
    {
        map.remove("c");
        if (map.containsKey("a")) map.put("b", map.get("a"));
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map)
    {
        if (map.containsKey("a") && map.containsKey("b"))
        {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map)
    {
        if (map.containsKey("ice cream")) map.put("ice cream", "cherry");
        map.put("bread", "butter");
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map)
    {
        if (map.get("ice cream") != null) map.put("yogurt", map.get("ice cream"));
        if (map.get("spinach") != null) map.put("spinach", "nuts");
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map)
    {
        if (map.get("potato") != null) map.put("fries", map.get("potato"));
        if (map.get("salad") != null) map.put("spinach", map.get("salad"));
        return map;
    }

}
