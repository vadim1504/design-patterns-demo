package patterns.structural.decorators;

import patterns.structural.decorators.objects.Component;

public abstract class Decotaror implements Component {

    protected Component component;

    public Decotaror(Component component){
        this.component=component;
    }

    public abstract void afterDraw();

    public void draw() {
        component.draw();
        afterDraw();
    }
}
