import {provinces} from './Data.js'
import {Gangwondo} from './Data.js'
import {Gyeonggido} from './Data.js'
import {Gyeongnam} from './Data.js'
import {Gyeongbuk} from './Data.js'
import {Gwangju} from './Data.js'
import {Daegu} from './Data.js'
import {Daejeon} from './Data.js'
import {Busan} from './Data.js'
import {Seoul} from './Data.js'
import {Ulsan} from './Data.js'
import {Incheon} from './Data.js'
import {Jeonnam} from './Data.js'
import {Jeonbuk} from './Data.js'
import {Jeju} from './Data.js'
import {Chungcheongnamdo} from './Data.js'
import {Chungcheongbukdo} from './Data.js'

function convertor(prov) {
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
    let selectCity = document.getElementById("cities");

    while(selectCity.hasChildNodes()) {
        selectCity.removeChild(selectCity.firstChild);
    }

    let provinceName = document.getElementById("provinces").value;

    let citiesArr = convertor(provinceName);
    console.log(citiesArr);

    for(let i = 0; i < citiesArr.length; i++) {
        let option = document.createElement("option");
        option.text = citiesArr[i].t;
        option.value = citiesArr[i].v;
        selectCity.add(option);
    }
}

document.getElementById("provinces").addEventListener('change', selectCity);


