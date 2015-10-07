package org.example.beans;

import javax.ejb.Remote;

@Remote
public interface SampleBeanRemote {

    String getName();

}
