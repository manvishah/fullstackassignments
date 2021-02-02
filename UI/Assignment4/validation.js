function gender(){
    
    var gender = document.getElementsByName('gen');
    var genValue = false;
   
    for(var i=0; i<gender.length;i++){
        if(gender[i].checked == true){
            genValue = true;    
        }
    }
    if(!genValue){
       document.getElementById("demo").innerHTML="Please select one option";
        return false;
    }   

   var pass=document.getElementById("pass").value;
   var re = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
   if(re.test(pass))
   {
       document.getElementById("demo3").innerHTML="";
       return true;
   }
   else{
    document.getElementById("demo3").innerHTML="Password must contain one lowercase,uppercase,special character and a number and a minimum of 8 length";
          return false;
   }

}