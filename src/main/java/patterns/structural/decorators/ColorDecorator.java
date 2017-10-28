package patterns.structural.decorators;

import patterns.structural.decorators.objects.Component;

public class ColorDecorator extends Decotaror {

    public ColorDecorator(Component component){
        super(component);
    }

    public void afterDraw() {
        System.out.println("added color");
    }
}
