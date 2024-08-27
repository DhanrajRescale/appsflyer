package gr;

import com.google.protobuf.u0;
import com.google.protobuf.y0;

/* loaded from: classes2.dex */
public final class t extends com.google.protobuf.t implements u {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final t DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile u0 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private g applicationInfo_;
    private int bitField0_;
    private o gaugeMetric_;
    private r networkRequestMetric_;
    private a0 traceMetric_;
    private c0 transportInfo_;

    /* JADX WARN: Type inference failed for: r0v0, types: [gr.t, com.google.protobuf.t] */
    static {
        ?? tVar = new com.google.protobuf.t();
        DEFAULT_INSTANCE = tVar;
        com.google.protobuf.t.t(t.class, tVar);
    }

    public static s B() {
        return (s) DEFAULT_INSTANCE.l();
    }

    public static void v(t tVar, g gVar) {
        tVar.getClass();
        tVar.applicationInfo_ = gVar;
        tVar.bitField0_ |= 1;
    }

    public static void w(t tVar, o oVar) {
        tVar.getClass();
        oVar.getClass();
        tVar.gaugeMetric_ = oVar;
        tVar.bitField0_ |= 8;
    }

    public static void x(t tVar, a0 a0Var) {
        tVar.getClass();
        a0Var.getClass();
        tVar.traceMetric_ = a0Var;
        tVar.bitField0_ |= 2;
    }

    public static void y(t tVar, r rVar) {
        tVar.getClass();
        rVar.getClass();
        tVar.networkRequestMetric_ = rVar;
        tVar.bitField0_ |= 4;
    }

    public final boolean A() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // gr.u
    public final boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // gr.u
    public final boolean b() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // gr.u
    public final a0 c() {
        a0 a0Var = this.traceMetric_;
        if (a0Var == null) {
            return a0.I();
        }
        return a0Var;
    }

    @Override // gr.u
    public final boolean d() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // gr.u
    public final r e() {
        r rVar = this.networkRequestMetric_;
        if (rVar == null) {
            return r.J();
        }
        return rVar;
    }

    @Override // gr.u
    public final o f() {
        o oVar = this.gaugeMetric_;
        if (oVar == null) {
            return o.B();
        }
        return oVar;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [com.google.protobuf.u0, java.lang.Object] */
    @Override // com.google.protobuf.t
    public final Object m(int i10) {
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new y0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
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
                        synchronized (t.class) {
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

    public final g z() {
        g gVar = this.applicationInfo_;
        if (gVar == null) {
            return g.B();
        }
        return gVar;
    }
}
