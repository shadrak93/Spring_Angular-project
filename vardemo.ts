var index=0;
for(var index=0; index<=5; index++){
console.log("Index value Inside for loop " +index);
}

console.log("Index value outside for loop " +index);

console.log("===========================================================================================");

function display(){

var sms:string="Welcome to SHADRAK IT";

{
    var sms:string="Welcome to Angular"; 
    console.log("Inside blocker "+sms);
}

console.log("Outside blocker "+sms);
}

var sms:string="Good Afternoon"; 
    console.log("Outside Function msg "+sms);

display();