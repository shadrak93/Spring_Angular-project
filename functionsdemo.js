function doWork(x, y) {
    return x + y;
}
var result = doWork(10, 20);
console.log(result);
console.log("###########Anonymous function##################");
var results = function (x, y) {
    return x + y;
};
console.log(results(10, 40));
console.log("###########function Parameter##################");
function work(fName, lName) {
    return fName + " " + lName;
}
var assigned = work("kumar", "shadrak");
console.log(assigned);
console.log("###########function Parameter##################");
function wish(email, sms) {
    if (sms === void 0) { sms = "hello"; }
    return email + sms;
}
console.log(wish("Parise", "to God"));
console.log(wish("Mighty"));
