import {provinces} from "./Data.js"
import {selectCity} from './selectCity.js' // 이거 import하면 시/도 출력 안됨

// 도시 입력 셀렉트 박스 생성
function selectProvince() {
    let selectBoxProvinces = document.getElementById("provinces");

    for (let i = 0; i < provinces.length; i++) {
        let option = document.createElement("option");
        option.text = provinces[i].t;
        option.value = provinces[i].v;
        selectBoxProvinces.add(option);
    }
}
selectProvince();


