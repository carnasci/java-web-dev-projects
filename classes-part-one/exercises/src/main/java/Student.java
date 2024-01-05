public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }
        public static String getGradeLevel(int credits){
                if (credits <= 29){
                        return "Freshman";
                } else if (credits <= 59) {
                        return "Sophmore";
                } else if (credits <= 89) {
                        return "Junior";
                } else { return "Senior"; }
        }
        public void addGrade(int courseCredits, double grade){
                double totalQualityScore = this.numberOfCredits * this.gpa;
                totalQualityScore += courseCredits * grade;
                this.numberOfCredits += courseCredits;
                this.gpa = totalQualityScore/this.numberOfCredits;
        }
        public String toString(){
                String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f",
                        this.name, this.getGradeLevel(this.numberOfCredits), this.getGpa());
                return studentReport;
        }
        public boolean equals(Object toBeCompared){
                if (toBeCompared == this){
                        return true;
                }
                if (toBeCompared == null) {
                        return false;
                }
                if (toBeCompared.getClass() != getClass()) {
                        return false;
                }
                Student theStudent = (Student) toBeCompared;
                return theStudent.getStudentId() == getStudentId();
        }

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String getName() {
                return name;
        };
        public void setName(String aName) {
                name = aName;
        };
        public int getStudentId() {
                return studentId;
        };
        public void setStudentId(Integer aStudentId) {
                studentId = aStudentId;
        };
        public int getNumberOfCredits() {
                return numberOfCredits;
        };
        public void setNumberOfCredits(Integer aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
        };
        public double getGpa() {
                return gpa;
        };
        public void setGpa(Double aGpa) {
                gpa = aGpa;
        };

}
