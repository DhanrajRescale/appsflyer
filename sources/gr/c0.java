package gr;

import com.google.protobuf.u0;
import com.google.protobuf.y0;

/* loaded from: classes2.dex */
public final class c0 extends com.google.protobuf.t {
    private static final c0 DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile u0 PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* JADX WARN: Type inference failed for: r0v0, types: [gr.c0, com.google.protobuf.t] */
    static {
        ?? tVar = new com.google.protobuf.t();
        DEFAULT_INSTANCE = tVar;
        com.google.protobuf.t.t(c0.class, tVar);
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
                    return new y0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", h.f17542e});
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
                        synchronized (c0.class) {
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
