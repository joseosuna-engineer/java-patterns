package org.example.beans;

import javax.ejb.Stateless;

@Stateless
public class SampleBean implements SampleBeanRemote {

    @Override
    public String getName() {
        return "Jose Osuna";
    }

}
