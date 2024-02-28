function display(){

    let sms:string="Welcome to SHADRAK IT";
    
    {
        let sms:string="Welcome to Angular"; 
        console.log("Inside blocker "+sms);
    }
    
    
    console.log("Outside blocker "+sms);
    }
    
    var sms:string="Good Afternoon"; 
    console.log("Outside Function msg "+sms);


    display();