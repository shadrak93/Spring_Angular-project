function display() {
    var sms = "Welcome to SHADRAK IT";
    {
        var sms_1 = "Welcome to Angular";
        console.log("Inside blocker " + sms_1);
    }
    console.log("Outside blocker " + sms);
}
var sms = "Good Afternoon";
console.log("Outside Function msg " + sms);
display();
