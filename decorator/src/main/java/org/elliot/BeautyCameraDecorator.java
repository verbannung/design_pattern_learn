package org.elliot;

public class BeautyCameraDecorator extends CameraDecorator {


    public BeautyCameraDecorator(Camera camera) {
        super(camera);
    }

    @Override
    public void operation() {
        super.camera.operation();
        System.out.println("被装饰的新功能");
    }
}
