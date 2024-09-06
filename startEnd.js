const arr=[1,2,3,3,3,3,3,4,5,6,7,8];
let target=3;
let result=[];
for(let i=0;i<arr.length;i++){
    if(arr[i]===target){
        result.push(i);
        break;
    }
}
for(let i=arr.length;i>=0;i--){
    if(arr[i]===target){
        result.push(i);
    break;
    }
}
console.log(result)