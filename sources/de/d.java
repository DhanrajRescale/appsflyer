package de;

import android.graphics.Typeface;
import android.os.Bundle;
import bv.j;
import bv.m;
import d2.w0;
import hv.g;
import hv.h;
import hv.q;
import hv.r;
import iv.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lv.k;
import lv.n;
import lv.o;
import o2.d0;
import o2.z;
import org.threeten.bp.DateTimeException;
import w.c2;
import w.t;

/* loaded from: classes.dex */
public final class d implements et.c, o, c2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14317a;

    public /* synthetic */ d(int i10) {
        this.f14317a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [bv.k0, java.lang.Object, bv.j] */
    public static void j(long j10, j jVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        int i15;
        int i16;
        Object obj;
        int i17 = i10;
        if (i11 < i12) {
            for (int i18 = i11; i18 < i12; i18++) {
                if (((m) arrayList.get(i18)).d() < i17) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            m mVar = (m) arrayList.get(i11);
            m mVar2 = (m) arrayList.get(i12 - 1);
            int i19 = -1;
            if (i17 == mVar.d()) {
                int intValue = ((Number) arrayList2.get(i11)).intValue();
                int i20 = i11 + 1;
                m mVar3 = (m) arrayList.get(i20);
                i13 = i20;
                i14 = intValue;
                mVar = mVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (mVar.i(i17) != mVar2.i(i17)) {
                int i21 = 1;
                for (int i22 = i13 + 1; i22 < i12; i22++) {
                    if (((m) arrayList.get(i22 - 1)).i(i17) != ((m) arrayList.get(i22)).i(i17)) {
                        i21++;
                    }
                }
                long j11 = 4;
                long j12 = (jVar.f7365b / j11) + j10 + 2 + (i21 * 2);
                jVar.e0(i21);
                jVar.e0(i14);
                for (int i23 = i13; i23 < i12; i23++) {
                    byte i24 = ((m) arrayList.get(i23)).i(i17);
                    if (i23 == i13 || i24 != ((m) arrayList.get(i23 - 1)).i(i17)) {
                        jVar.e0(i24 & 255);
                    }
                }
                int i25 = i13;
                j jVar2 = new Object();
                while (i25 < i12) {
                    byte i26 = ((m) arrayList.get(i25)).i(i17);
                    int i27 = i25 + 1;
                    int i28 = i27;
                    while (true) {
                        if (i28 < i12) {
                            if (i26 != ((m) arrayList.get(i28)).i(i17)) {
                                i15 = i28;
                                break;
                            }
                            i28++;
                        } else {
                            i15 = i12;
                            break;
                        }
                    }
                    if (i27 == i15 && i17 + 1 == ((m) arrayList.get(i25)).d()) {
                        jVar.e0(((Number) arrayList2.get(i25)).intValue());
                        i16 = i15;
                        obj = jVar2;
                    } else {
                        jVar.e0(((int) ((jVar2.f7365b / j11) + j12)) * i19);
                        i16 = i15;
                        obj = jVar2;
                        j(j12, jVar2, i17 + 1, arrayList, i25, i15, arrayList2);
                    }
                    jVar2 = obj;
                    i25 = i16;
                    i19 = -1;
                }
                jVar.s(jVar2);
                return;
            }
            int min = Math.min(mVar.d(), mVar2.d());
            int i29 = 0;
            for (int i30 = i17; i30 < min && mVar.i(i30) == mVar2.i(i30); i30++) {
                i29++;
            }
            long j13 = 4;
            long j14 = (jVar.f7365b / j13) + j10 + 2 + i29 + 1;
            jVar.e0(-i29);
            jVar.e0(i14);
            int i31 = i29 + i17;
            while (i17 < i31) {
                jVar.e0(mVar.i(i17) & 255);
                i17++;
            }
            if (i13 + 1 == i12) {
                if (i31 == ((m) arrayList.get(i13)).d()) {
                    jVar.e0(((Number) arrayList2.get(i13)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            ?? obj2 = new Object();
            jVar.e0(((int) ((obj2.f7365b / j13) + j14)) * (-1));
            j(j14, obj2, i31, arrayList, i13, i12, arrayList2);
            jVar.s(obj2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static Typeface k(String str, d0 d0Var, int i10) {
        Typeface create;
        Typeface create2;
        if (z.a(i10, 0) && Intrinsics.a(d0Var, d0.f29464f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, d0Var.f29469a, z.a(i10, 1));
        return create2;
    }

    public static Typeface l(String str, d0 d0Var, int i10) {
        if (z.a(i10, 0) && Intrinsics.a(d0Var, d0.f29464f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int l10 = w0.l(d0Var, i10);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, l10);
        }
        return Typeface.defaultFromStyle(l10);
    }

    public static qf.c m(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        qf.c cVar = new qf.c();
        cVar.setArguments(bundle2);
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, bv.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static bv.a0 n(bv.m... r11) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: de.d.n(bv.m[]):bv.a0");
    }

    @Override // et.c
    public void b(Object obj) {
        ((gv.a) obj).request();
    }

    @Override // w.a2
    public t e(long j10, t tVar, t tVar2, t tVar3) {
        return j10 < ((long) this.f14317a) * 1000000 ? tVar : tVar2;
    }

    @Override // w.a2
    public t f(long j10, t tVar, t tVar2, t tVar3) {
        return tVar3;
    }

    @Override // w.c2
    public int g() {
        return this.f14317a;
    }

    @Override // lv.o
    public Object h(k kVar) {
        gt.d dVar = n.f25450e;
        d dVar2 = n.f25446a;
        int i10 = this.f14317a;
        switch (i10) {
            case 6:
                hv.c cVar = hv.c.f18707a;
                if (kVar instanceof hv.c) {
                    return (hv.c) kVar;
                }
                try {
                    return hv.c.m(kVar.k(lv.a.DAY_OF_WEEK));
                } catch (DateTimeException e10) {
                    throw new RuntimeException("Unable to obtain DayOfWeek from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName(), e10);
                }
            case 7:
                return g.p(kVar);
            case 8:
                int i11 = hv.j.f18738c;
                if (kVar instanceof hv.j) {
                    return (hv.j) kVar;
                }
                try {
                    if (!f.f20561a.equals(iv.e.a(kVar))) {
                        kVar = hv.f.p(kVar);
                    }
                    return hv.j.l(kVar.k(lv.a.MONTH_OF_YEAR), kVar.k(lv.a.DAY_OF_MONTH));
                } catch (DateTimeException unused) {
                    throw new RuntimeException("Unable to obtain MonthDay from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
                }
            case 9:
                return hv.o.l(kVar);
            case 10:
                return r.r(kVar);
            case 11:
                return hv.m.f18747d;
            case 12:
                switch (i10) {
                    case 12:
                        return (q) kVar.b(this);
                    default:
                        q qVar = (q) kVar.b(dVar2);
                        if (qVar == null) {
                            return (q) kVar.b(dVar);
                        }
                        return qVar;
                }
            case 13:
                switch (i10) {
                    case 12:
                        return (q) kVar.b(this);
                    default:
                        q qVar2 = (q) kVar.b(dVar2);
                        if (qVar2 == null) {
                            return (q) kVar.b(dVar);
                        }
                        return qVar2;
                }
            default:
                lv.a aVar = lv.a.NANO_OF_DAY;
                if (kVar.i(aVar)) {
                    return h.p(kVar.f(aVar));
                }
                return null;
        }
    }

    @Override // w.c2
    public int i() {
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        this(0);
        this.f14317a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }
}
