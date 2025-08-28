package com.se.sample.api;

import com.se.sample.ApplicationModule;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

@ApplicationPath("/api")
public class ApplicationConfig extends ResourceConfig {

//    public ApplicationConfig() {
//        register(TaskManagementResource.class);
//        register(JsonObjectMapperProvider.class);
//    }

    @Inject
    public ApplicationConfig(ServiceLocator serviceLocator) {
        register(TaskManagementResource.class);
        register(JsonObjectMapperProvider.class);

        // bridge the Guice container (Injector) into the HK2 container (ServiceLocator)
        Injector injector = Guice.createInjector(new ApplicationModule());
        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
        GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        guiceBridge.bridgeGuiceInjector(injector);
    }

}
