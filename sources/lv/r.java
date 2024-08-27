package lv;

/* loaded from: classes2.dex */
public final class r implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final q f25457f = q.d(1, 7);

    /* renamed from: g, reason: collision with root package name */
    public static final q f25458g = q.e(0, 4, 6);

    /* renamed from: h, reason: collision with root package name */
    public static final q f25459h;

    /* renamed from: i, reason: collision with root package name */
    public static final q f25460i;

    /* renamed from: a, reason: collision with root package name */
    public final String f25461a;

    /* renamed from: b, reason: collision with root package name */
    public final s f25462b;

    /* renamed from: c, reason: collision with root package name */
    public final p f25463c;

    /* renamed from: d, reason: collision with root package name */
    public final p f25464d;

    /* renamed from: e, reason: collision with root package name */
    public final q f25465e;

    static {
        q.e(0L, 52L, 54L);
        f25459h = q.e(1L, 52L, 53L);
        f25460i = a.YEAR.f25425b;
    }

    public r(String str, s sVar, p pVar, p pVar2, q qVar) {
        this.f25461a = str;
        this.f25462b = sVar;
        this.f25463c = pVar;
        this.f25464d = pVar2;
        this.f25465e = qVar;
    }

    public static int h(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    @Override // lv.m
    public final boolean a() {
        return true;
    }

    @Override // lv.m
    public final q b(k kVar) {
        a aVar;
        b bVar = b.WEEKS;
        p pVar = this.f25464d;
        if (pVar == bVar) {
            return this.f25465e;
        }
        if (pVar == b.MONTHS) {
            aVar = a.DAY_OF_MONTH;
        } else if (pVar == b.YEARS) {
            aVar = a.DAY_OF_YEAR;
        } else {
            if (pVar == i.f25445a) {
                return j(kVar);
            }
            if (pVar == b.FOREVER) {
                return kVar.j(a.YEAR);
            }
            throw new IllegalStateException("unreachable");
        }
        int k10 = k(kVar.k(aVar), el.l.X(kVar.k(a.DAY_OF_WEEK) - this.f25462b.f25467a.l(), 7) + 1);
        q j10 = kVar.j(aVar);
        return q.d(h(k10, (int) j10.f25453a), h(k10, (int) j10.f25456d));
    }

    @Override // lv.m
    public final boolean c(k kVar) {
        if (kVar.i(a.DAY_OF_WEEK)) {
            b bVar = b.WEEKS;
            p pVar = this.f25464d;
            if (pVar == bVar) {
                return true;
            }
            if (pVar == b.MONTHS) {
                return kVar.i(a.DAY_OF_MONTH);
            }
            if (pVar == b.YEARS) {
                return kVar.i(a.DAY_OF_YEAR);
            }
            if (pVar == i.f25445a) {
                return kVar.i(a.EPOCH_DAY);
            }
            if (pVar == b.FOREVER) {
                return kVar.i(a.EPOCH_DAY);
            }
            return false;
        }
        return false;
    }

    @Override // lv.m
    public final q d() {
        return this.f25465e;
    }

    @Override // lv.m
    public final long e(k kVar) {
        int i10;
        int h10;
        s sVar = this.f25462b;
        int l10 = sVar.f25467a.l();
        a aVar = a.DAY_OF_WEEK;
        int X = el.l.X(kVar.k(aVar) - l10, 7) + 1;
        b bVar = b.WEEKS;
        p pVar = this.f25464d;
        if (pVar == bVar) {
            return X;
        }
        if (pVar == b.MONTHS) {
            int k10 = kVar.k(a.DAY_OF_MONTH);
            h10 = h(k(k10, X), k10);
        } else if (pVar == b.YEARS) {
            int k11 = kVar.k(a.DAY_OF_YEAR);
            h10 = h(k(k11, X), k11);
        } else {
            h hVar = i.f25445a;
            int i11 = sVar.f25468b;
            hv.c cVar = sVar.f25467a;
            int i12 = 365;
            if (pVar == hVar) {
                int X2 = el.l.X(kVar.k(aVar) - cVar.l(), 7) + 1;
                long i13 = i(kVar, X2);
                if (i13 == 0) {
                    ((iv.f) iv.e.a(kVar)).getClass();
                    i10 = ((int) i(hv.f.p(kVar).a(1L, bVar), X2)) + 1;
                } else {
                    if (i13 >= 53) {
                        int k12 = k(kVar.k(a.DAY_OF_YEAR), X2);
                        if (hv.o.m(kVar.k(a.YEAR))) {
                            i12 = 366;
                        }
                        if (i13 >= h(k12, i12 + i11)) {
                            i13 -= r14 - 1;
                        }
                    }
                    i10 = (int) i13;
                }
                return i10;
            }
            if (pVar == b.FOREVER) {
                int X3 = el.l.X(kVar.k(aVar) - cVar.l(), 7) + 1;
                int k13 = kVar.k(a.YEAR);
                long i14 = i(kVar, X3);
                if (i14 == 0) {
                    k13--;
                } else if (i14 >= 53) {
                    int k14 = k(kVar.k(a.DAY_OF_YEAR), X3);
                    if (hv.o.m(k13)) {
                        i12 = 366;
                    }
                    if (i14 >= h(k14, i12 + i11)) {
                        k13++;
                    }
                }
                return k13;
            }
            throw new IllegalStateException("unreachable");
        }
        return h10;
    }

    @Override // lv.m
    public final boolean f() {
        return false;
    }

    @Override // lv.m
    public final j g(j jVar, long j10) {
        int a10 = this.f25465e.a(j10, this);
        if (a10 == jVar.k(this)) {
            return jVar;
        }
        if (this.f25464d == b.FOREVER) {
            s sVar = this.f25462b;
            int k10 = jVar.k(sVar.f25471e);
            long j11 = (long) ((j10 - r1) * 52.1775d);
            b bVar = b.WEEKS;
            j c10 = jVar.c(j11, bVar);
            int k11 = c10.k(this);
            r rVar = sVar.f25471e;
            if (k11 > a10) {
                return c10.a(c10.k(rVar), bVar);
            }
            if (c10.k(this) < a10) {
                c10 = c10.c(2L, bVar);
            }
            j c11 = c10.c(k10 - c10.k(rVar), bVar);
            if (c11.k(this) > a10) {
                return c11.a(1L, bVar);
            }
            return c11;
        }
        return jVar.c(a10 - r1, this.f25463c);
    }

    public final long i(k kVar, int i10) {
        int k10 = kVar.k(a.DAY_OF_YEAR);
        return h(k(k10, i10), k10);
    }

    public final q j(k kVar) {
        int i10;
        s sVar = this.f25462b;
        int X = el.l.X(kVar.k(a.DAY_OF_WEEK) - sVar.f25467a.l(), 7) + 1;
        long i11 = i(kVar, X);
        if (i11 == 0) {
            ((iv.f) iv.e.a(kVar)).getClass();
            return j(hv.f.p(kVar).a(2L, b.WEEKS));
        }
        int k10 = k(kVar.k(a.DAY_OF_YEAR), X);
        if (hv.o.m(kVar.k(a.YEAR))) {
            i10 = 366;
        } else {
            i10 = 365;
        }
        if (i11 >= h(k10, i10 + sVar.f25468b)) {
            ((iv.f) iv.e.a(kVar)).getClass();
            return j(hv.f.p(kVar).c(2L, b.WEEKS));
        }
        return q.d(1L, r0 - 1);
    }

    public final int k(int i10, int i11) {
        int X = el.l.X(i10 - i11, 7);
        int i12 = -X;
        if (X + 1 > this.f25462b.f25468b) {
            return 7 - X;
        }
        return i12;
    }

    public final String toString() {
        return this.f25461a + "[" + this.f25462b.toString() + "]";
    }
}
