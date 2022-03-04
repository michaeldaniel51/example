package generics;

public class DualGenericHolder<T, U> {

    T obj1;
    U obj2;

    public DualGenericHolder(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    public T getObj1() {
        return obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void display(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {

        DualGenericHolder<String,Integer> obj = new DualGenericHolder<String,Integer>("java",11);

        obj.display();



    }

}



