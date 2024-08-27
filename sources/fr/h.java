package fr;

import com.google.firebase.perf.metrics.Trace;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final yq.a f16223a = yq.a.d();

    public static void a(Trace trace, zq.e eVar) {
        int i10 = eVar.f42800a;
        if (i10 > 0) {
            trace.putMetric("_fr_tot", i10);
        }
        int i11 = eVar.f42801b;
        if (i11 > 0) {
            trace.putMetric("_fr_slo", i11);
        }
        int i12 = eVar.f42802c;
        if (i12 > 0) {
            trace.putMetric("_fr_fzn", i12);
        }
        StringBuilder sb2 = new StringBuilder("Screen trace: ");
        sb2.append(trace.f11840d);
        sb2.append(" _fr_tot:");
        jr.h.v(sb2, eVar.f42800a, " _fr_slo:", i11, " _fr_fzn:");
        sb2.append(i12);
        f16223a.a(sb2.toString());
    }
}
