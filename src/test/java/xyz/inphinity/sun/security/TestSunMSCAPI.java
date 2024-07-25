package xyz.inphinity.sun.security;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import xyz.inphinity.sun.security.mscapi.SunMSCAPIAlt;

import java.security.KeyStore;
import java.security.Security;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestSunMSCAPI {
    @BeforeAll
    static void init() {
        Security.addProvider(new SunMSCAPIAlt());
    }

    @Test
    void testLoadsKeystore() throws Exception {
        var ks = KeyStore.getInstance("Windows-MY-CURRENTUSER", "SunMSCAPI-alt");
        ks.load(null, null);

        var aliases = ks.aliases();

        while (aliases.hasMoreElements()) {
            System.out.println("alias: "+aliases.nextElement());
        }
    }

    @Test
    void enumProvidersAndAlgos() throws Exception {
        boolean found = false;

        for (var provider: Security.getProviders()) {
            for (var service: provider.getServices()) {
                if (service.getType().equals("KeyStore")) {
                    if ("SunMSCAPI-alt".equals(provider.getName()) && "Windows-MY-LOCALMACHINE".equals(service.getAlgorithm()))
                        found = true;
                    System.out.printf("provider: %s service: %s %s%n", provider.getName(), service.getType(), service.getAlgorithm());
                }
            }
        }

        assertTrue(found);
    }
}
