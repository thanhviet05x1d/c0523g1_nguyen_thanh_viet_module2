package ss07_abtract_class_interface.content.unit1;

public interface Flyable {
    String fly(); // Không cần chỉ rõ Access Modifier, vì phải luôn là Public

    public static void main(String[] args) {
        Flyable flyableObj = new Flyable() {
            @Override
            public String fly() {
                return "Tôi đang bay ...";
            }
        };
        System.out.println(flyableObj.fly());
    }
}

