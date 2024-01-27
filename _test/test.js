function convertor(grade, distance_score, add_score = 0, sub_score = 0){
  return (((grade + (add_score*0.009 - sub_score*0.009))/4.5)*90) + distance_score;
}

console.log(convertor(4.18, 5, 10, 0));


const func = function(){
  console.log(this)
}
