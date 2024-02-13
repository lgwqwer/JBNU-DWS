function selectCollage() {
  let collagesText = ["공과대학", "농업생명대학", "사범대학", "상과대학", "생활과학대학", "예술대학", "인문대학", "자연과학대학"];
  let collagesValue = ["engineering", "agriculture", "education", "commerce", "humanEcology", "arts", "humanities", "naturalSciences"]

  let select = document.getElementById("collages");

  for (let i = 0; i < collagesText.length; i++) {
    let option = document.createElement("option");
    option.value = collagesValue[i];
    option.text = collagesText[i];
    select.appendChild(option);
  }
}

// 테이블 초기값 0으로 설정
document.addEventListener("DOMContentLoaded", function () {
  let bonusPointInput = document.getElementById("bonusPointInput");
  let minusPointINput = document.getElementById("minusPointInput");
  let distanceScore = document.getElementById("distanceScore");
  let conversionScore = document.getElementById("conversionScore");
  bonusPointInput.value = 0;
  minusPointINput.value = 0;
  distanceScore.value = 0;
  conversionScore.value = 0;
});

// 도시 입력 셀렉트 박스 생성
function createDynamicSelect() {
  let provinces = ["시/도", "강원특별자치도", "경기도", "경상남도", "경상남도", "경상북도", "광주광역시", "대구광역시", "대전광역시",
    "세종특별자치시", "전북특별자치도"];

  let selectBox = document.createElement("select");
  selectBox.id = "provinces";

  for (let i = 0; i < provinces.length; i++) {
    let option = document.createElement("option");
    option.text = provinces[i];
    selectBox.add(option);
  }

  document.body.appendChild(selectBox);
}

createDynamicSelect();
