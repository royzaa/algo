package com.algo.array.majorityElement;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MooreVotingSolution {
    public int majorityElement(int[] nums) {
        int candidate =0, counter =0;

        for(int e : nums) {
            if (counter ==0) {
                candidate = e;
                counter++;
            } else if (candidate == e) {
                counter++;
            } else {
                counter--;
            }
        }

        return candidate;
    }
}
