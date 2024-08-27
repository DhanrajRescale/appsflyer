package lv;

/* loaded from: classes2.dex */
public enum h implements p {
    WEEK_BASED_YEARS("WeekBasedYears"),
    /* JADX INFO: Fake field, exist only in values array */
    QUARTER_YEARS("QuarterYears");


    /* renamed from: a, reason: collision with root package name */
    public final String f25444a;

    static {
        hv.d dVar = hv.d.f18713c;
    }

    h(String str) {
        this.f25444a = str;
    }

    @Override // lv.p
    public final boolean a() {
        return true;
    }

    @Override // lv.p
    public final long b(j jVar, j jVar2) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return jVar.g(jVar2, b.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }
        h hVar = i.f25445a;
        f fVar = g.f25439c;
        return el.l.I0(jVar2.f(fVar), jVar.f(fVar));
    }

    @Override // lv.p
    public final j c(j jVar, long j10) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return jVar.c(j10 / 256, b.YEARS).c((j10 % 256) * 3, b.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }
        h hVar = i.f25445a;
        return jVar.d(el.l.F0(jVar.k(r0), j10), g.f25439c);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f25444a;
    }
}
