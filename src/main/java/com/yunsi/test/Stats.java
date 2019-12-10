package com.yunsi.test;

/**
 * 作者：zz
 * 日期：2019-12-10
 * 2019/12/10
 */
public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums)
    {
        this.nums = nums;
    }

    double average(){
        double sum = 0.0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum/nums.length;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4};
        Stats<Integer> iob = new Stats<Integer>(nums);
        double v = iob.average();
        System.out.println(v);

        Double dnums[] = {1.1, 2.2, 3.3};
        Stats<Double> dob = new Stats<Double>(dnums);
        v = dob.average();
        System.out.println(v);


    }
}
