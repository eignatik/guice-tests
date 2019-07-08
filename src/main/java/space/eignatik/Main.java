package space.eignatik;

import com.google.inject.Guice;
import com.google.inject.Injector;
import space.eignatik.simpleDependencies.Configuration;
import space.eignatik.simpleDependencies.Impl1;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Configuration());
        Impl1 instance = injector.getInstance(Impl1.class);
        instance.run();
    }

}
