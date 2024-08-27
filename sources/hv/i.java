package hv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i implements lv.k, lv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final i f18735a;

    /* renamed from: b, reason: collision with root package name */
    public static final i[] f18736b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f18737c;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, hv.i] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, hv.i] */
    static {
        ?? r02 = new Enum("JANUARY", 0);
        ?? r12 = new Enum("FEBRUARY", 1);
        f18735a = r12;
        f18737c = new i[]{r02, r12, new Enum("MARCH", 2), new Enum("APRIL", 3), new Enum("MAY", 4), new Enum("JUNE", 5), new Enum("JULY", 6), new Enum("AUGUST", 7), new Enum("SEPTEMBER", 8), new Enum("OCTOBER", 9), new Enum("NOVEMBER", 10), new Enum("DECEMBER", 11)};
        f18736b = values();
    }

    public static i p(int i10) {
        if (i10 >= 1 && i10 <= 12) {
            return f18736b[i10 - 1];
        }
        throw new RuntimeException(jr.h.n("Invalid value for MonthOfYear: ", i10));
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f18737c.clone();
    }

    @Override // lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25447b) {
            return iv.f.f20561a;
        }
        if (oVar == lv.n.f25448c) {
            return lv.b.MONTHS;
        }
        if (oVar != lv.n.f25451f && oVar != lv.n.f25452g && oVar != lv.n.f25449d && oVar != lv.n.f25446a && oVar != lv.n.f25450e) {
            return oVar.h(this);
        }
        return null;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar == lv.a.MONTH_OF_YEAR) {
            return m();
        }
        if (!(mVar instanceof lv.a)) {
            return mVar.e(this);
        }
        throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        if (iv.e.a(jVar).equals(iv.f.f20561a)) {
            return jVar.d(m(), lv.a.MONTH_OF_YEAR);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar != lv.a.MONTH_OF_YEAR) {
                return false;
            }
            return true;
        }
        if (mVar == null || !mVar.c(this)) {
            return false;
        }
        return true;
    }

    @Override // lv.k
    public final lv.q j(lv.m mVar) {
        if (mVar == lv.a.MONTH_OF_YEAR) {
            return mVar.d();
        }
        if (!(mVar instanceof lv.a)) {
            return mVar.b(this);
        }
        throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
    }

    @Override // lv.k
    public final int k(lv.m mVar) {
        if (mVar == lv.a.MONTH_OF_YEAR) {
            return m();
        }
        return j(mVar).a(f(mVar), mVar);
    }

    public final int l(boolean z10) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 60;
            case 3:
                return (z10 ? 1 : 0) + 91;
            case 4:
                return (z10 ? 1 : 0) + 121;
            case 5:
                return (z10 ? 1 : 0) + 152;
            case 6:
                return (z10 ? 1 : 0) + 182;
            case 7:
                return (z10 ? 1 : 0) + 213;
            case 8:
                return (z10 ? 1 : 0) + 244;
            case 9:
                return (z10 ? 1 : 0) + 274;
            case 10:
                return (z10 ? 1 : 0) + 305;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    public final int m() {
        return ordinal() + 1;
    }

    public final int n(boolean z10) {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                return 31;
            }
            return 30;
        }
        if (z10) {
            return 29;
        }
        return 28;
    }

    public final int o() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                return 31;
            }
            return 30;
        }
        return 29;
    }
}
