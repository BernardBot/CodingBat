/**
 * Created by Bernard on 8-1-2017.
 */
public class Array_2
{
    public int countEvens(int[] nums)
    {
        int count = 0;
        for (int n :
                nums)
        {
            if (n % 2 == 0) count++;
        }
        return count;
    }

    public int bigDiff(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n :
                nums)
        {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return max - min;
    }

    public int centeredAverage(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int n :
                nums)
        {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return (sum - max - min) / (nums.length - 2);
    }

    public int sum13(int[] nums)
    {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 13) i++;
            else sum += nums[i];
        }
        return sum;
    }

    public int sum67(int[] nums)
    {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 6)
            {
                while (nums[i] != 7) i++;
            } else sum += nums[i];
        }
        return sum;
    }

    public boolean has22(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }

    public boolean lucky13(int[] nums)
    {
        for (int n :
                nums)
        {
            if (n == 1 || n == 3) return false;
        }
        return true;
    }

    public boolean sum28(int[] nums)
    {
        int sum2 = 0;
        for (int n :
                nums)
        {
            if (n == 2) sum2 += 2;
        }
        return sum2 == 8;
    }

    public boolean more14(int[] nums)
    {
        int count = 0;
        for (int n :
                nums)
        {
            if (n == 4) count--;
            else if (n == 1) count++;
        }
        return count > 0;
    }

    public int[] fizzArray(int n)
    {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = i;
        }
        return arr;
    }

    public boolean only14(int[] nums)
    {
        for (int n :
                nums)
        {
            if (n != 1 && n != 4) return false;
        }
        return true;
    }

    public String[] fizzArray2(int n)
    {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    public boolean no14(int[] nums)
    {
        boolean fours = false;
        boolean ones = false;
        for (int n :
                nums)
        {
            if (n == 4) fours = true;
            else if (n == 1) ones = true;
        }
        return !fours || !ones;
    }

    public boolean isEverywhere(int[] nums, int val)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] != val && nums[i + 1] != val) return false;
        }
        return true;
    }

    public boolean either24(int[] nums)
    {
        boolean two_pair = false;
        boolean four_pair = false;
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == 4 && nums[i + 1] == 4) four_pair = true;
            else if (nums[i] == 2 && nums[i + 1] == 2) two_pair = true;
        }
        return two_pair && !four_pair || !two_pair && four_pair;
    }

    public int matchUp(int[] nums1, int[] nums2)
    {
        int count = 0;
        for (int i = 0; i < nums1.length; i++)
        {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) count++;
        }
        return count;
    }

    public boolean has77(int[] nums)
    {
        if (nums.length < 2) return false;
        for (int i = 0; i < nums.length - 2; i++)
        {
            if (nums[i] == 7 && nums[i + 1] == 7) return true;
            if (nums[i] == 7 && nums[i + 2] == 7) return true;
        }
        return nums[nums.length - 2] == 7 && nums[nums.length - 1] == 7;
    }

    public boolean has12(int[] nums)
    {
        boolean found_one = false;
        for (int n :
                nums)
        {
            if (n == 1) found_one = true;
            if (found_one && n == 2) return true;
        }
        return false;
    }

    public boolean modThree(int[] nums)
    {
        for (int i = 0; i < nums.length - 2; i++)
        {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) return true;
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) return true;
        }
        return false;
    }

    public boolean haveThree(int[] nums)
    {
        int three_count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i != nums.length - 1 && nums[i] == 3 && nums[i + 1] == 3) return false;
            if (nums[i] == 3) three_count++;
        }
        return three_count == 3;
    }

    public boolean twoTwo(int[] nums)
    {
        if (nums.length < 2) return nums.length == 0 || nums[0] != 2;
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (i == 0)
            {
                if (nums[i] == 2 && nums[i + 1] != 2) return false;
            } else if (nums[i] == 2 && nums[i - 1] != 2 && nums[i + 1] != 2) return false;
        }
        return nums[nums.length - 1] != 2 || nums[nums.length - 2] == 2;
    }

    public boolean sameEnds(int[] nums, int len)
    {
        if (len == nums.length) return true;
        for (int i = 0; i < len; i++)
        {
            if (nums[i] != nums[nums.length - len + i]) return false;
        }
        return true;
    }

    public boolean tripleUp(int[] nums)
    {
        for (int i = 0; i < nums.length - 2; i++)
        {
            if (nums[i] == nums[i + 1] - 1 && nums[i + 1] == nums[i + 2] - 1) return true;
        }
        return false;
    }

    public int[] fizzArray3(int start, int end)
    {
        int[] arr = new int[end - start];
        for (int i = start; i < end; i++)
        {
            arr[i - start] = i;
        }
        return arr;
    }

    public int[] shiftLeft(int[] nums)
    {
        if (nums.length == 0) return nums;

        int[] shifted = new int[nums.length];
        for (int i = 1; i < nums.length; i++)
        {
            shifted[i - 1] = nums[i];
        }
        shifted[shifted.length - 1] = nums[0];
        return shifted;
    }

    public int[] tenRun(int[] nums)
    {
        boolean changing = false;
        int mult = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 10 == 0)
            {
                changing = true;
                mult = nums[i];
            } else if (changing)
            {
                nums[i] = mult;
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums)
    {
        int four_index = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 4)
            {
                four_index = i;
                break;
            }
        }

        int[] arr = new int[four_index];
        for (int i = 0; i < four_index; i++)
        {
            arr[i] = nums[i];
        }
        return arr;
    }

    public int[] post4(int[] nums)
    {
        int four_index = -1;
        for (int i = nums.length - 1; i >= 0; i--)
        {
            if (nums[i] == 4)
            {
                four_index = i;
                break;
            }
        }

        int[] arr = new int[nums.length - four_index - 1];
        for (int i = four_index + 1; i < nums.length; i++)
        {
            arr[i - four_index - 1] = nums[i];
        }
        return arr;
    }

    public int[] notAlone(int[] nums, int val)
    {
        for (int i = 1; i < nums.length - 1; i++)
        {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
            {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums)
    {
        int[] non_zeros = new int[nums.length];
        int zero_count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0) zero_count++;
            else non_zeros[i - zero_count] = nums[i];
        }

        int[] mirror = new int[nums.length];
        for (int i = 0; i < non_zeros.length; i++)
        {
            mirror[i] = non_zeros[nums.length - 1 - i];
        }
        return mirror;
    }

    public int[] withoutTen(int[] nums)
    {
        int[] no_tens = new int[nums.length];
        int ten_count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 10) ten_count++;
            else no_tens[i - ten_count] = nums[i];
        }
        return no_tens;
    }

    public int[] zeroMax(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                int temp = i;
                int big_odd = 0;
                while (temp < nums.length)
                {
                    if (nums[temp] % 2 != 0 && nums[temp] > big_odd) big_odd = nums[temp];
                    temp++;
                }
                nums[i] = big_odd;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums)
    {
        int even_count = 0;
        int[] even = new int[nums.length];
        int[] odd = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 2 == 0)
            {
                even[even_count] = nums[i];
                even_count++;
            } else
            {
                odd[i - even_count] = nums[i];
            }
        }

        int[] combined = new int[nums.length];
        for (int i = 0; i < even_count; i++)
        {
            combined[i] = even[i];
        }
        for (int i = even_count; i < nums.length; i++)
        {
            combined[i] = odd[i - even_count];
        }
        return combined;
    }

    public String[] fizzBuzz(int start, int end)
    {
        String[] arr = new String[end - start];
        for (int i = start; i < end; i++)
        {
            if (i % 3 == 0 && i % 5 == 0) arr[i - start] = "FizzBuzz";
            else if (i % 3 == 0) arr[i - start] = "Fizz";
            else if (i % 5 == 0) arr[i - start] = "Buzz";
            else arr[i - start] = String.valueOf(i);
        }
        return arr;
    }
}
