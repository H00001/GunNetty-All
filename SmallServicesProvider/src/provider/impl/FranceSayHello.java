package provider.impl;

import provider.HelloServices;

public class FranceSayHello implements HelloServices {

    @Override
    public String sayHello() {
        return "bonjour";
    }
}
