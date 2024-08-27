package hb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f18140a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f18141b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f18142c;

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f18143d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f18144e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b0[] f18145f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hb.b0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hb.b0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hb.b0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, hb.b0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, hb.b0] */
    static {
        ?? r02 = new Enum("GRAY", 0);
        f18140a = r02;
        ?? r12 = new Enum("YELLOW", 1);
        f18141b = r12;
        ?? r22 = new Enum("GREEN", 2);
        f18142c = r22;
        ?? r32 = new Enum("ORANGE", 3);
        f18143d = r32;
        ?? r42 = new Enum("RED", 4);
        f18144e = r42;
        b0[] b0VarArr = {r02, r12, r22, r32, r42};
        f18145f = b0VarArr;
        zq.f.E(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f18145f.clone();
    }
}
