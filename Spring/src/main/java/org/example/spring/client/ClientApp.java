/*
 * Copyright 2015 Jose Osuna.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.spring.client;

import org.example.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jose Osuna
 */
public class ClientApp {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("org/example/spring/xml/beans.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person.getId() + " " + person.getName() + " "
                + person.getNickname() + " " + person.getCountry().getName()
                + " " + person.getCountry().getCity().getName());

        ((ConfigurableApplicationContext) context).close();
    }
}
