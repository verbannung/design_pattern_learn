package org.elliot;

public class DeviceFacade {

   private final SubSystemLight light=new SubSystemLight();
   private final SubSystemSunBlind sunBlind=new SubSystemSunBlind();
   private final SubSystemTv tv=new SubSystemTv();


   public void on(){
       light.on();
       sunBlind.on();
       tv.on();
   }

   public void off(){
       light.off();
       sunBlind.off();
       tv.off();
   }
}
