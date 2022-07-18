let s = "a234"

answer = s.length == 4 || s.length ==6 ?
        (s.match(/\D/g) != null ? false : true) : false

console.log(answer)