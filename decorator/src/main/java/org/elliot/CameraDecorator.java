package org.elliot;

public abstract class CameraDecorator implements Camera{

    public Camera camera;
    public CameraDecorator(Camera camera) {
        this.camera = camera;
    }
}
