import {provinces} from "./Data.js"

// 단과대학 셀렉트 박스 옵션 모듈
function selectProvince() {
    let selectBoxProvinces = document.getElementById("provinces");  // 시/도 셀렉트 박스 DOM 객체 받아오기

    for (let i = 0; i < provinces.length; i++) { // 받아온 시/도 배열의 size 만큼 루프 돌면서 option 생성
        let option = document.createElement("option");
        option.text = provinces[i].t;
        option.value = provinces[i].v;
        selectBoxProvinces.add(option);
    }
}
selectProvince();

