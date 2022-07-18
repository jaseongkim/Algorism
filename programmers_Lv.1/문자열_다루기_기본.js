function solution(s) {
        let answer = true;
        
        answer = s.length == 4 || s.length ==6 ?
            (s.match(/\D/g) != null ? false : true) : false
        
        return answer;
    }
console.log(solution("a234"))
console.log(solution("1234"))