package lv;

/* loaded from: classes2.dex */
public enum e extends g {
    public e() {
        super("WEEK_OF_WEEK_BASED_YEAR", 2);
    }

    @Override // lv.g, lv.m
    public final q b(k kVar) {
        if (kVar.i(this)) {
            return q.d(1L, g.j(g.i(hv.f.p(kVar))));
        }
        throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
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
        return q.e(1L, 52L, 53L);
    }

    @Override // lv.m
    public final long e(k kVar) {
        if (kVar.i(this)) {
            return g.h(hv.f.p(kVar));
        }
        throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
    }

    @Override // lv.m
    public final j g(j jVar, long j10) {
        d().b(j10, this);
        return jVar.c(el.l.I0(j10, e(jVar)), b.WEEKS);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}
