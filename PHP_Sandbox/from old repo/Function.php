<?php 

// In this code, It will be the continuation of my practice code while studying. 

//FUNCTIONS -using reusable codes 
function collection() { //name of the Function 
    $fruitSalad = ['Condensed milk', 'All purpose cream', 'Cherries', 'Lychees', 'Mango', 'Papaya', 'Nata De Coco']; //simple array
    echo $fruitSalad[2]."\n"; // instructions to be executed 
}

collection(); // Calling of Function 

/* Small project which will identify if the guest can enter the venue or not. 
    also, it states that all Carlo is forbidden to enter the set venue.
    after that it assist you to your particular department seats. */

function identity($Name, $age, $department) {  // function and the data variables involved 
    if ($age > 18 and $Name != "Carlo"){ // condition
        echo "Congratulation you may now enter.\n";  //execute instruction if logic is valid
        echo "Your age is ".$age."\n";
        echo "Welcome Ma'am/Sir $Name\n";
        switch($department){        //states another condition inside the condition
            case 'Engineering':   // if the participant is part of Engineering Team 
                echo "Hello Engr. $Name, let me assist you upstairs\n";
                break;
            case 'VIP':   //if the participant is part of the sponsors 
                echo "Hello to our loving sponsor $Name, let me guide you to the VIP Seat\n";
                break;
            default: // if neither of the two
                echo "Welcome Guest $Name, let me help you locate your seat ma'am/sir\n";        
                break;
            }
            
    }
    else {
        echo "Unfortunately, I cannot let you in!\n"; // if you are not above 18 and your name has Carlo then you cannot enter the event. 
    }
}
identity("Carl", 19,"Engineering");

/* The small program that will solve for the general average of the student and determine either they passed or failed it will also distinguish what reward they the student will receive*/
function Graduate($Name,$Math,$Science,$English,$Filipino) { // function graduate that will have the variables of name of the student and his scores in the final exam 
    $reward = ['Pencil', 'Backpack', 'Electronic Tablet', 'Mac Book'];  // this array are the tentative rewards the student may get depending on their score. 
    $average = (($Math + $Science + $English + $Filipino) / 4 )."\n"; // solving of the weighted average of the student 
    switch ('Grades'){

        case ($average < 60): //condition : failed 
       
            echo "I'm so sorry $Name, You did not pass the subject. Better Luck next time.\n";
            echo "your average grade is $average.\n";
            echo "you will be receiving ".$reward[0]."\n";
            break;

        case ($average > 90): //condition: highscore

            echo "Congratulation you are one of the topped in class $Name, Excellent !!.\n";
            echo "your average grade is $average\n";
            echo "you will be receiving ".$reward[3]."\n";
            break;

        default: //condition: passed 
            
            echo "Congratulation you passed the subject $Name, Keep it up!!.\n";
            echo "your average grade is $average\n";
            echo "you will be receiving ".$reward[2]."\n";
            break;
    }
}

Graduate("Carl",89,90,100,90);


//small program that will solve for the weighted average of the student depending to the number of units.  
$averageCollege  = function ($subj1,$unt1,$subj2,$unt2,$subj3,$unt3) {  // it will be in this format: grade in the subject followed by number of units of the subject.
      return ((($subj1*$unt1) + ($subj2*$unt2) + ($subj3*$unt3)) / ($unt1 +$unt2 +$unt3)); // instruction and formula 
};

echo  $averageCollege(1.25,3,1.5,3,1.75,4)."\n"; // calling 
    

