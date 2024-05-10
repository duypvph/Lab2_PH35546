package duypvph46.fpoly.lab2_md18306

class Student(
    var name: String,
    var studentID: String,
    var averageScore: Float,
    var hasGraduated: Boolean? = null,
    var age: Int? = null
) {
    override fun toString(): String {
        return "Student(Tên='$name', Mã sinh viên='$studentID', Điểm trung bình=$averageScore, Tình trạng tốt nghiệp=$hasGraduated, Tuổi=$age)"
    }
}
