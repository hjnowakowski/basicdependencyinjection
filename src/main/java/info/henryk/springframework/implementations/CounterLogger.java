package info.henryk.springframework.implementations;

import info.henryk.springframework.api.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("Logger")
public class CounterLogger implements Logger{
    private int counter = 0;

    public void log(String message){
        System.out.println(counter++ + ". " + message);
    }
}
