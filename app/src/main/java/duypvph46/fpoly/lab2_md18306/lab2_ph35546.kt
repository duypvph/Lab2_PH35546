package duypvph46.fpoly.lab2_md18306

fun main() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var o = readLine()
    if (o != null) a = o.toDouble()
    println("Nhập b:")
    o = readLine()
    if (o != null) b = o.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
    var month = 0
    println("Nhập tháng:")
    val u: String? = readLine()
    if (u != null) month = u.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")

    val studentManager = StudentManager()
    var input: String?
    do {
        println("\nQuản lý sinh viên:")
        println("1. Thêm sinh viên")
        println("2. Xem danh sách sinh viên")
        println("3. Sửa thông tin sinh viên")
        println("4. Xóa sinh viên")
        println("5. Thoát")
        println("Chọn một số (1-5):")
        input = readLine()
        when (input) {
            "1" -> {
                println("Nhập tên sinh viên:")
                val name = readLine() ?: ""
                println("Nhập MSSV:")
                val id = readLine() ?: ""
                println("Nhập điểm trung bình:")
                val score = readLine()?.toFloatOrNull() ?: 0f
                println("Đã tốt nghiệp? (true/false)")
                val graduated = readLine()?.toBoolean()
                println("Nhập tuổi:")
                val age = readLine()?.toIntOrNull()
                studentManager.addStudent(Student(name, id, score, graduated, age))
            }
            "2" -> {
                studentManager.listStudents()
            }
            "3" -> {
                println("Nhập MSSV của sinh viên cần sửa:")
                val id = readLine()
                if (id != null) {
                    println("Nhập tên mới (ấn enter để bỏ qua):")
                    val newName = readLine()
                    println("Nhập điểm TB mới (ấn enter để bỏ qua):")
                    val newScore = readLine()?.toFloatOrNull()
                    println("Nhập trạng thái tốt nghiệp mới (true/false, ấn enter để bỏ qua):")
                    val newGraduated = readLine()?.toBoolean()
                    println("Nhập tuổi mới (ấn enter để bỏ qua):")
                    val newAge = readLine()?.toIntOrNull()
                    studentManager.editStudent(id, newName, newScore, newGraduated, newAge)
                }
            }
            "4" -> {
                println("Nhập MSSV của sinh viên cần xóa:")
                val id = readLine()
                if (id != null) {
                    studentManager.removeStudent(id)
                }
            }
            "5" -> println("Chương trình kết thúc.")
            else -> println("Lựa chọn không hợp lệ, vui lòng nhập lại.")
        }
    } while (input != "5")
}