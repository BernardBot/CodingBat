import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bernard on 10-1-2017.
 */
public class AP_1
{
    public boolean scoresIncreasing(int[] scores)
    {
        for (int i = 0; i < scores.length - 1; i++)
        {
            if (scores[i] > scores[i + 1]) return false;
        }
        return true;
    }

    public boolean scores100(int[] scores)
    {
        for (int i = 0; i < scores.length - 1; i++)
        {
            if (scores[i] == 100 && scores[i + 1] == 100) return true;
        }
        return false;
    }

    public boolean scoresClump(int[] scores)
    {
        for (int i = 0; i < scores.length - 2; i++)
        {
            if (scores[i + 1] - scores[i] <= 2 && scores[i + 2] - scores[i + 1] <= 2 && scores[i + 2] - scores[i] <= 2)
                return true;
        }
        return false;
    }

    public int scoresAverage(int[] scores)
    {
        int avg1 = 0, avg2 = 0;
        for (int i = 0; i < scores.length / 2; i++)
        {
            avg1 += scores[i];
        }
        avg1 /= scores.length / 2;
        for (int i = scores.length / 2; i < scores.length; i++)
        {
            avg2 += scores[i];
        }
        avg2 /= scores.length / 2;
        return Math.max(avg1, avg2);
    }

    public int wordsCount(String[] words, int len)
    {
        int count = 0;
        for (String word :
                words)
        {
            if (word.length() == len) count++;
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n)
    {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = words[i];
        }
        return arr;
    }

    public List wordsWithoutList(String[] words, int len)
    {
        List<String> list = new ArrayList<String>();
        for (String word :
                words)
        {
            if (word.length() != len) list.add(word);
        }
        return list;
    }

    public boolean hasOne(int n)
    {
        return String.valueOf(n).contains("1");
    }

    public boolean dividesSelf(int n)
    {
        int div = n;
        while (!(div < 10))
        {
            if (div % 10 == 0 || n % (div % 10) != 0) return false;
            div /= 10;
        }
        return n % div == 0;
    }

    public int[] copyEvens(int[] nums, int count)
    {
        int[] arr = new int[count];
        int arr_index = 0;
        for (int i = 0; i < nums.length && arr_index < arr.length; i++)
        {
            if (nums[i] % 2 == 0)
            {
                arr[arr_index] = nums[i];
                arr_index++;
            }
        }
        return arr;
    }

    public int[] copyEndy(int[] nums, int count)
    {
        int[] arr = new int[count];
        int arr_index = 0;
        for (int i = 0; i < nums.length && arr_index < arr.length; i++)
        {
            if (nums[i] >= 0 && nums[i] <= 10 || nums[i] >= 90 && nums[i] <= 100)
            {
                arr[arr_index] = nums[i];
                arr_index++;
            }
        }
        return arr;
    }

    public int matchUp(String[] a, String[] b)
    {
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i].length() != 0 && b[i].length() != 0 && a[i].charAt(0) == b[i].charAt(0)) count++;
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers)
    {
        int grade = 0;
        for (int i = 0; i < key.length; i++)
        {
            if (key[i].endsWith(answers[i])) grade += 4;
            else if (answers[i].equals("?")) ; //do nothing
            else grade -= 1;
        }
        return grade;
    }

    public String[] wordsWithout(String[] words, String target)
    {
        int count = words.length;
        for (int i = 0; i < words.length; i++)
        {
            if (words[i].equals(target)) count--;
        }

        String[] arr = new String[count];
        int index = 0;
        for (int i = 0; i < words.length; i++)
        {
            if (!words[i].equals(target))
            {
                arr[index] = words[i];
                index++;
            }
        }
        return arr;
    }

    public int scoresSpecial(int[] a, int[] b)
    {
        int a_s = 0;
        int b_s = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 10 == 0)
            {
                if (a[i] > a_s) a_s = a[i];
            }
        }
        for (int i = 0; i < b.length; i++)
        {
            if (b[i] % 10 == 0)
            {
                if (b[i] > b_s) b_s = b[i];
            }
        }

        return a_s + b_s;
    }

    public int sumHeights(int[] heights, int start, int end)
    {
        int sum = 0;
        for (int i = start; i < end; i++)
        {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end)
    {
        int sum = 0;
        for (int i = start; i < end; i++)
        {
            if (heights[i] - heights[i + 1] < 0) sum += 2 * Math.abs(heights[i] - heights[i + 1]);
            else sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end)
    {
        int sum = 0;
        for (int i = start; i < end; i++)
        {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) sum++;
        }
        return sum;
    }

    public int userCompare(String aName, int aId, String bName, int bId)
    {
        int str_comp = aName.compareTo(bName);
        int num_comp = ((Integer) aId).compareTo(bId);

        if (str_comp == 0 && num_comp == 0) return 0;
        if (str_comp == 0) return num_comp < 0 ? -1 : 1;
        return str_comp < 0 ? -1 : 1;
    }

    public String[] mergeTwo(String[] a, String[] b, int n)
    {
        String[] result = new String[n];
        int index_a = 0;
        int index_b = 0;
        for (int i = 0; i < result.length; i++)
        {
            int compare = a[index_a].compareTo(b[index_b]);
            if (compare < 0)
            {
                result[i] = a[index_a];
                index_a++;
            } else if (compare > 0)
            {
                result[i] = b[index_b];
                index_b++;
            } else
            {
                result[i] = a[index_a];
                index_a++;
                index_b++;
            }
        }
        return result;
    }

    public int commonTwo(String[] a, String[] b)
    {
        int count = 0;
        int index_a = 0;
        int index_b = 0;
        while (index_a < a.length && index_b < b.length)
        {
            int compare = a[index_a].compareTo(b[index_b]);

            if (compare < 0) index_a++;
            else if (compare > 0) index_b++;
            else
            {
                count++;
                while (index_a < a.length && index_b < b.length && a[index_a].compareTo(b[index_b]) == 0)
                {
                    index_a++;
                }
            }
        }
        return count;
    }
}
