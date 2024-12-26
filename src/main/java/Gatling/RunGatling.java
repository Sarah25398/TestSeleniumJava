package Gatling;

import io.gatling.app.Gatling;
import io.gatling.core.config.GatlingPropertiesBuilder;

public class RunGatling {
    public static void main(String args[]){
        GatlingPropertiesBuilder props = new GatlingPropertiesBuilder();
        props.simulationClass(ConfigureGatling.class.getName());
        Gatling.fromMap(props.build());
    }








}
