class Masters (name:String, course:String, markIn: Int, id:Int)   : student(name, course, markIn, id){
    override fun getGrade() : String {
        return when(Marks) {
            in 0..39 -> "Fail"
            in 40..59 -> "Pass"
            in 60..69 -> "Merit"
            in 70..100 -> "Distinction"
            else -> ("error invalid percentage")
        }
    }
}