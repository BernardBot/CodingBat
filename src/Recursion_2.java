/**
 * Created by Bernard on 8-1-2017.
 */
public class Recursion_2
{
    public boolean groupSum(int start, int[] nums, int target)
    {
        if (target == 0) return true;
        if (start > nums.length - 1) return false;
        return groupSum(start + 1, nums, target - nums[start]) ||
                groupSum(start + 1, nums, target);
    }

    public boolean groupSum6(int start, int[] nums, int target)
    {
        if (target == 0 && start == nums.length) return true;
        if (start > nums.length - 1 || target < 0) return false;
        return (nums[start] == 6) ?
                groupSum6(start + 1, nums, target - 6) :
                groupSum6(start + 1, nums, target - nums[start]) ||
                        groupSum6(start + 1, nums, target);
    }

    public boolean groupNoAdj(int start, int[] nums, int target)
    {
        if (target == 0) return true;
        if (start > nums.length - 1) return false;
        return groupNoAdj(start + 1, nums, target) ||
                groupNoAdj(start + 2, nums, target - nums[start]);
    }

    public boolean groupSum5(int start, int[] nums, int target)
    {
        if (target == 0 && start == nums.length) return true;
        if (start > nums.length - 1) return false;
        return (nums[start] % 5 == 0) ?
                (start < nums.length - 1 && nums[start + 1] == 1) ?
                        groupSum5(start + 2, nums, target - nums[start]) :
                        groupSum5(start + 1, nums, target - nums[start]) :
                groupSum5(start + 1, nums, target) ||
                        groupSum5(start + 1, nums, target - nums[start]);
    }

    public boolean groupSumClump(int start, int[] nums, int target)
    {
        if (target == 0) return true;
        if (start > nums.length - 1) return false;
        int count = 1, total = nums[start];
        while (count + start < nums.length && nums[start + count - 1] == nums[start + count])
        {
            total += nums[start + count];
            count++;
        }
        return groupSumClump(start + count, nums, target) ||
                groupSumClump(start + count, nums, target - total);
    }

    public boolean splitArray(int[] nums)
    {
        return help(0, nums, 0, 0);
    }

    public boolean help(int index, int[] nums, int g1, int g2)
    {
        if (index > nums.length - 1) return g1 == g2;
        return help(index + 1, nums, g1 + nums[index], g2) ||
                help(index + 1, nums, g1, g2 + nums[index]);
    }

    public boolean splitOdd10(int[] nums)
    {
        return help_2(0, nums, 0, 0);
    }

    public boolean help_2(int index, int[] nums, int g1, int g2)
    {
        if (index > nums.length - 1)
            return (g1 % 10 == 0 && g2 % 2 != 0) ||
                    (g1 % 2 != 0 && g2 % 10 == 0);
        return help_2(index + 1, nums, g1 + nums[index], g2) ||
                help_2(index + 1, nums, g1, g2 + nums[index]);
    }

    public boolean split53(int[] nums)
    {
        return help_3(0, nums, 0, 0);
    }

    public boolean help_3(int index, int[] nums, int g1, int g2)
    {
        if (index > nums.length - 1) return g1 == g2;
        if (nums[index] % 5 == 0) return help_3(index + 1, nums, g1 + nums[index], g2);
        if (nums[index] % 3 == 0) return help_3(index + 1, nums, g1, g2 + nums[index]);
        return help_3(index + 1, nums, g1 + nums[index], g2) ||
                help_3(index + 1, nums, g1, g2 + nums[index]);
    }
}
