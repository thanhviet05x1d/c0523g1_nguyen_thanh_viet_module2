package ss06_ke_thua.unit2_super;

public class Person {
    public Person() { //Constructor của lớp Person:
        System.out.println("Person performing its tasks!");
    }
}

class Employee extends Person { // kế thừa Class Person
    public Employee(String s, int n) { // Constructor của lớp Employee: 1 tham sô
        System.out.println(s + " " + n);
    }

    public Employee() { // Constructor của lớp Employee: không tham số
        this("Employee overloading its tasks", 32);
        // Đoạn mã này đại diện cho việc gọi một Constructor khác trong cùng lớp.
        System.out.println("Employee performing its tasks!");
    }

    /* Trong đoạn code được đề cập, `this("Employee overloading its tasks");`
    được sử dụng trong Constructor của lớp `Employee`.
    Đoạn mã này đại diện cho việc gọi một Constructor khác trong cùng lớp.

Trong trường hợp này, `this("Employee overloading its tasks");`
gọi một Constructor khác của lớp `Employee` nhận một tham số kiểu `String`.
Cú pháp `this` được sử dụng để gọi Constructor khác của cùng một lớp.

Nghĩa là, khi Constructor không tham số của lớp `Employee` được gọi,
nó sẽ tự động gọi Constructor khác trong cùng lớp bằng cách sử dụng `this("Employee overloading its tasks");`.
Điều này cho phép tái sử dụng mã và tránh việc viết lại cùng một logic
trong nhiều Constructor khác nhau của cùng một lớp.

Ví dụ, trong đoạn mã dưới đây, có hai Constructor của lớp `Employee`:

```java
public Employee(String s) {
  System.out.println(s);
}

public Employee(){
    this("Employee overloading its tasks");
    System.out.println("Employee performing its tasks!");
}
```

Khi gọi Constructor không tham số `Employee()` từ lớp `Faculty`,
nó sẽ tự động gọi Constructor `Employee(String s)` với tham số `"Employee overloading its tasks"`.
Sau đó, nó sẽ tiếp tục thực hiện các lệnh trong Constructor `Employee()`,
trong trường hợp này là in ra `"Employee performing its tasks!"`.
*/

}

class Faculty extends Employee {
    public Faculty() {
        System.out.println("Faculty performing its tasks");
    }

    public static void main(String[] args) {
        Faculty faculty = new Faculty();
    }
}
