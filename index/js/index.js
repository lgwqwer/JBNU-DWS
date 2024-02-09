const toggleBtn = document.querySelector('.navbar_toggleBtn');
const menu = document.querySelector('.navbar_menu');
const icons = document.querySelector('.navbar_icons');

toggleBtn.addEventListener('click', () => {
  menu.classList.toggle('active');
  icons.classList.toggle('active');
})


function selectCollage() {
  let collagesText = ["공과대학", "농업생명대학", "사범대학", "상과대학", "생활과학대학", "예술대학", "인문대학", "자연과학대학"];
  let collagesValue = ["engineering", "agriculture", "education", "commerce", "humanEcology", "arts", "humanities", "naturalSciences"]  

  let select = document.getElementById("collages");

  for(let i = 0; i < collagesText.length; i++){
    let option = document.createElement("option");
    option.value = collagesValue[i];
    option.text = collagesText[i];
    select.appendChild(option); 
  }
}

