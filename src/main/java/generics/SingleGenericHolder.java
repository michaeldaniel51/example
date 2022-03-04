package generics;

public class SingleGenericHolder<T> {
    T obj;

    public SingleGenericHolder(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void display(){
        System.out.println(obj);
    }

    public static void main(String[] args) {

        SingleGenericHolder<Integer> obj1 = new SingleGenericHolder<>(10);
       // System.out.println(obj1.getObj());
          obj1.display();


        SingleGenericHolder<String> obj2 = new SingleGenericHolder<>("danny's code");
        System.out.println(obj2.getObj());
    }

}
