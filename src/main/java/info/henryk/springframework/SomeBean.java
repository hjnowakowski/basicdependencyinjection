package info.henryk.springframework;


import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class SomeBean {
    private InjectedBean InjectedBean1;
    private InjectedBean injectedBean2;

    public InjectedBean getInjectedBean1() {
        return InjectedBean1;
    }

    public void setInjectedBean1(InjectedBean injectedBean1) {
        InjectedBean1 = injectedBean1;
    }

    public InjectedBean getInjectedBean2() {
        return injectedBean2;
    }

    public void setInjectedBean2(InjectedBean injectedBean2) {
        this.injectedBean2 = injectedBean2;
    }
}
