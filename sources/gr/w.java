package gr;

import com.google.protobuf.u0;
import com.google.protobuf.y0;
import java.util.Arrays;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class w extends com.google.protobuf.t {
    private static final w DEFAULT_INSTANCE;
    private static volatile u0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final com.google.protobuf.x sessionVerbosity_converter_ = new ll.f(19);
    private int bitField0_;
    private String sessionId_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private com.google.protobuf.w sessionVerbosity_ = com.google.protobuf.u.f11989d;

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        com.google.protobuf.t.t(w.class, wVar);
    }

    public static void v(w wVar, String str) {
        wVar.getClass();
        str.getClass();
        wVar.bitField0_ |= 1;
        wVar.sessionId_ = str;
    }

    public static void w(w wVar) {
        int i10;
        wVar.getClass();
        RandomAccess randomAccess = wVar.sessionVerbosity_;
        if (!((com.google.protobuf.c) randomAccess).f11897a) {
            com.google.protobuf.u uVar = (com.google.protobuf.u) randomAccess;
            int i11 = uVar.f11991c;
            if (i11 == 0) {
                i10 = 10;
            } else {
                i10 = i11 * 2;
            }
            if (i10 >= i11) {
                wVar.sessionVerbosity_ = new com.google.protobuf.u(Arrays.copyOf(uVar.f11990b, i10), uVar.f11991c);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((com.google.protobuf.u) wVar.sessionVerbosity_).e(w.k.e(2));
    }

    public static v z() {
        return (v) DEFAULT_INSTANCE.l();
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
                    return new y0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", h.f17541d});
                case 3:
                    return new w();
                case 4:
                    return new com.google.protobuf.r(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0 u0Var = PARSER;
                    u0 u0Var2 = u0Var;
                    if (u0Var == null) {
                        synchronized (w.class) {
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

    public final int x() {
        int i10 = 0;
        int h10 = ((com.google.protobuf.u) this.sessionVerbosity_).h(0);
        if (h10 != 0) {
            if (h10 == 1) {
                i10 = 2;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int y() {
        return ((com.google.protobuf.u) this.sessionVerbosity_).f11991c;
    }
}
