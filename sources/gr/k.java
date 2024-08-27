package gr;

import com.google.protobuf.u0;
import com.google.protobuf.y0;

/* loaded from: classes2.dex */
public final class k extends com.google.protobuf.t {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* JADX WARN: Type inference failed for: r0v0, types: [gr.k, com.google.protobuf.t] */
    static {
        ?? tVar = new com.google.protobuf.t();
        DEFAULT_INSTANCE = tVar;
        com.google.protobuf.t.t(k.class, tVar);
    }

    public static void v(k kVar, long j10) {
        kVar.bitField0_ |= 1;
        kVar.clientTimeUs_ = j10;
    }

    public static void w(k kVar, long j10) {
        kVar.bitField0_ |= 2;
        kVar.userTimeUs_ = j10;
    }

    public static void x(k kVar, long j10) {
        kVar.bitField0_ |= 4;
        kVar.systemTimeUs_ = j10;
    }

    public static j y() {
        return (j) DEFAULT_INSTANCE.l();
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
                    return new y0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
                case 3:
                    return new com.google.protobuf.t();
                case 4:
                    return new com.google.protobuf.r(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0 u0Var = PARSER;
                    u0 u0Var2 = u0Var;
                    if (u0Var == null) {
                        synchronized (k.class) {
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
