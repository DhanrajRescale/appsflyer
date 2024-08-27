package jv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    public static final gt.c f21717h = new gt.c(12);

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f21718i;

    /* renamed from: a, reason: collision with root package name */
    public r f21719a;

    /* renamed from: b, reason: collision with root package name */
    public final r f21720b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21721c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21722d;

    /* renamed from: e, reason: collision with root package name */
    public int f21723e;

    /* renamed from: f, reason: collision with root package name */
    public char f21724f;

    /* renamed from: g, reason: collision with root package name */
    public int f21725g;

    static {
        HashMap hashMap = new HashMap();
        f21718i = hashMap;
        hashMap.put('G', lv.a.ERA);
        hashMap.put('y', lv.a.YEAR_OF_ERA);
        hashMap.put('u', lv.a.YEAR);
        lv.h hVar = lv.i.f25445a;
        lv.d dVar = lv.g.f25437a;
        hashMap.put('Q', dVar);
        hashMap.put('q', dVar);
        lv.a aVar = lv.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', lv.a.DAY_OF_YEAR);
        hashMap.put('d', lv.a.DAY_OF_MONTH);
        hashMap.put('F', lv.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        lv.a aVar2 = lv.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', lv.a.AMPM_OF_DAY);
        hashMap.put('H', lv.a.HOUR_OF_DAY);
        hashMap.put('k', lv.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', lv.a.HOUR_OF_AMPM);
        hashMap.put('h', lv.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', lv.a.MINUTE_OF_HOUR);
        hashMap.put('s', lv.a.SECOND_OF_MINUTE);
        lv.a aVar3 = lv.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', lv.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', lv.a.NANO_OF_DAY);
    }

    public r() {
        this.f21719a = this;
        this.f21721c = new ArrayList();
        this.f21725g = -1;
        this.f21720b = null;
        this.f21722d = false;
    }

    public final void a(a aVar) {
        d dVar = aVar.f21671a;
        if (dVar.f21681b) {
            dVar = new d(dVar.f21680a, false);
        }
        b(dVar);
    }

    public final int b(e eVar) {
        el.l.D0(eVar, "pp");
        r rVar = this.f21719a;
        int i10 = rVar.f21723e;
        if (i10 > 0) {
            k kVar = new k(eVar, i10, rVar.f21724f);
            rVar.f21723e = 0;
            rVar.f21724f = (char) 0;
            eVar = kVar;
        }
        rVar.f21721c.add(eVar);
        this.f21719a.f21725g = -1;
        return r5.f21721c.size() - 1;
    }

    public final void c(char c10) {
        b(new c(c10));
    }

    public final void d(String str) {
        el.l.D0(str, "literal");
        if (str.length() > 0) {
            int i10 = 1;
            if (str.length() == 1) {
                b(new c(str.charAt(0)));
            } else {
                b(new h(str, i10));
            }
        }
    }

    public final void e(z zVar) {
        if (zVar != z.f21739a && zVar != z.f21741c) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        b(new h(zVar, 0));
    }

    public final void f(String str, String str2) {
        b(new j(str2, str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x00cd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00d0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03c2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.r.g(java.lang.String):void");
    }

    public final void h(lv.a aVar, HashMap hashMap) {
        el.l.D0(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        z zVar = z.f21739a;
        b(new n(aVar, zVar, new b(new x(Collections.singletonMap(zVar, linkedHashMap)))));
    }

    public final void i(lv.m mVar, z zVar) {
        AtomicReference atomicReference = u.f21731a;
        b(new n(mVar, zVar, t.f21730a));
    }

    public final void j(i iVar) {
        i c10;
        r rVar = this.f21719a;
        int i10 = rVar.f21725g;
        if (i10 >= 0 && (rVar.f21721c.get(i10) instanceof i)) {
            r rVar2 = this.f21719a;
            int i11 = rVar2.f21725g;
            i iVar2 = (i) rVar2.f21721c.get(i11);
            int i12 = iVar.f21690b;
            int i13 = iVar.f21691c;
            if (i12 == i13 && iVar.f21692d == 4) {
                c10 = iVar2.d(i13);
                b(iVar.c());
                this.f21719a.f21725g = i11;
            } else {
                c10 = iVar2.c();
                this.f21719a.f21725g = b(iVar);
            }
            this.f21719a.f21721c.set(i11, c10);
            return;
        }
        this.f21719a.f21725g = b(iVar);
    }

    public final void k(lv.m mVar) {
        j(new i(mVar, 1, 19, 1));
    }

    public final void l(lv.m mVar, int i10) {
        el.l.D0(mVar, "field");
        if (i10 >= 1 && i10 <= 19) {
            j(new i(mVar, i10, i10, 4));
            return;
        }
        throw new IllegalArgumentException(jr.h.n("The width must be from 1 to 19 inclusive but was ", i10));
    }

    public final void m(lv.m mVar, int i10, int i11, int i12) {
        if (i10 == i11 && i12 == 4) {
            l(mVar, i11);
            return;
        }
        el.l.D0(mVar, "field");
        nn.d.r(i12, "signStyle");
        if (i10 >= 1 && i10 <= 19) {
            if (i11 >= 1 && i11 <= 19) {
                if (i11 >= i10) {
                    j(new i(mVar, i10, i11, i12));
                    return;
                }
                throw new IllegalArgumentException(da.e.m("The maximum width must exceed or equal the minimum width but ", i11, " < ", i10));
            }
            throw new IllegalArgumentException(jr.h.n("The maximum width must be from 1 to 19 inclusive but was ", i11));
        }
        throw new IllegalArgumentException(jr.h.n("The minimum width must be from 1 to 19 inclusive but was ", i10));
    }

    public final void n() {
        r rVar = this.f21719a;
        if (rVar.f21720b != null) {
            if (rVar.f21721c.size() > 0) {
                r rVar2 = this.f21719a;
                d dVar = new d(rVar2.f21721c, rVar2.f21722d);
                this.f21719a = this.f21719a.f21720b;
                b(dVar);
                return;
            }
            this.f21719a = this.f21719a.f21720b;
            return;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public final void o() {
        r rVar = this.f21719a;
        rVar.f21725g = -1;
        this.f21719a = new r(rVar);
    }

    public final a p(Locale locale) {
        el.l.D0(locale, "locale");
        while (this.f21719a.f21720b != null) {
            n();
        }
        return new a(new d(this.f21721c, false), locale, v.f21732a, w.f21734b, null, null, null);
    }

    public final a q(w wVar) {
        a p10 = p(Locale.getDefault());
        if (!el.l.P(p10.f21674d, wVar)) {
            return new a(p10.f21671a, p10.f21672b, p10.f21673c, wVar, p10.f21675e, p10.f21676f, p10.f21677g);
        }
        return p10;
    }

    public r(r rVar) {
        this.f21719a = this;
        this.f21721c = new ArrayList();
        this.f21725g = -1;
        this.f21720b = rVar;
        this.f21722d = true;
    }
}
