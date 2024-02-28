var Student = /** @class */ (function () {
    function Student() {
    }
    Student.prototype.getstudentGrade = function () {
        if (this.studentMark >= 75) {
            return "A";
        }
        else if (this.studentMark >= 65 && this.studentMark < 60) {
            return "B";
        }
        else {
            return "c";
        }
    };
    return Student;
}());
var s1 = new Student();
s1.studentName = "kumari";
s1.studentMark = 50;
s1.studentRank = 23;
console.log(s1.getstudentGrade());
var s2 = new Student();
s2.studentName = "kumari";
s2.studentMark = 90;
s2.studentRank = 3;
console.log(s2.getstudentGrade());
