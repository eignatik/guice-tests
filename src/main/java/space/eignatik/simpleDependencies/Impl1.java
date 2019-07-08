package space.eignatik.simpleDependencies;

import com.google.inject.Inject;

public class Impl1 {

    private HelloWorld helloWorld;

    @Inject
    public Impl1(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void run() {
        helloWorld.hello();
    }

}
