package hv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c implements lv.k, lv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18707a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f18708b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f18709c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f18710d;

    /* renamed from: e, reason: collision with root package name */
    public static final c[] f18711e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f18712f;

    /* JADX WARN: Type inference failed for: r0v0, types: [hv.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hv.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hv.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [hv.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [hv.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [hv.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [hv.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("MONDAY", 0);
        f18707a = r02;
        ?? r12 = new Enum("TUESDAY", 1);
        ?? r22 = new Enum("WEDNESDAY", 2);
        f18708b = r22;
        ?? r32 = new Enum("THURSDAY", 3);
        f18709c = r32;
        ?? r42 = new Enum("FRIDAY", 4);
        ?? r52 = new Enum("SATURDAY", 5);
        ?? r62 = new Enum("SUNDAY", 6);
        f18710d = r62;
        f18712f = new c[]{r02, r12, r22, r32, r42, r52, r62};
        f18711e = values();
    }

    public static c m(int i10) {
        if (i10 >= 1 && i10 <= 7) {
            return f18711e[i10 - 1];
        }
        throw new RuntimeException(jr.h.n("Invalid value for DayOfWeek: ", i10));
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18712f.clone();
    }

    @Override // lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25448c) {
            return lv.b.DAYS;
        }
        if (oVar != lv.n.f25451f && oVar != lv.n.f25452g && oVar != lv.n.f25447b && oVar != lv.n.f25449d && oVar != lv.n.f25446a && oVar != lv.n.f25450e) {
            return oVar.h(this);
        }
        return null;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar == lv.a.DAY_OF_WEEK) {
            return l();
        }
        if (!(mVar instanceof lv.a)) {
            return mVar.e(this);
        }
        throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        return jVar.d(l(), lv.a.DAY_OF_WEEK);
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar != lv.a.DAY_OF_WEEK) {
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
        if (mVar == lv.a.DAY_OF_WEEK) {
            return mVar.d();
        }
        if (!(mVar instanceof lv.a)) {
            return mVar.b(this);
        }
        throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
    }

    @Override // lv.k
    public final int k(lv.m mVar) {
        if (mVar == lv.a.DAY_OF_WEEK) {
            return l();
        }
        return j(mVar).a(f(mVar), mVar);
    }

    public final int l() {
        return ordinal() + 1;
    }
}
