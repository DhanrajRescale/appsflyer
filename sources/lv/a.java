package lv;

/* loaded from: classes2.dex */
public enum a implements m {
    NANO_OF_SECOND("NanoOfSecond", q.d(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", q.d(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", q.d(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", q.d(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", q.d(0, 999)),
    MILLI_OF_DAY("MilliOfDay", q.d(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", q.d(0, 59)),
    SECOND_OF_DAY("SecondOfDay", q.d(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", q.d(0, 59)),
    /* JADX INFO: Fake field, exist only in values array */
    MINUTE_OF_DAY("MinuteOfDay", q.d(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", q.d(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", q.d(1, 12)),
    HOUR_OF_DAY("HourOfDay", q.d(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", q.d(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", q.d(0, 1)),
    DAY_OF_WEEK("DayOfWeek", q.d(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", q.d(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", q.d(1, 7)),
    DAY_OF_MONTH("DayOfMonth", q.e(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", q.e(1, 365, 366)),
    EPOCH_DAY("EpochDay", q.d(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", q.e(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", q.d(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", q.d(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", q.d(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", q.e(1, 999999999, 1000000000)),
    YEAR("Year", q.d(-999999999, 999999999)),
    ERA("Era", q.d(0, 1)),
    INSTANT_SECONDS("InstantSeconds", q.d(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", q.d(-64800, 64800));


    /* renamed from: a, reason: collision with root package name */
    public final String f25424a;

    /* renamed from: b, reason: collision with root package name */
    public final q f25425b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, q qVar) {
        this.f25424a = str;
        this.f25425b = qVar;
    }

    @Override // lv.m
    public final boolean a() {
        if (ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal()) {
            return true;
        }
        return false;
    }

    @Override // lv.m
    public final q b(k kVar) {
        return kVar.j(this);
    }

    @Override // lv.m
    public final boolean c(k kVar) {
        return kVar.i(this);
    }

    @Override // lv.m
    public final q d() {
        return this.f25425b;
    }

    @Override // lv.m
    public final long e(k kVar) {
        return kVar.f(this);
    }

    @Override // lv.m
    public final boolean f() {
        if (ordinal() < DAY_OF_WEEK.ordinal()) {
            return true;
        }
        return false;
    }

    @Override // lv.m
    public final j g(j jVar, long j10) {
        return jVar.d(j10, this);
    }

    public final void h(long j10) {
        this.f25425b.b(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f25424a;
    }
}
