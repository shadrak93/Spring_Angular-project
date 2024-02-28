
function doWork(x:number, y:number) :number  {      
        return x+y;
}
let result= doWork(10,20);
console.log(result);

console.log("###########Anonymous function##################");

let results =function (x:number, y:number) :number  {      
    return x+y;
}
console.log(results(10,40));
console.log("###########function Parameter##################");

function work(fName:string, lName:string){

    return fName+" "+lName;
}
   let assigned=work("kumar", "shadrak");
   console.log(assigned);

   console.log("###########function Parameter##################");

   function wish(email:string, sms:string="hello") : string {
        return email +sms;
   
   }
     console.log( wish("Parise ", "to God"));
     console.log( wish( "Mighty"));