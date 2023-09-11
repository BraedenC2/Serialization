import java.io.Serializable;

public class User implements Serializable {

    String name, password;

    public void sayHello(){
        System.out.println("Hello" + name);
    }


}
