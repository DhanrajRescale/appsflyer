package lv;

/* loaded from: classes2.dex */
public enum b implements p {
    NANOS("Nanos"),
    /* JADX INFO: Fake field, exist only in values array */
    MICROS("Micros"),
    /* JADX INFO: Fake field, exist only in values array */
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    /* JADX INFO: Fake field, exist only in values array */
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    /* JADX INFO: Fake field, exist only in values array */
    DECADES("Decades"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTURIES("Centuries"),
    /* JADX INFO: Fake field, exist only in values array */
    MILLENNIA("Millennia"),
    /* JADX INFO: Fake field, exist only in values array */
    ERAS("Eras"),
    FOREVER("Forever");


    /* renamed from: a, reason: collision with root package name */
    public final String f25436a;

    static {
        hv.d.c(1L);
        hv.d.c(1000L);
        hv.d.c(1000000L);
        hv.d.d(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.f25436a = str;
    }

    @Override // lv.p
    public final boolean a() {
        if (compareTo(DAYS) >= 0 && this != FOREVER) {
            return true;
        }
        return false;
    }

    @Override // lv.p
    public final long b(j jVar, j jVar2) {
        return jVar.g(jVar2, this);
    }

    @Override // lv.p
    public final j c(j jVar, long j10) {
        return jVar.c(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f25436a;
    }
}
