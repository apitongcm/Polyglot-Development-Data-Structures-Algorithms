import java.util.Scanner
import java.util.ArrayList


fun main(args:Array<String>)
{
    var Employees: ArrayList<Any> = arrayListOf()
    var Employee1 = Employee("Ted","Felizze",1950,"Professor","April 3,2021","ISAT-U",15000.00 )
    Employees.add(Employee1)
    var Employee2 = Employee("Jen","Cruz",1956,"Supervisor","Jan 13,2020","WVSU", 20000.00)
    Employees.add(Employee2)
    Employee2.salary += 5000

    var StudentAY2021: ArrayList<Any> = arrayListOf()
    var Student1 = Student("Quenchiie", "Puno",1996,
        "INHS", "BSECE",
        13000.0,true,20210001)
    var Student2 = Student("Dan", "Dela Cruz",1990,
        "CISAT", "BSIT",
        5000.0,true,20210002)
    StudentAY2021.add(Student1)
    StudentAY2021.add(Student2)
    Student1.balance -= 5000 //pay 5000 last day.


    val scanner = Scanner(System.`in`)
    println("Please Log-In to access the Admin::")
    var username: String = "LMAschool"
    var password: String = "admin1234"
    println("Please Enter username:")
    val inputUser = scanner.next();
    println("Please Enter password:")
    val inputPassword = scanner.next();

    if(inputUser != username || inputPassword != password)
    {
        println("Access Denied!!")
    }
    else {

        println("Welcome to the Learn More Academy \n Please enter the designated number of your choice to continue::")
        println("[0]If you want to view the student personal information")
        println("[1]If you want to view the employee personal information")

        val myInput = scanner.nextInt()
        if (myInput == 0) {
            for (student in StudentAY2021)
                println(student)
        } else {
            for (employee in Employees)
                println(employee)
        }
    }

}

data class Employee(val fname: String ="", val lname: String="", val dateOfBirth:Int =0 ,
                    val position:String = "", val dateStarted:String ="",
                    val education:String="", var salary:Double = 0.00)

data class Student(val fname: String = "", val lname: String ="", val dateOfBirth: Int=0,
                   val school:String="", var course: String="", var balance: Double =0.0,
                   var ActiveStudent:Boolean = false, val studentId:Int=0)