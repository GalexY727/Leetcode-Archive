/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) 
{
    let sol = new Array();
    for (let i = 0; i < nums.length; i++) 
    {
        for (let j = 0; j < nums.length; j++) 
        {
            if (nums[i] + nums[j] == target && j !== i) 
            {
                sol[0] = i;
                sol[1] = j;
                return sol;
            }
        }
    }
    return null;
};