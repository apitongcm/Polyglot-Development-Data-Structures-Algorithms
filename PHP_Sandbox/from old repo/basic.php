<?php
/*This codes are just basic codes that I am learning right now.  
  I am learning PHP @https://phpapprentice.com/boolean-logic.html . thank you*/
echo "Hello World!\n";    //Hello World : php  xD 

$INT = 27;                   // Variables: case sensitive, not required to define data type.
$FLOAT = 1234.5678;
$BOOL = true;
$STRING = "Carl Pogi!";
$calculator = "click me\n";
echo $calculator;

echo ($INT +$FLOAT)."\n";

echo "$STRING ka parin\n" ;



$a = 120;   // assign value in the variables
$b = 60; 
$c = 70; 

echo ($a + $b + $c)."\n";    // perform simple operations 
echo ($a - $b - $c)."\n"; 
echo ($a * $b * $c)."\n";
echo ($a / $b / $c)."\n";
echo ($a % $b)."\n";  //mod 
echo (2**2)."\n"; //power 

$firstName = "Quenchie"; 
$lastName = "Apitong" ; 
$fullName =  $firstName.$lastName ;  // combine two strings 
echo $fullName;
echo "Jacob\nJones\n";
echo "$firstName Apitong\n";

$a < $b ;  // false  :less than 
$a > $b ; //true : greater than 
$a == $b; // false : not equal
$a != $b; // true : a and b are not equal 

$d = true;      //boolean logic  
$e = true; 
$f = false; 
$g = false;

$d && $b;  // returns true  AND LOGIC 
$d && $f; // returns false 

$d || $f; // returns true OR LOGIC 
$f || $g; //returns false

echo "$d\n"; //inverted output - NOT LOGIC

$h = true;
echo "not $h\n";

//conditionals 
$animal = 'cow';        //if statement 
if ($animal == 'cow'){
    echo "Arrrffff......\n";
}

if ($d == !$d){             //if else statement 
    echo "LOL BAKA !!!\n ";
}else 
{
    echo "YEY YOU ARE SMART AFF !\n";
}

$game = 'mobile legends';         //switch case conditionals
$game = 'zuma';
switch ($game){   

    case 'mobile legends':
        echo "Welcome to MOBILE LEGENDS!\n";
        break;
    case 'league of legends':
        echo "Welcome to SUMMONER'S RIFT\n";
        break; 
    case 'pokemon':
        echo "Pickachu use THUNDERBOLT!!\n";
        break;
    default: 
        echo "your life is boring!! GAMERS rule!!!\n";
        break;

}
//tenary conditional
$age = 15; 
echo $age > 18 ? "Congratulations, you may now Enter\n" : "Go home kid or Im gonna call your MOMMY!\n";

$IExist = "Variable exists\n";  //chain multiple checks in row.
echo $IDoNotExist ?? $IExist ?? $IsItLove ??  "Neither variable is set\n";


// Loops  - Increase your repetitions

$num  = 10;  // stop iteration when value of $num reach.
while ($num > 0){ // 0 is the initial value of $num
    echo "Running Loop $num\n"; //insert instruction
    --$num;
}

do {        //do -while loop  
    echo "Do while $num\n";    // instruction
    ++$num ;        //iteration 
}while ($num < 10); // $num should not be greater than 10; 


for ($i = 0; $i < 20; $i++) { //initial ; when will it be done ; executed after each loop.
    echo "For loop $i\n";
}

$set = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]; //number of repetitions of loop
foreach ($set as $num) {  //define the value of $num by using $set.
    echo "Array value $num\n"; //execute instruction.
}

$days = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']; //an array 
foreach ($days as $value) { // array was used as the value
    if ($value === 'Friday') { //condition 
        echo "Thanks God It is Friday!! ";
        break;
    }
    echo "Break $value\n";     // instructions
}

$planets = ['Mercury', 'Venus', 'Mars', 'Earth', ]; // array of planets
foreach ($planets as $value) {
    if ($value === 'Venus') { //skipping the value of Venus 
        continue;
    }
    echo "Continue $value\n"; //instructions 
}
//Arrays #always starts with 0 index  
$MLCharacters = ['Zilong','Layla', 'Miya', 'Nana'];
echo $MLCharacters[2]."\n";

// Identifying Array using keys
$LolChampions = ['tank' =>'Amumu','tank' =>'Alistar','mage'=> 'Annie','marksman' => 'Ashe','tank' =>'Blitzcrank', 'marksman' =>'Miss Fortune'];

echo $LolChampions['mage']."\n";  
echo $LolChampions['tank']."\n";









