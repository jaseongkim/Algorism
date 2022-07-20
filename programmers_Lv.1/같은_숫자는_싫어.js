// function solution(arr)
// {
//     var answer = [];

//     for(let i = 0; i < arr.length; i++){
//       if(i == arr.length - 1){
//         return answer = arr
//       } else if (arr[i]==arr[i+1]){
//         arr.splice(i,1)
//         i--
//       }
//       console.log(arr.length)
//     }

//     answer = arr

//     return answer;
// }
// console.log(solution([1,1,3,3,0,1,1]))
// console.log(solution([4,4,4,3,3]))

// 배열의 삭제는 모든 요소를 움직여야 하기 때문에 효율성 X

function solution(arr)
{
    var answer = [];

    for(let i = 0; i < arr.length; i++){
      if (arr[i] !== arr[i+1])
        answer.push(arr[i])
    }

    return answer;
}
console.log(solution([1,1,3,3,0,1,1]))
console.log(solution([4,4,4,3,3]))