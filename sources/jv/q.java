package jv;

import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class q implements e {

    /* renamed from: a, reason: collision with root package name */
    public final z f21716a;

    public q(z zVar) {
        this.f21716a = zVar;
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        boolean z10;
        hv.q qVar = (hv.q) oVar.f(lv.n.f25446a);
        int i10 = 0;
        if (qVar == null) {
            return false;
        }
        if (qVar.o() instanceof hv.r) {
            sb2.append(qVar.m());
            return true;
        }
        lv.k kVar = (lv.k) oVar.f15030c;
        lv.a aVar = lv.a.INSTANT_SECONDS;
        if (kVar.i(aVar)) {
            z10 = qVar.n().d(hv.e.l(0, kVar.f(aVar)));
        } else {
            z10 = false;
        }
        TimeZone timeZone = TimeZone.getTimeZone(qVar.m());
        z zVar = this.f21716a;
        zVar.getClass();
        if (z.values()[zVar.ordinal() & (-2)] == z.f21739a) {
            i10 = 1;
        }
        sb2.append(timeZone.getDisplayName(z10, i10, (Locale) oVar.f15031d));
        return true;
    }

    public final String toString() {
        return "ZoneText(" + this.f21716a + ")";
    }
}
