package info.henryk.springframework.implementations;

import info.henryk.springframework.api.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
//@Qualifier("withDateLoggerAnnotationQualifier")
public class WithDataLogger implements Logger{
    public void log(String message){
        System.out.println(new Date() + ": " + message);
    }
}

