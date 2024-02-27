import {collages} from "./Data.js";

// 단과대학 셀렉트 박스 옵션 모듈
function selectCollage() {
  let selectCollage = document.getElementById("collages");  // 단과대학 셀렉트 박스 DOM 객체

  for (let i = 0; i < collages.length; i++) {
    let option = document.createElement("option");
    option.text = collages[i].t;
    option.value = collages[i].v;
    selectCollage.add(option);
  }
}

selectCollage();



