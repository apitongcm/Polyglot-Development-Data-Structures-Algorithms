open class User(var fname:String ,var lname:String, var dateOfBirth:Int, var school:String){  
    
}
class Instructor(fname:String, lname:String, dateOfBirth:Int, school:String, var numOfYear:Int):User(fname,lname,dateOfBirth,school)
{
  fun isRegular():Boolean{
      if(numOfYear > 3)
      {
         return true 
      }
      else
      {
          return false
      }
  }

  fun age():Int 
  {
     return 2021-dateOfBirth
  }
  fun fullName():String
  {
      return fname + " " + lname
  }
  fun display():String
  {
     
      println()
      println(fullName())
      println(isRegular())
      println (age())
      return ""
      
  }
  
}



fun main(args: Array<String>) {
   var i = Instructor("Kaye","Santos",2000,"ISATU",5) 
   println(i.display())
   var i2 = Instructor("James","Chu", 1994,"WVSU",1)
   println(i2.display())
   
}