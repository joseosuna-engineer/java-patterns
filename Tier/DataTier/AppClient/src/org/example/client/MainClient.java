package org.example.client;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.example.beans.SampleBeanRemote;

public class AppClient {

    public static void main(String[] args) {

        test();

    }

    private static SampleBeanRemote lookupRemoteEJB() throws NamingException {
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        jndiProperties.put(Context.PROVIDER_URL, "remote://host:remoting-port");
        jndiProperties.put(Context.SECURITY_PRINCIPAL, "user");
        jndiProperties.put(Context.SECURITY_CREDENTIALS, "pass");
        jndiProperties.put("jboss.naming.client.ejb.context", true);

        final Context context = new InitialContext(jndiProperties);

        final String ejbName = "ejb:/module//Bean!BeanRemote";

        System.out.println("Looking EJB via JNDI ");
        System.out.println(ejbName);

        return (SampleBeanRemote) context.lookup(ejbName);

    }

    private static void test() {

        try {

            final SampleBeanRemote ejb = lookupRemoteEJB();

            String name = ejb.getName();

            System.out.println("Name remote: " + name);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {

        }
    }

}
