package info.henryk.springframework;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import sun.rmi.runtime.Log;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

public class SomeBean implements InitializingBean, DisposableBean{
    private Logger logger = Logger.getLogger(SomeBean.class.getName());

    public void destroy() throws Exception {
        logger.info("destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        logger.info("afterPropertiesSet()");
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("preDestroy");
    }
    public void initMethod(){
        logger.info("initMethod");

    }

    public void destroyMethod(){
        logger.info("destroyMethod");
    }
}
