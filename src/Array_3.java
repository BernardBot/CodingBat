/**
 * Created by Bernard on 9-1-2017.
 */
public class Array_3
{
    public int maxSpan(int[] nums)
    {
        if (nums.length == 0) return 0;
        int span = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j < nums.length; j++)
            {
                if (nums[i] == nums[j] && j - i + 1 > span) span = j - i + 1;
            }
        }
        return span;
    }

    public int[] fix34(int[] nums)
    {
        int[] index_3 = new int[nums.length / 2];
        int[] index_4 = new int[nums.length / 2];

        int count_3 = 0, count_4 = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 3)
            {
                index_3[count_3] = i;
                count_3++;
            } else if (nums[i] == 4)
            {
                index_4[count_4] = i;
                count_4++;
            }
        }
        for (int i = 0; i < nums.length / 2; i++)
        {
            if (i > 0 && index_3[i] == 0) break;
            swap(index_3[i] + 1, index_4[i], nums);
        }
        return nums;
    }

    private void swap(int i, int j, int[] nums)
    {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public int[] fix45(int[] nums)
    {
        int other = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 4 && nums[i] != 5)
            {
                other = nums[i];
                break;
            }
        }

        if (other != -1)
        {
            for (int i = 0; i < nums.length; i++)
            {
                if (nums[i] == 4)
                {
                    nums[i + 1] = 5;
                    i++;
                } else nums[i] = other;
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums)
    {
        int sum = 0;
        for (int n :
                nums)
        {
            sum += n;
        }
        if (sum % 2 != 0) return false;
        int halfsum = sum / 2;
        for (int i = 0; i < nums.length - 1; i++)
        {
            sum -= nums[i];
            if (sum == halfsum) return true;
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner)
    {
        int index_inner = 0;
        for (int i = 0; i < outer.length; i++)
        {
            if (index_inner == inner.length) return true;
            if (outer[i] == inner[index_inner]) index_inner++;
        }
        return index_inner == inner.length;
    }

    public int[] squareUp(int n)
    {
        int[] arr = new int[n * n];
        for (int i = 0; i < arr.length; i++)
        {

            if ((i % n) + (i / n) >= n - 1) arr[i] = n - (i % n);
        }
        return arr;
    }

    public int[] seriesUp(int n)
    {
        int[] arr = new int[(n * (n + 1)) / 2];
        int group = 1;
        int i = 0;
        while (i < arr.length)
        {
            for (int j = 0; j < group; j++)
            {
                arr[i] = j + 1;
                i++;
            }
            group++;
        }
        return arr;
    }

    public int maxMirror(int[] nums)
    {
        int[] mirror = new int[nums.length];
        for (int i = 0; i < mirror.length; i++)
        {
            mirror[i] = nums[nums.length - 1 - i];
        }

        int big = 0;
        int count_right = 0;
        int count_left = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j < nums.length; j++)
            {
                if (nums[j - i] == mirror[j])
                {
                    count_right++;
                    if (count_right > big) big = count_right;
                } else count_right = 0;

                if (nums[j] == mirror[j - i])
                {
                    count_left++;
                    if (count_left > big) big = count_left;
                } else count_left = 0;
            }
            count_right = 0;
            count_left = 0;
        }
        return big;
    }

    public int countClumps(int[] nums)
    {
        int count = 0;
        boolean found = false;
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (!found && nums[i] == nums[i + 1])
            {
                count++;
                found = true;
            } else if (nums[i] != nums[i + 1]) found = false;
        }
        return count;
    }
}
