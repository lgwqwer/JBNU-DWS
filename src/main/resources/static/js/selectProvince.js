// 도시 입력 셀렉트 박스 생성
function createDynamicSelect() {
    let provincesV = ["시/도", "강원특별자치도", "경기도", "경상남도", "경상북도", "광주광역시",
        "대구광역시", "대전광역시", "세종특별자치시", "부산광역시", "서울특별시", "울산광역시", "인천광역시",
        "전라남도", "전북특별자치도", "제주특별자치도", "충청남도", "충청북도"];

    let provincesN = ["city/province", "Gangwon-do", "Gyeonggi-do", "Gyeongnam", "Gyeongbuk", "Gwangju",
        "Daegu", "Daejeon", "Sejong", "Busan", "Seoul", "Ulsan", "Incheon",
        "Jeonnam", "Jeonbuk", "Jeju", "Chungcheongnam-do", "Chungcheongbuk-do"];

    let selectBoxProvinces = document.getElementById("provinces");

    for (let i = 0; i < provincesV.length; i++) {
        let option = document.createElement("option");
        option.text = provincesV[i];
        selectBoxProvinces.add(option);
    }
    document.body.appendChild(selectBoxProvinces);
}

createDynamicSelect();
