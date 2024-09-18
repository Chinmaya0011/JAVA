var removeDuplicates = function(nums) {
  let arr=[];
  let index=0;
  for(let i=1;i<=nums.length;i++){
   if(nums[i]!==nums[index]){
    arr.push(nums[index])
   }
    index++;
  }
  return arr;
};

let arr=[1,1,2,3,4,4,5,5,5,5];
let ans=removeDuplicates(arr);
console.log(ans);