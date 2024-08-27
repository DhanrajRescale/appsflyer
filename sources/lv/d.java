package lv;

/* loaded from: classes2.dex */
public enum d extends g {
    public d() {
        super("QUARTER_OF_YEAR", 1);
    }

    @Override // lv.m
    public final boolean c(k kVar) {
        if (kVar.i(a.MONTH_OF_YEAR) && iv.e.a(kVar).equals(iv.f.f20561a)) {
            return true;
        }
        return false;
    }

    @Override // lv.m
    public final q d() {
        return q.d(1L, 4L);
    }

    @Override // lv.m
    public final long e(k kVar) {
        if (kVar.i(this)) {
            return (kVar.f(a.MONTH_OF_YEAR) + 2) / 3;
        }
        throw new RuntimeException("Unsupported field: QuarterOfYear");
    }

    @Override // lv.m
    public final j g(j jVar, long j10) {
        long e10 = e(jVar);
        d().b(j10, this);
        a aVar = a.MONTH_OF_YEAR;
        return jVar.d(((j10 - e10) * 3) + jVar.f(aVar), aVar);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "QuarterOfYear";
    }
}
