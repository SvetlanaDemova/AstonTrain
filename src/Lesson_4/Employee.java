package Lesson_4;


    public class Employee {
        private String name;
        private String job_title;
        private String email;
        private String tel_number;
        private double salary;
        private int age;

       // public String getName() {
        //    return this.name;
       // }

      //  public void setName(String name) {
        //    this.name = name;
     //   }

      //  public String getJob_title() {
         //   return this.job_title;
        //}

        //public void setJob_title(String job_title) {
         //   this.job_title = job_title;
       // }

        //public String getEmail() {
          //  return this.email;
      //  }

       // public void setEmail(String email) {
         //   this.email = email;
        //}

       // public String getTel_number() {
           // return this.tel_number;
      //  }

       // public void setTel_number(String tel_number) {
         //   this.tel_number = tel_number;
        //}

       // public int getSalary() {
           // return this.salary;
        //}

      //  public void setSalary(int salary) {
          //  this.salary = salary;
        //}

       // public int getAge() {
           // return this.age;
       // }

       // public void setAge(int age) {
         //   this.age = age;
        //}

        public Employee(String name, String job_title, String email, String tel_number, double salary, int age) {
            this.name = name;
            this.job_title = job_title;
            this.email = email;
            this.tel_number = tel_number;
            this.salary = salary;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", job_title='" + job_title + '\'' +
                    ", email='" + email + '\'' +
                    ", tel_number='" + tel_number + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    '}';
        }
        public void infoEmployee()
        {
            System.out.println("Сотрудник "+" ФИО: "+name+" должность: "+job_title+" email: "+email+" тел: "+tel_number+" з/п: "+salary+" возраст: "+age);
        }

    }
