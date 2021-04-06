package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        //класс, который обращается к ApplicationContext(мой)
        // считывает его и помещает все bean которые там описаны в ApplicationContext
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //передается мой файл Application(важно, чтобы мой ApplicationContext лежал в папке resources с пометкой)

        TestBean testBean=context.getBean("testBean",TestBean.class); //в качестве аргумента передается id(из Application) моего bean
        //2 ой аргумент- класс, объект(bean) которого я хочу получить

        System.out.println(testBean.getName());

        //окончание работы со Spring
        context.close();
    }
}
