var index = 0;
for (var index = 0; index <= 5; index++) {
    console.log("Index value Inside for loop " + index);
}
console.log("Index value outside for loop " + index);
console.log("===========================================================================================");
function display() {
    var sms = "Welcome to SHADRAK IT";
    {
        var sms = "Welcome to Angular";
        console.log("Inside blocker " + sms);
    }
    console.log("Outside blocker " + sms);
}
var sms = "Good Afternoon";
console.log("Outside Function msg " + sms);
display();
