
let validate = () => {
    let id = document.getElementById("id").value;
    let name = document.getElementById("name").value;
    // let gender = document.getElementByName("gender");
    let gender_status = false;

    // for(gen in gender){
    //     if(gen.checked)
    //         gender_status = true;
    // }


    if(id <= 0 || id == ''){
        document.getElementById("id").style.borderColor = 'red';
        document.getElementById("idValid").innerHTML = "Id field is empty";
        return false;
    }
        

    else if(name == ""){
        document.getElementById("id").style.borderColor = 'red';
        document.getElementById("nameValid").innerHTML = "Name field is empty";
        return false;
    }

    // else if(!gender_status){
    //     document.getElementById("genderValid").innerHTML = "Gender button is empty";
    //     return false;
    // }

    else return true;
}