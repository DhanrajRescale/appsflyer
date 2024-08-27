package jv;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f21670h;

    /* renamed from: a, reason: collision with root package name */
    public final d f21671a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f21672b;

    /* renamed from: c, reason: collision with root package name */
    public final v f21673c;

    /* renamed from: d, reason: collision with root package name */
    public final w f21674d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f21675e;

    /* renamed from: f, reason: collision with root package name */
    public final iv.e f21676f;

    /* renamed from: g, reason: collision with root package name */
    public final hv.q f21677g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [jv.e, java.lang.Object] */
    static {
        r rVar = new r();
        lv.a aVar = lv.a.YEAR;
        rVar.m(aVar, 4, 10, 5);
        rVar.c('-');
        lv.a aVar2 = lv.a.MONTH_OF_YEAR;
        rVar.l(aVar2, 2);
        rVar.c('-');
        lv.a aVar3 = lv.a.DAY_OF_MONTH;
        rVar.l(aVar3, 2);
        w wVar = w.f21733a;
        a q10 = rVar.q(wVar);
        iv.f fVar = iv.f.f20561a;
        a c10 = q10.c(fVar);
        r rVar2 = new r();
        m mVar = m.f21705b;
        rVar2.b(mVar);
        rVar2.a(c10);
        j jVar = j.f21695d;
        rVar2.b(jVar);
        rVar2.q(wVar).c(fVar);
        r rVar3 = new r();
        rVar3.b(mVar);
        rVar3.a(c10);
        rVar3.o();
        rVar3.b(jVar);
        rVar3.q(wVar).c(fVar);
        r rVar4 = new r();
        lv.a aVar4 = lv.a.HOUR_OF_DAY;
        rVar4.l(aVar4, 2);
        rVar4.c(':');
        lv.a aVar5 = lv.a.MINUTE_OF_HOUR;
        rVar4.l(aVar5, 2);
        rVar4.o();
        rVar4.c(':');
        lv.a aVar6 = lv.a.SECOND_OF_MINUTE;
        rVar4.l(aVar6, 2);
        rVar4.o();
        rVar4.b(new f(lv.a.NANO_OF_SECOND, 0, 9, true));
        a q11 = rVar4.q(wVar);
        r rVar5 = new r();
        rVar5.b(mVar);
        rVar5.a(q11);
        rVar5.b(jVar);
        rVar5.q(wVar);
        r rVar6 = new r();
        rVar6.b(mVar);
        rVar6.a(q11);
        rVar6.o();
        rVar6.b(jVar);
        rVar6.q(wVar);
        r rVar7 = new r();
        rVar7.b(mVar);
        rVar7.a(c10);
        rVar7.c('T');
        rVar7.a(q11);
        a c11 = rVar7.q(wVar).c(fVar);
        r rVar8 = new r();
        rVar8.b(mVar);
        rVar8.a(c11);
        rVar8.b(jVar);
        a c12 = rVar8.q(wVar).c(fVar);
        r rVar9 = new r();
        rVar9.a(c12);
        rVar9.o();
        rVar9.c('[');
        m mVar2 = m.f21704a;
        rVar9.b(mVar2);
        gt.c cVar = r.f21717h;
        rVar9.b(new p(cVar, "ZoneRegionId()"));
        rVar9.c(']');
        rVar9.q(wVar).c(fVar);
        r rVar10 = new r();
        rVar10.a(c11);
        rVar10.o();
        rVar10.b(jVar);
        rVar10.o();
        rVar10.c('[');
        rVar10.b(mVar2);
        rVar10.b(new p(cVar, "ZoneRegionId()"));
        rVar10.c(']');
        rVar10.q(wVar).c(fVar);
        r rVar11 = new r();
        rVar11.b(mVar);
        rVar11.m(aVar, 4, 10, 5);
        rVar11.c('-');
        rVar11.l(lv.a.DAY_OF_YEAR, 3);
        rVar11.o();
        rVar11.b(jVar);
        rVar11.q(wVar).c(fVar);
        r rVar12 = new r();
        rVar12.b(mVar);
        lv.h hVar = lv.i.f25445a;
        rVar12.m(lv.g.f25439c, 4, 10, 5);
        rVar12.d("-W");
        rVar12.l(lv.g.f25438b, 2);
        rVar12.c('-');
        lv.a aVar7 = lv.a.DAY_OF_WEEK;
        rVar12.l(aVar7, 1);
        rVar12.o();
        rVar12.b(jVar);
        rVar12.q(wVar).c(fVar);
        r rVar13 = new r();
        rVar13.b(mVar);
        rVar13.b(new Object());
        f21670h = rVar13.q(wVar);
        r rVar14 = new r();
        rVar14.b(mVar);
        rVar14.l(aVar, 4);
        rVar14.l(aVar2, 2);
        rVar14.l(aVar3, 2);
        rVar14.o();
        rVar14.f("+HHMMss", "Z");
        rVar14.q(wVar).c(fVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        r rVar15 = new r();
        rVar15.b(mVar);
        rVar15.b(m.f21706c);
        rVar15.o();
        rVar15.h(aVar7, hashMap);
        rVar15.d(", ");
        rVar15.n();
        rVar15.m(aVar3, 1, 2, 4);
        rVar15.c(' ');
        rVar15.h(aVar2, hashMap2);
        rVar15.c(' ');
        rVar15.l(aVar, 4);
        rVar15.c(' ');
        rVar15.l(aVar4, 2);
        rVar15.c(':');
        rVar15.l(aVar5, 2);
        rVar15.o();
        rVar15.c(':');
        rVar15.l(aVar6, 2);
        rVar15.n();
        rVar15.c(' ');
        rVar15.f("+HHMM", "GMT");
        rVar15.q(w.f21734b).c(fVar);
    }

    public a(d dVar, Locale locale, v vVar, w wVar, Set set, iv.e eVar, hv.q qVar) {
        el.l.D0(dVar, "printerParser");
        this.f21671a = dVar;
        el.l.D0(locale, "locale");
        this.f21672b = locale;
        el.l.D0(vVar, "decimalStyle");
        this.f21673c = vVar;
        el.l.D0(wVar, "resolverStyle");
        this.f21674d = wVar;
        this.f21675e = set;
        this.f21676f = eVar;
        this.f21677g = qVar;
    }

    public static a b(String str) {
        r rVar = new r();
        rVar.g(str);
        return rVar.p(Locale.getDefault());
    }

    public final String a(lv.k kVar) {
        StringBuilder sb2 = new StringBuilder(32);
        el.l.D0(kVar, "temporal");
        try {
            this.f21671a.a(new e5.o(kVar, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public final a c(iv.f fVar) {
        if (el.l.P(this.f21676f, fVar)) {
            return this;
        }
        return new a(this.f21671a, this.f21672b, this.f21673c, this.f21674d, this.f21675e, fVar, this.f21677g);
    }

    public final String toString() {
        String dVar = this.f21671a.toString();
        if (!dVar.startsWith("[")) {
            return dVar.substring(1, dVar.length() - 1);
        }
        return dVar;
    }
}
