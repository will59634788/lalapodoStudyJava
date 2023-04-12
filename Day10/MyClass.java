package Day10;

import org.apache.poi.ss.formula.functions.T;
//泛型
public class MyClass<T> {
    private T data;

    public MyClass(T data) {
        this.data = data;
    }

    public MyClass() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
