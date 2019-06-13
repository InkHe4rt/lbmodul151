function showList() {

    var content = document.getElementsByClassName("content");
    var show = document.getElementsByClassName("show");

    if(show.value == null){
        // Hier ist noch ein fehler mit add!!!!
        content.classList.remove("hide");
        content.classList.add("show");
    }else{
        content.classList.remove("show");
        content.classList.add("hide");
    }
}