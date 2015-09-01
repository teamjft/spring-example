package com.knight;

import hello.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

/**
 * Created by dhanendra-jft on 31/8/15.
 */
public class KnightMain {
    ApplicationContext context;

    public KnightMain(ApplicationContext context){
            this.context= context;
    }

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//       DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);
//       knight.embarkOnQuest();
//        Use knight
//       context.close();

//        ApplicationContext context=getAppCon(new ClassPathXmlApplicationContext("config.xml"));
        DamselRescuingKnight d=(DamselRescuingKnight) context.getBean("knight");
        d.embarkOnQuest();
    }

}
