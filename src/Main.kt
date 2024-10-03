var students = mutableListOf<student>()

fun main(){
    val cole = Masters("cole", "cs", 90, 1)
    val bob = Undergraduate("Bob", "cs", 80, 2)
    students.add(cole)
    students.add(bob)
    menu()
}

fun addStudent(){
    println("Add Student")
    for (i in 1..2) {
        println("Enter Student type:")
        val studentTypes = readln()
        println("Enter name: ")
        val name = readln()
        println("Enter course: ")
        val course = readln()
        println("Enter mark: ")
        val mark = readln().toInt()
        println("Enter id: ")
        val id = readln().toInt()
        if (studentTypes == "Masters"){
            val newStudent = Masters(name, course,mark, id)
            students.add(newStudent)
        }
        if (studentTypes == "Undergraduate"){
            val newStudent = Undergraduate(name, course,mark, id)
            students.add(newStudent)
        }


    }
}

fun removeStudent(){
    println("Remove Student")
    println("Enter id of student to remove: ")
    var studentID = readln().toInt()
    students.removeIf { it.id == studentID }
}

fun viewStudent(){
    println("View Student")
    for (student in students)
    {
        println(student)
    }
}

fun menu(){
    var keeprunning = true
    while (keeprunning)
    {
        println("1. Add Student")
        println("2. Remove Student")
        println("3. View Students")
        println("4. Exit")
        var choice = readln().toInt()
        var options = when (choice)
        {
            1 -> addStudent()
            2 -> removeStudent()
            3 -> viewStudent()
            4 -> keeprunning = false
            else -> println("invalid choice try again")
        }
    }

}