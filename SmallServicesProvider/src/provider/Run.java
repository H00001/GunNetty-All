package provider;

import top.gunplan.utils.GunReadByteBufferUtil;


import java.net.Socket;

public class Run {
    public static void main(String[] args) throws Exception {
        Socket cs = new Socket("localhost", 4560);
        /**
         * Name         0
         * Interface    1
         * Method       2
         * returnTp     3
         * Class        4
         * paraleng     5
         */
        byte[] b1 = {0x13,0x14};
        byte[] b2 = {0x40,0x50};
        byte[] jj = GunReadByteBufferUtil.combine(b1,"gunsay#provider.HelloServices#sayHello#java.lang.Void#BonjourHello#0#2000".getBytes());
        byte[] kk = GunReadByteBufferUtil.combine(jj,b2);
        cs.getOutputStream().write(kk);
        cs.getOutputStream().close();


//        GunBootServer gb = GunBootServerFactory.getInstance(8899);
//        gb.inintObject(GunSyncGunInforHander.class);
//        gb.setHandel((t, m) -> {
//            if (t == GunBootServer.GunNettyHandle.EventType.RECEIVED) {
//                ByteBuffer bf = m.getBf();
//                byte[] b = new byte[bf.position()];
//                bf.flip();
//                bf.get(b);
//                ClassLoader classLoader = Run.class.getClassLoader();
//                System.out.println(new String(b));
//                System.out.println(FranceSayHello.class.getName());
//                assert classLoader != null;
//                Class<?> clazz = classLoader.loadClass(new String(b).split("#")[0]);
//                Method meth = clazz.getMethod(new String(b).split("#")[1]);
//                Object instalne = clazz.getConstructor().newInstance();
//                Object o = meth.invoke(instalne);
//                String s = (String) o;
//                m.getVar1().write(ByteBuffer.wrap(s.getBytes()));
//            } else {
//
//            }
//        });
//        gb.sync();
    }
}
