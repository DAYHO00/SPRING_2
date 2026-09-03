package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    
    private String name;
    private int age;

    @Override
    public String toString() {
        return "HelloLombok{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        HelloLombok hl = new HelloLombok();
        hl.setAge(1);
        hl.setName("spring");

        System.out.println("hl = " + hl);
    }
}
