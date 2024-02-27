import { Gangwondo, Gyeonggido, Gyeongnam, Gyeongbuk, Gwangju,
    Daegu, Daejeon, Busan, Seoul, Ulsan,
    Incheon, Jeonnam, Jeonbuk, Jeju, Chungcheongnamdo, Chungcheongbukdo } from './Data.js';


// 시/도 선택 시 그에 맞는 배열 리턴하는 함수
function getProvinceArr(prov) {
    let def = [];
    switch (prov) {
        case "Gangwon-do":
            return Gangwondo;
        case "Gyeonggi-do":
            return Gyeonggido;
        case "Gyeongnam":
            return Gyeongnam;
        case "Gyeongbuk":
            return Gyeongbuk;
        case "Gwangju":
            return Gwangju;
        case "Daegu":
            return Daegu;
        case "Daejeon":
            return Daejeon;
        case "Busan":
            return Busan;
        case "Seoul":
            return Seoul;
        case "Ulsan":
            return Ulsan;
        case "Incheon":
            return Incheon;
        case "Jeonnam":
            return Jeonnam;
        case "Jeonbuk":
            return Jeonbuk;
        case "Jeju":
            return Jeju;
        case "Chungcheongnam-do":
            return Chungcheongnamdo;
        case "Chungcheongbuk-do":
            return Chungcheongbukdo;
        default:
            return def;
    }
}

export function selectCity() {
    let selectCity = document.getElementById("cities"); // 시/군/구 DOM 객체 받아오기

    while(selectCity.hasChildNodes()) { // 시/도 선택 전, 전에 있던 시/군/구 옵션 삭제
        selectCity.removeChild(selectCity.firstChild);
    }

    let provinceName = document.getElementById("provinces").value; // 사용자가 선태한 시/도 데이터 받아오기

    let citiesArr = getProvinceArr(provinceName);   // 선택한 시/도의 시/군/구 배열 가져오기

    for(let i = 0; i < citiesArr.length; i++) { // 시/군/구 배열의 size 만큼 루프 돌면서 옵션 추가
        let option = document.createElement("option");
        option.text = citiesArr[i].t;
        option.value = citiesArr[i].v;
        selectCity.add(option);
    }
}

// 시/도 셀렉트 박스에 이벤트가 발생했을 경우, selectCity 함수 호출
document.getElementById("provinces").addEventListener('change', selectCity);


