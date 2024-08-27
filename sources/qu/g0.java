package qu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f32205a;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f32206b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f32207c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f32208d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g0[] f32209e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qu.g0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qu.g0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qu.g0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qu.g0] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f32205a = r02;
        ?? r12 = new Enum("LAZY", 1);
        f32206b = r12;
        ?? r22 = new Enum("ATOMIC", 2);
        f32207c = r22;
        ?? r32 = new Enum("UNDISPATCHED", 3);
        f32208d = r32;
        g0[] g0VarArr = {r02, r12, r22, r32};
        f32209e = g0VarArr;
        zq.f.E(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f32209e.clone();
    }
}
