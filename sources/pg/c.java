package pg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f31020a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f31021b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pg.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pg.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pg.c] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pg.c] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, pg.c] */
    static {
        ?? r02 = new Enum("ALL_HOLDINGS", 0);
        f31020a = r02;
        c[] cVarArr = {r02, new Enum("AMOUNT_INVESTED_LOW_TO_HIGH", 1), new Enum("AMOUNT_INVESTED_HIGH_TO_LOW", 2), new Enum("PERFORMANCE_LOW_TO_HIGH", 3), new Enum("PERFORMANCE_HIGH_TO_LOW", 4)};
        f31021b = cVarArr;
        zq.f.E(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f31021b.clone();
    }
}
