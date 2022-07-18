function solution(n) {
  var answer = '';

  let s = '수박'
  
  let str = s.padEnd(10000,'수박')

  answer = str.slice(0,n)

  return answer;

}
console.log(solution(3))
console.log(solution(4))
