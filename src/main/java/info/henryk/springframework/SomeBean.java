package info.henryk.springframework;

import org.springframework.beans.factory.DisposableBean;

public class SomeBean implements DisposableBean{
    public void destroyMethod(){
        System.out.println("Niszczenie beana!");
    }
    public void isWorking(){
        System.out.println("Działa!");
    }

    public void destroy() throws Exception {
        System.out.println("Niszczenie przez disposable bean!");
    }
}
