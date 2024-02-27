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


export function selectGangwondo() {
    let selectCity = document.getElementById("cities");

    for(let i = 0; i < Gangwondo.length; i++) {
        let option = document.createElement("option");
        option.text = Gangwondo[i].t;
        option.value = Gangwondo[i].v;
        selectCity.add(option);
    }
}

function selectCity() {
    let parentProvince = document.getElementById("provinces").value;

    if(parentProvince == " ") {

    } else {

        switch (parentProvince) {
            case "Gangwon-do":
                selectGangwondo();
                break;

            default:

                break;
        }
    }
}