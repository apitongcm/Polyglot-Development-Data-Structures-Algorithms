<?php  //Object -oriented programming

class Bicycle //define your own data types. 
{
    public $color; //you need to use public to define your attribute.
}

$bike = new Bicycle(); // creating instance of class using the -> 
$bike->color = 'Blue';  //define color of bike as blue
echo $bike->color . "\n"; 

class Dog  //Ccreating class Tricycle 
{
    public $breed; // use public for adding the function and variables.

    public function echoBreed()   
    {
        echo $this->breed . "\n"; // a method can access attributes and methods of object instance using $this variable
    }
}

$dog = new Dog(); // creating instance
$dog->breed = 'Japanese Spitz';
$dog->echoBreed();

//simple practice code using class
class Student {
    public $name;
    public $age;
    public $address;
    public $course;
    public $studentId;
}

$student = new Student();
$student->name = 'Carl Marwin Dela Cruz';
$student->age = 29;
$student->address = 'Molo, Iloilo City';
$student->course = 'BS Computer Engineering';
$student->studentId = "0A12B345C";
echo $student->age."\n";
echo $student->studentId."\n";

// Inheritance: inheriting from parent class to child class using extends
class humanBodyPart { // you create an object which is a humanBodyPart
    public function movement() // function movement is created 
    {
        echo " Can you move it ? Because I like to move it move it !!  \n"; //instruction to be execute if the function is called. 
    }
}
class Hands extends humanBodyPart{
   public function clap() {   
    echo " When you are happy and you know you clap your hands  *clap clap!! \n";
}
} //the class Hands will inherit the attributes of humanBodyPart

$hands = new Hands(); //Calling function movement will be executed
$hands->movement();
    
/*$feet = new Feet(); // It wont call the function since we didn't include Feet as a child class of humanBodyPart.
$feet->movement(); */


$hands = new Hands();
$hands->clap();

//if you want to use the method inside the parent class you need to use the $this.
class Feet extends humanBodyPart
{
    public function walking() // creating a method walking 
    {
        $this->movement(); // "child implementation" calling the method of the Parent class to execute by the instance of the child class. 
    }
}

$Leg = new  Feet(); //creating instance for the child class
$Leg->walking(); // calling of the function walking in the parent class.


// Changing the instructions of the parent function when using the child class.
class eyes extends humanBodyPart
{
    public function movement()
    {
        parent::movement();

        echo "I don't wanna move it\n";
    }
}

$Eye = new eyes();
$Eye->movement();

/*
class Password {
    private $passcode; 
    
    public function setPasscode($passcode){
        this->passcode = $passcode;
    }
}

$password = new Password();
$password->setPasscode('Iamtoohandsometobehacked');
*/
class Phone
{
    private $number;

    public function setNumber($number)
    {
        $this->number = $number;
    }
}

$phone = new Phone();
$phone->setNumber('123-456-7890');



