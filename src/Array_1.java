/**
 * Created by Bernard on 3-1-2017.
 */
public class Array_1
{
    public boolean firstLast6(int[] nums)
    {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums)
    {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi()
    {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b)
    {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums)
    {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums)
    {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums)
    {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums)
    {
        return nums[0] > nums[2] ? new int[]{nums[0], nums[0], nums[0]} : new int[]{nums[2], nums[2], nums[2]};
    }

    public int sum2(int[] nums)
    {
        if (nums.length == 0) return 0;
        return nums.length == 1 ? nums[0] : nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b)
    {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums)
    {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums)
    {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    public boolean no23(int[] nums)
    {
        //return !has23(nums);
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    public int[] makeLast(int[] nums)
    {
        int[] ans = new int[nums.length * 2];
        ans[ans.length - 1] = nums[nums.length - 1];
        return ans;
    }

    public boolean double23(int[] nums)
    {
        return nums.length > 1 && nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3);
    }

    public int[] fix23(int[] nums)
    {
        if (nums[0] == 2 && nums[1] == 3) nums[1] = 0;
        else if (nums[1] == 2 && nums[2] == 3) nums[2] = 0;
        return nums;
    }

    public int start1(int[] a, int[] b)
    {
        return (a.length > 0 && a[0] == 1) ? ((b.length > 0 && b[0] == 1) ? 2 : 1) : ((b.length > 0 && b[0] == 1) ? 1 : 0);
    }

    public int[] biggerTwo(int[] a, int[] b)
    {
        return (a[0] + a[1] >= b[0] + b[1]) ? a : b;
    }

    public int[] makeMiddle(int[] nums)
    {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }

    public int[] plusTwo(int[] a, int[] b)
    {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums)
    {
        int t = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = t;
        return nums;
    }

    public int[] midThree(int[] nums)
    {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
    }

    public int maxTriple(int[] nums)
    {
        return Math.max(nums[0], Math.max(nums[nums.length / 2], nums[nums.length - 1]));
    }

    public int[] frontPiece(int[] nums)
    {
        if (nums.length == 0) return nums;
        return nums.length < 2 ? new int[]{nums[0]} : new int[]{nums[0], nums[1]};
    }

    public boolean unlucky1(int[] nums)
    {
        if (nums.length < 3) return false;
        return (nums[1] == 1 && nums[2] == 3) || (nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
    }

    public int[] make2(int[] a, int[] b)
    {
        if (a.length == 0)
        {
            return new int[]{b[0], b[1]};
        } else if (a.length == 1)
        {
            return new int[]{a[0], b[0]};
        }
        return new int[]{a[0], a[1]};
    }

    public int[] front11(int[] a, int[] b)
    {
        return a.length == 0 ? (b.length == 0 ? new int[]{} : new int[]{b[0]}) : (b.length == 0 ? new int[]{a[0]} : new int[]{a[0], b[0]});
    }

}