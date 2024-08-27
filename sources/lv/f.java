package lv;

/* loaded from: classes2.dex */
public enum f extends g {
    public f() {
        super("WEEK_BASED_YEAR", 3);
    }

    @Override // lv.g, lv.m
    public final q b(k kVar) {
        return a.YEAR.f25425b;
    }

    @Override // lv.m
    public final boolean c(k kVar) {
        if (kVar.i(a.EPOCH_DAY) && iv.e.a(kVar).equals(iv.f.f20561a)) {
            return true;
        }
        return false;
    }

    @Override // lv.m
    public final q d() {
        return a.YEAR.f25425b;
    }

    @Override // lv.m
    public final long e(k kVar) {
        if (kVar.i(this)) {
            return g.i(hv.f.p(kVar));
        }
        throw new RuntimeException("Unsupported field: WeekBasedYear");
    }

    @Override // lv.m
    public final j g(j jVar, long j10) {
        if (c(jVar)) {
            int a10 = a.YEAR.f25425b.a(j10, g.f25439c);
            hv.f p10 = hv.f.p(jVar);
            int k10 = p10.k(a.DAY_OF_WEEK);
            int h10 = g.h(p10);
            if (h10 == 53 && g.j(a10) == 52) {
                h10 = 52;
            }
            return jVar.e(hv.f.A(a10, 1, 4).D(((h10 - 1) * 7) + (k10 - r6.k(r0))));
        }
        throw new RuntimeException("Unsupported field: WeekBasedYear");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "WeekBasedYear";
    }
}
