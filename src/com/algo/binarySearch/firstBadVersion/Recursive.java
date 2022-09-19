package com.algo.binarySearch.firstBadVersion;

public class Recursive {
    boolean isBadVersion (int a) {
        return false;
    }
    public int result = Integer.MAX_VALUE;

    public int firstBadVersion(int n) {
        helper(0,n);
        return result;
    }

    public void helper(int start, int end)
    {
        if(start>=end)
        {
            if(isBadVersion(start))
            {
                result = Math.min(result,start);
            }
        }
        else
        {
            int middle = end + (start - end) / 2;
            if(isBadVersion(middle))
            {
                result = Math.min(result,middle);
                helper(start,middle-1);
            }
            else
            {
                helper(middle+1,end);
            }
        }
    }
}
