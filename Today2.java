import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;



// 1.동물
// 2.조류,포유류,어류
// 3.매,개,생선
class Animal {
    private String name;
    Animal(String name) {
        this.name = name;
    }
    // toString 작성
    @Override
    public String toString() {
        return name;
    }
} 
class bird extends Animal {
    bird(String name) {
        super(name);
    }
}
class mamm extends Animal {
    mamm(String name) {
        super(name);
    }
}
class Fish extends Animal {
    Fish(String name) {
        super(name);
    }
}
class Standard<T> {
    private String name;
    private List<T> arrList;
    Standard(String name) {
        this.name = name;
        arrList = new ArrayList<>();
    }
    // getter,setter method
    public String getName() {
        return name;
    }
    public List<T> getT() {
        return arrList;
    }
}
class Standard_Menu {
    // 거름망
    public <T> void composer(Standard<? extends Animal>standard,T t) {
        // Standard<? extends Animal>standard = 
        // Standard<Animal> a1 = standard 
        
        // 동물들 인자 받은것들 배열에 넣어야됌
        List<T> arr;
        arr = (List<T>)standard.getT();
        arr.add(t);

    }
    public static void AniamlStandard(Standard<?> standard) {
        System.out.println(standard.getName() + standard.getT());
    }
    public static void birdStandard(Standard<? extends bird>standard) {
        System.out.println(standard.getName() + standard.getT());
    }
    public static void fishStandard(Standard<? extends Fish>standard) {
        System.out.println(standard.getName() + standard.getT());
    }
    public static void mammStandard(Standard<? extends mamm>standard) {
        System.out.println(standard.getName() + standard.getT());
    }
}
public class Today2 {
    public static void main(String[] args) {
        Standard<Animal> a1 = new Standard<Animal>("동물");
        Standard<bird> b1 = new Standard<bird>("조류");
        Standard<Fish> f1 = new Standard<Fish>("어류");
        Standard<mamm> m1 = new Standard<mamm>("포유류");
        Standard_Menu sm = new Standard_Menu();
        Animal animal = new Animal("원숭이");
        bird bird = new bird("독수리");
        Fish fish = new Fish("금붕어");
        mamm Mamm = new mamm("호랑이");
        sm.composer(a1, animal);
        sm.composer(b1, bird);
        sm.composer(f1,fish);
        sm.composer(m1, Mamm);
        Standard_Menu.AniamlStandard(a1);
        Standard_Menu.birdStandard(b1);
        Standard_Menu.fishStandard(f1);
        Standard_Menu.mammStandard(m1);
        

    }    
}
