package package1203;

import java.util.HashSet;
import java.util.Set;

//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//例如{1,1,2,3,2}，返回结果就是3
public class Solution {
    //1、使用异或的方法
    public int singleNumber(int [] nums){
        int tmp=0;
        for (int i = 0; i <nums.length; i++) {
            tmp^=nums[i];
        }
        return tmp;
    }
    //2、使用集合的方法
    public int singleNumber2(int [] nums){
        //先定义一个set
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            //遍历数组，判断一下i是否存在在数组中
            if(set.contains(nums[i])){
                //如果存在就删除
                set.remove(nums[i]);
            }else{
                //不存在就添加进去
                set.add(nums[i]);
            }
        }
        //在遍历一次数组
        for (int i = 0; i <nums.length ; i++) {
            //如果存在，剩下的那个数字就是要找的那个元素
            if(set.contains(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}
