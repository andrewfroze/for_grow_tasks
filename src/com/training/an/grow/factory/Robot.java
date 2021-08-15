package com.training.an.grow.factory;

public class Robot {
    private Speaker speaker;
    private GarbageCollector garbageCollector;

    public Robot() throws InstantiationException, IllegalAccessException {
        speaker = ObjectFactory.INSTANCE.createClass(Speaker.class);
        garbageCollector = ObjectFactory.INSTANCE.createClass(GarbageCollector.class);
    }

    public void clean() {
        speaker.speak("Start!");
        garbageCollector.clean();
        speaker.speak("Cleaning is over!");
    }
}
