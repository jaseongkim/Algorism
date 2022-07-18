function solution(seoul) {
  var answer = '';

  // for(let i =0; i < seoul.length; i++){
  //   if(seoul[i] == 'Kim') {
  //     answer = `김서방은 ${i}에 있다`
  //   }
  // }

  let num = seoul.findIndex(x => x == "Kim")

  answer = `김서방은 ${num}에 있다`

  return answer;

}
console.log(solution(["Jane", "Kim"]))