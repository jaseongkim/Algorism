function solution(s) {
  var answer = ""
  
  let count = 0;
  
  for(let i = 0; i < s.length; i++){
    if(count % 2 == 0){
      answer += s.charAt(i).toUpperCase()
    } else {
      answer += s.charAt(i).toLowerCase()
    }
    count++;

    if(s.charAt(i) == " "){
      count = 0;
    }
  }
  
  return answer
  
}


console.log(solution("try hello world"))