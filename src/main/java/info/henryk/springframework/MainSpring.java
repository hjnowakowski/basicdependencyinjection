package info.henryk.springframework;


import javafx.scene.chart.PieChart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        DatabaseRepository database = context.getBean("database", DatabaseRepository.class);

        System.out.println(database);

    }
}