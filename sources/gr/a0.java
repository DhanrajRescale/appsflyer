package gr;

import com.google.protobuf.k0;
import com.google.protobuf.u0;
import com.google.protobuf.x0;
import com.google.protobuf.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class a0 extends com.google.protobuf.t {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final a0 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile u0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private k0 counters_;
    private k0 customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private com.google.protobuf.y perfSessions_;
    private com.google.protobuf.y subtraces_;

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        com.google.protobuf.t.t(a0.class, a0Var);
    }

    public a0() {
        k0 k0Var = k0.f11939b;
        this.counters_ = k0Var;
        this.customAttributes_ = k0Var;
        this.name_ = HttpUrl.FRAGMENT_ENCODE_SET;
        x0 x0Var = x0.f11996d;
        this.subtraces_ = x0Var;
        this.perfSessions_ = x0Var;
    }

    public static void A(a0 a0Var, w wVar) {
        a0Var.getClass();
        com.google.protobuf.y yVar = a0Var.perfSessions_;
        if (!((com.google.protobuf.c) yVar).f11897a) {
            a0Var.perfSessions_ = com.google.protobuf.t.s(yVar);
        }
        a0Var.perfSessions_.add(wVar);
    }

    public static void B(a0 a0Var, List list) {
        com.google.protobuf.y yVar = a0Var.perfSessions_;
        if (!((com.google.protobuf.c) yVar).f11897a) {
            a0Var.perfSessions_ = com.google.protobuf.t.s(yVar);
        }
        com.google.protobuf.b.g(list, a0Var.perfSessions_);
    }

    public static void C(a0 a0Var, long j10) {
        a0Var.bitField0_ |= 4;
        a0Var.clientStartTimeUs_ = j10;
    }

    public static void D(a0 a0Var, long j10) {
        a0Var.bitField0_ |= 8;
        a0Var.durationUs_ = j10;
    }

    public static a0 I() {
        return DEFAULT_INSTANCE;
    }

    public static x O() {
        return (x) DEFAULT_INSTANCE.l();
    }

    public static void v(a0 a0Var, String str) {
        a0Var.getClass();
        str.getClass();
        a0Var.bitField0_ |= 1;
        a0Var.name_ = str;
    }

    public static k0 w(a0 a0Var) {
        k0 k0Var = a0Var.counters_;
        if (!k0Var.f11940a) {
            a0Var.counters_ = k0Var.c();
        }
        return a0Var.counters_;
    }

    public static void x(a0 a0Var, a0 a0Var2) {
        a0Var.getClass();
        a0Var2.getClass();
        com.google.protobuf.y yVar = a0Var.subtraces_;
        if (!((com.google.protobuf.c) yVar).f11897a) {
            a0Var.subtraces_ = com.google.protobuf.t.s(yVar);
        }
        a0Var.subtraces_.add(a0Var2);
    }

    public static void y(a0 a0Var, ArrayList arrayList) {
        com.google.protobuf.y yVar = a0Var.subtraces_;
        if (!((com.google.protobuf.c) yVar).f11897a) {
            a0Var.subtraces_ = com.google.protobuf.t.s(yVar);
        }
        com.google.protobuf.b.g(arrayList, a0Var.subtraces_);
    }

    public static k0 z(a0 a0Var) {
        k0 k0Var = a0Var.customAttributes_;
        if (!k0Var.f11940a) {
            a0Var.customAttributes_ = k0Var.c();
        }
        return a0Var.customAttributes_;
    }

    public final boolean E() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int F() {
        return this.counters_.size();
    }

    public final Map G() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map H() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long J() {
        return this.durationUs_;
    }

    public final String K() {
        return this.name_;
    }

    public final com.google.protobuf.y L() {
        return this.perfSessions_;
    }

    public final com.google.protobuf.y M() {
        return this.subtraces_;
    }

    public final boolean N() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX WARN: Type inference failed for: r14v12, types: [com.google.protobuf.u0, java.lang.Object] */
    @Override // com.google.protobuf.t
    public final Object m(int i10) {
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new y0(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", y.f17550a, "subtraces_", a0.class, "customAttributes_", z.f17551a, "perfSessions_", w.class});
                case 3:
                    return new a0();
                case 4:
                    return new com.google.protobuf.r(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0 u0Var = PARSER;
                    u0 u0Var2 = u0Var;
                    if (u0Var == null) {
                        synchronized (a0.class) {
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
