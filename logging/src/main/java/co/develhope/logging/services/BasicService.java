package co.develhope.logging.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Service
public class BasicService {

    @Autowired
    Environment environment;

    Logger logger = LoggerFactory.getLogger(BasicService.class);

    public String welcomeMsg() {
        String welcomeMsg = "welcome";
        logger.info(welcomeMsg);
        return welcomeMsg;
    }


    public Integer getPower () {
        int n1 = Integer.parseInt((environment.getProperty("customEnvs.n1")));
        int n2 = Integer.parseInt((environment.getProperty("customEnvs.n2")));
        logger.debug("n1= " + n1 + " - n2= " + n2);
        logger.info("Start calculation");
        int power = n1;
        for(int i=1; i<n2; i++){
            power *= n1;
        }
        logger.info("End calculation");
        logger.debug("power: " + power);
        return power;
    }

    public String getError(){
        Error error = new Error("Error");
        logger.error(error.getMessage());
        throw  error;


    }
}