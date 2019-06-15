function showList() {

    var content1 = document.getElementById("liste1");
    var content2 = document.getElementById("liste2");
    var show = document.getElementsByClassName("show");

    if(show.value == null){
        // Hier ist noch ein fehler mit add!!!!
        content1.classList.remove("hide");
        content1.classList.add("show");
        content2.classList.remove("hide");
        content2.classList.add("show")

        show = document.getElementsByClassName("show");
    }else{
        content1.classList.remove("show");
        content1.classList.add("hide");
        content2.classList.remove("show");
        content2.classList.add("hide");

        show = document.getElementsByClassName("show");
    }
}