package top.gunplan.netty.plugs.property;


import top.gunplan.netty.impl.propertys.GunProperty;

/**
 * @author dosdrtt
 */
public class GunHttpProperty implements GunProperty {
    private String scannPacket = null;

    private String httphost = null;

    public String getScannPacket() {
        return scannPacket;
    }

    public String getHttphost() {
        return httphost;
    }

    public GunHttpProperty() {

    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
