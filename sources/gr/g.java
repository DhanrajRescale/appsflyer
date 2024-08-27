package gr;

import com.google.protobuf.k0;
import com.google.protobuf.u0;
import com.google.protobuf.y0;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class g extends com.google.protobuf.t {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final g DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile u0 PARSER;
    private b androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private k0 customAttributes_ = k0.f11939b;
    private String googleAppId_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private String appInstanceId_ = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        com.google.protobuf.t.t(g.class, gVar);
    }

    public static g B() {
        return DEFAULT_INSTANCE;
    }

    public static e G() {
        return (e) DEFAULT_INSTANCE.l();
    }

    public static void v(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.bitField0_ |= 1;
        gVar.googleAppId_ = str;
    }

    public static void w(g gVar, i iVar) {
        gVar.getClass();
        gVar.applicationProcessState_ = iVar.f17548a;
        gVar.bitField0_ |= 8;
    }

    public static k0 x(g gVar) {
        k0 k0Var = gVar.customAttributes_;
        if (!k0Var.f11940a) {
            gVar.customAttributes_ = k0Var.c();
        }
        return gVar.customAttributes_;
    }

    public static void y(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.bitField0_ |= 2;
        gVar.appInstanceId_ = str;
    }

    public static void z(g gVar, b bVar) {
        gVar.getClass();
        gVar.androidAppInfo_ = bVar;
        gVar.bitField0_ |= 4;
    }

    public final b A() {
        b bVar = this.androidAppInfo_;
        if (bVar == null) {
            return b.y();
        }
        return bVar;
    }

    public final boolean C() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX WARN: Type inference failed for: r9v12, types: [com.google.protobuf.u0, java.lang.Object] */
    @Override // com.google.protobuf.t
    public final Object m(int i10) {
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new y0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", h.f17538a, "customAttributes_", f.f17537a});
                case 3:
                    return new g();
                case 4:
                    return new com.google.protobuf.r(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0 u0Var = PARSER;
                    u0 u0Var2 = u0Var;
                    if (u0Var == null) {
                        synchronized (g.class) {
                            try {
                                u0 u0Var3 = PARSER;
                                u0 u0Var4 = u0Var3;
                                if (u0Var3 == null) {
                                    ?? obj = new Object();
                                    PARSER = obj;
                                    u0Var4 = obj;
                                }
                            } finally {
                            }
                        }
                    }
                    return u0Var2;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        throw null;
    }
}
