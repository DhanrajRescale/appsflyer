package gr;

import com.google.protobuf.u0;
import com.google.protobuf.x0;
import com.google.protobuf.y0;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class o extends com.google.protobuf.t {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile u0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private com.google.protobuf.y androidMemoryReadings_;
    private int bitField0_;
    private com.google.protobuf.y cpuMetricReadings_;
    private m gaugeMetadata_;
    private String sessionId_ = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        com.google.protobuf.t.t(o.class, oVar);
    }

    public o() {
        x0 x0Var = x0.f11996d;
        this.cpuMetricReadings_ = x0Var;
        this.androidMemoryReadings_ = x0Var;
    }

    public static o B() {
        return DEFAULT_INSTANCE;
    }

    public static n F() {
        return (n) DEFAULT_INSTANCE.l();
    }

    public static void v(o oVar, String str) {
        oVar.getClass();
        str.getClass();
        oVar.bitField0_ |= 1;
        oVar.sessionId_ = str;
    }

    public static void w(o oVar, d dVar) {
        oVar.getClass();
        dVar.getClass();
        com.google.protobuf.y yVar = oVar.androidMemoryReadings_;
        if (!((com.google.protobuf.c) yVar).f11897a) {
            oVar.androidMemoryReadings_ = com.google.protobuf.t.s(yVar);
        }
        oVar.androidMemoryReadings_.add(dVar);
    }

    public static void x(o oVar, m mVar) {
        oVar.getClass();
        mVar.getClass();
        oVar.gaugeMetadata_ = mVar;
        oVar.bitField0_ |= 2;
    }

    public static void y(o oVar, k kVar) {
        oVar.getClass();
        kVar.getClass();
        com.google.protobuf.y yVar = oVar.cpuMetricReadings_;
        if (!((com.google.protobuf.c) yVar).f11897a) {
            oVar.cpuMetricReadings_ = com.google.protobuf.t.s(yVar);
        }
        oVar.cpuMetricReadings_.add(kVar);
    }

    public final int A() {
        return this.cpuMetricReadings_.size();
    }

    public final m C() {
        m mVar = this.gaugeMetadata_;
        if (mVar == null) {
            return m.y();
        }
        return mVar;
    }

    public final boolean D() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.protobuf.u0, java.lang.Object] */
    @Override // com.google.protobuf.t
    public final Object m(int i10) {
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new y0(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", k.class, "gaugeMetadata_", "androidMemoryReadings_", d.class});
                case 3:
                    return new o();
                case 4:
                    return new com.google.protobuf.r(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0 u0Var = PARSER;
                    u0 u0Var2 = u0Var;
                    if (u0Var == null) {
                        synchronized (o.class) {
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

    public final int z() {
        return this.androidMemoryReadings_.size();
    }
}
