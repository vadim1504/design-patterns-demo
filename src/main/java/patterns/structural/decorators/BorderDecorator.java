package patterns.structural.decorators;

import patterns.structural.decorators.objects.Component;

public class BorderDecorator extends Decotaror {

    public BorderDecorator(Component component){
        super(component);
    }

    public void afterDraw() {
        System.out.println("added border");
    }
}
