
//side nav functions
function openNav() { //size of side nav
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
}
function closeNav() { //size of side nav after closing (gone)
  document.getElementById("mySidenav").style.width = "0";
 document.getElementById("main").style.marginLeft= "0";
}

//dropdown button functions
var dropdown = document.getElementsByClassName("dropdown-btn");
var i;
for (i = 0; i < dropdown.length; i++) {
  dropdown[i].addEventListener("click", function() { //every dropdown can be opened
    this.classList.toggle("active");
    var dropdownContent = this.nextElementSibling;
    if (dropdownContent.style.display === "block") { //closing and opening
      dropdownContent.style.display = "none";
    } else {
      dropdownContent.style.display = "block";
    }
  });
}
