package duypvph46.fpoly.lab2_md18306

class StudentManager {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
        println("Đã thêm sinh viên thành công.")
    }

    fun removeStudent(studentID: String) {
        if (students.removeAll { it.studentID == studentID }) {
            println("Đã xóa sinh viên thành công.")
        } else {
            println("Không tìm thấy sinh viên với MSSV: $studentID")
        }
    }

    fun editStudent(studentID: String, newName: String? = null, newAverageScore: Float? = null, newHasGraduated: Boolean? = null, newAge: Int? = null) {
        val student = students.find { it.studentID == studentID }
        student?.apply {
            name = newName ?: name
            averageScore = newAverageScore ?: averageScore
            hasGraduated = newHasGraduated ?: hasGraduated
            age = newAge ?: age
            println("Đã cập nhật thông tin sinh viên thành công.")
        } ?: println("Không tìm thấy sinh viên với MSSV: $studentID")
    }

    fun listStudents() {
        if (students.isEmpty()) {
            println("Danh sách sinh viên trống.")
        } else {
            students.forEach { println(it) }
        }
    }
}