package lv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final d f25437a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f25438b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f25439c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f25440d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f25441e;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    static {
        g gVar = new g() { // from class: lv.c
            @Override // lv.g, lv.m
            public final q b(k kVar) {
                if (kVar.i(this)) {
                    long f10 = kVar.f(g.f25437a);
                    if (f10 == 1) {
                        long f11 = kVar.f(a.YEAR);
                        iv.f.f20561a.getClass();
                        if (iv.f.b(f11)) {
                            return q.d(1L, 91L);
                        }
                        return q.d(1L, 90L);
                    }
                    if (f10 == 2) {
                        return q.d(1L, 91L);
                    }
                    if (f10 != 3 && f10 != 4) {
                        return d();
                    }
                    return q.d(1L, 92L);
                }
                throw new RuntimeException("Unsupported field: DayOfQuarter");
            }

            @Override // lv.m
            public final boolean c(k kVar) {
                if (kVar.i(a.DAY_OF_YEAR) && kVar.i(a.MONTH_OF_YEAR) && kVar.i(a.YEAR) && iv.e.a(kVar).equals(iv.f.f20561a)) {
                    return true;
                }
                return false;
            }

            @Override // lv.m
            public final q d() {
                return q.e(1L, 90L, 92L);
            }

            @Override // lv.m
            public final long e(k kVar) {
                int i10;
                if (kVar.i(this)) {
                    int k10 = kVar.k(a.DAY_OF_YEAR);
                    int k11 = kVar.k(a.MONTH_OF_YEAR);
                    long f10 = kVar.f(a.YEAR);
                    int[] iArr = g.f25440d;
                    int i11 = (k11 - 1) / 3;
                    iv.f.f20561a.getClass();
                    if (iv.f.b(f10)) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    return k10 - iArr[i11 + i10];
                }
                throw new RuntimeException("Unsupported field: DayOfQuarter");
            }

            @Override // lv.m
            public final j g(j jVar, long j10) {
                long e10 = e(jVar);
                d().b(j10, this);
                a aVar = a.DAY_OF_YEAR;
                return jVar.d((j10 - e10) + jVar.f(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        d dVar = new d();
        f25437a = dVar;
        e eVar = new e();
        f25438b = eVar;
        f fVar = new f();
        f25439c = fVar;
        f25441e = new g[]{gVar, dVar, eVar, fVar};
        f25440d = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int h(hv.f fVar) {
        int ordinal = fVar.r().ordinal();
        int i10 = 1;
        int s7 = fVar.s() - 1;
        int i11 = (3 - ordinal) + s7;
        int i12 = i11 - ((i11 / 7) * 7);
        int i13 = i12 - 3;
        if (i13 < -3) {
            i13 = i12 + 4;
        }
        if (s7 < i13) {
            return (int) q.d(1L, j(i(fVar.K(180).F(-1L)))).f25456d;
        }
        int i14 = ((s7 - i13) / 7) + 1;
        if (i14 != 53 || i13 == -3 || (i13 == -2 && fVar.w())) {
            i10 = i14;
        }
        return i10;
    }

    public static int i(hv.f fVar) {
        int i10 = fVar.f18721a;
        int s7 = fVar.s();
        if (s7 <= 3) {
            if (s7 - fVar.r().ordinal() < -2) {
                return i10 - 1;
            }
            return i10;
        }
        if (s7 >= 363) {
            if (((s7 - 363) - (fVar.w() ? 1 : 0)) - fVar.r().ordinal() >= 0) {
                return i10 + 1;
            }
            return i10;
        }
        return i10;
    }

    public static int j(int i10) {
        hv.f A = hv.f.A(i10, 1, 1);
        if (A.r() != hv.c.f18709c) {
            if (A.r() != hv.c.f18708b || !A.w()) {
                return 52;
            }
            return 53;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f25441e.clone();
    }

    @Override // lv.m
    public final boolean a() {
        return true;
    }

    public q b(k kVar) {
        return d();
    }

    @Override // lv.m
    public final boolean f() {
        return false;
    }
}
