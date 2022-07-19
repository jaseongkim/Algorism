function solution(participant, completion) {
 
  var answer = '';

  // let diff = participant.filter(x => !completion.includes(x))
  //                .concat(completion.filter(x => !participant.includes(x)));

  // diff.length == 0 ? diff = participant.filter((x,i,a)=>a.indexOf(x) !== i) : diff

  // answer = diff.toString()

  const map1 = new Map();

  for(let i = 0; i < participant.length; i++){
    if(map1.has(participant[i])){
      map1.set(participant[i], map1.get(participant[i]) + 1);
    } else{
      map1.set(participant[i], 1)
    }
  }
  console.log(map1)
  
  for(let i = 0; i < completion.length; i++){
    if(map1.has(completion[i])){
      map1.set(completion[i], map1.get(completion[i]) - 1);
    }
  }
  console.log(map1)

  function logMapElements(value, key) {
    if (map1.get(key) == 1){
      console.log(`${key}`)
    } 
  }
  answer = map1.forEach(logMapElements)

  return answer
}
console.log(solution(["leo", "kiki", "eden"],["eden", "kiki"]))
console.log(solution(["marina", "josipa", "nikola", "vinko", "filipa"],
                      ["josipa", "filipa", "marina", "nikola"]))
console.log(solution(["mislav", "stanko", "mislav","ana"],
                      ["stanko", "ana", "mislav"]))