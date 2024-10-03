open class student (val name:String, val course:String, val markIn: Int, val id:Int) {

    override fun toString() : String {
        return "Name: $name, Course: $course, Mark: $Marks, ID: $id"
    }

    var Marks = 0
        set(newMark) {
            if (0 <= newMark && newMark >= 100)
            {
                field = newMark
            }
        }
    init {
        Marks = markIn
    }

    fun String.isValidInt()
            = try {
        toInt().toString() == this
    } catch (x: NumberFormatException) {
        false
    }

    fun setMark(tempMark : Int) {
        if(tempMark.toString().isValidInt() && 0<=tempMark && tempMark<=100){
            Marks = tempMark
        }
    }

    open fun getGrade() : String {
        return when(Marks) {
            in 0..29 -> "F"
            in 30..39 -> "E"
            in 40..49 -> "D"
            in 50..59 -> "C"
            in 60..69 -> "B"
            in 70..100 -> "A"
            else -> ("error invalid percentage")
        }
    }

    fun didPass() : Boolean{
        if (Marks >= 40){
            return true
        }
        else{
            return false
        }
    }



    //id,name,course,mark
    //constructor
    //toString to return name, course, mark ,id
}
