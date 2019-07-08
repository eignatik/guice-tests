package space.eignatik.simpleDependencies;

import com.google.inject.AbstractModule;

public class Configuration extends AbstractModule {

    protected void configure() {
        bind(HelloWorld.class).to(ConcreteHelloWorld.class);
    }

}
