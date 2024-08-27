package ge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f17337a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f17338b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f17339c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f17340d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f17341e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ r[] f17342f;

    /* JADX WARN: Type inference failed for: r0v0, types: [ge.r, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ge.r, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ge.r, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ge.r, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ge.r, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Uninitialized", 0);
        f17337a = r02;
        ?? r12 = new Enum("Loading", 1);
        f17338b = r12;
        ?? r22 = new Enum("Success", 2);
        f17339c = r22;
        ?? r32 = new Enum("Failure", 3);
        f17340d = r32;
        ?? r42 = new Enum("Backgrounded", 4);
        f17341e = r42;
        r[] rVarArr = {r02, r12, r22, r32, r42};
        f17342f = rVarArr;
        zq.f.E(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f17342f.clone();
    }
}
