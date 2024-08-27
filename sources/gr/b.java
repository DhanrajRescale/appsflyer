package gr;

import com.google.protobuf.u0;
import com.google.protobuf.y0;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class b extends com.google.protobuf.t {
    private static final b DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile u0 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private String sdkVersion_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private String versionName_ = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        com.google.protobuf.t.t(b.class, bVar);
    }

    public static a B() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public static void v(b bVar, String str) {
        bVar.getClass();
        str.getClass();
        bVar.bitField0_ |= 1;
        bVar.packageName_ = str;
    }

    public static void w(b bVar) {
        bVar.getClass();
        bVar.bitField0_ |= 2;
        bVar.sdkVersion_ = "20.3.2";
    }

    public static void x(b bVar, String str) {
        bVar.getClass();
        bVar.bitField0_ |= 4;
        bVar.versionName_ = str;
    }

    public static b y() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.protobuf.u0, java.lang.Object] */
    @Override // com.google.protobuf.t
    public final Object m(int i10) {
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new y0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
                case 3:
                    return new b();
                case 4:
                    return new com.google.protobuf.r(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0 u0Var = PARSER;
                    u0 u0Var2 = u0Var;
                    if (u0Var == null) {
                        synchronized (b.class) {
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

    public final boolean z() {
        return (this.bitField0_ & 1) != 0;
    }
}
