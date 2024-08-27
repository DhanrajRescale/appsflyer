package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2638a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f2639b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f2640c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f2641d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f2642e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f2643f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f2644g;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.work.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.work.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.work.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.work.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.work.v, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NOT_REQUIRED", 0);
        f2638a = r02;
        ?? r12 = new Enum("CONNECTED", 1);
        f2639b = r12;
        ?? r22 = new Enum("UNMETERED", 2);
        f2640c = r22;
        ?? r32 = new Enum("NOT_ROAMING", 3);
        f2641d = r32;
        ?? r42 = new Enum("METERED", 4);
        f2642e = r42;
        ?? r52 = new Enum("TEMPORARILY_UNMETERED", 5);
        f2643f = r52;
        f2644g = new v[]{r02, r12, r22, r32, r42, r52};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f2644g.clone();
    }
}
