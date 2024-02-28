var petname = "dog";
function setpetname() {
    var petname = "cat";
    console.log("Inside the function " + petname);
}
setpetname();
console.log("Outside of the function  " + petname);
