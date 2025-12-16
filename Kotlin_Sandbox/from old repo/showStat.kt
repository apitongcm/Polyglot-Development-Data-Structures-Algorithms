open class Heroes(var name: String, var type:String, var str:Int, var agi:Int,var int:Int)
{
    fun showDetails()
    {

        println(" name: $name  type: $type \n str: $str  agi: $agi int: $int")
    }

    fun calculateStat()
    {
        var attack = str*0.3 + 10
        var defense = str*0.8 + 30
        var speed = agi*0.5 + 23
        var mobility = agi*0.9 + 33
        var magicDamage = int * 0.1 + 2
        var cooldown = int * 0.3 + 23
        print(" attack: $attack  defense: $defense  speed: $speed \n mobility: $mobility  magic damage: $magicDamage  cooldown: $cooldown")
        println()
    }
    fun showCalcStat()
    {
        showDetails()
        calculateStat()

    }
}

class Warrior(name: String, type:String, str:Int, agi: Int, int: Int):Heroes(name, type, str,agi,int)
{

}

class Mage(name: String, type:String, str:Int, agi: Int, int: Int):Heroes(name, type, str,agi,int)
{

}



fun main(args: Array<String>) {
    
    val Hilda = Warrior("Hilda", "Tank/Jungle", 100,40,10)
    val Franco= Warrior("Franco","Tank/Support",130,10,10)
    val Selena = Mage("Selena","Mage/Assassin",30,50,70)
    val Nana = Mage("Nana","Mage/Support",20,30,100)

    val myHero = arrayOf(Hilda ,Franco ,Selena, Nana)
    val index = (0..3).random()
    myHero[index].showCalcStat()
    
    if(Nana.agi > Selena.agi)
    {
        println("Nana is faster than Selena!")
    }
    else
    {
        println("Selena is faster than Nana!")
    }

}