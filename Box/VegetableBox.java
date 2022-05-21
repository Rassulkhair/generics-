public class VegetableBox <E, T extends Vegetable>{
    private E key;
    private T obj;

    public VegetableBox(E key, T obj){
        this.key = key;
        this.obj = obj;
    }

    public E getKey() {
        return this.key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public T getObj() {
        return this.obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}
