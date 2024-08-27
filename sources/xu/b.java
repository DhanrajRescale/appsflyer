package xu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f40567a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f40568b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f40569c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f40570d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f40571e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f40572f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xu.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xu.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xu.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, xu.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, xu.b] */
    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f40567a = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f40568b = r12;
        ?? r22 = new Enum("PARKING", 2);
        f40569c = r22;
        ?? r32 = new Enum("DORMANT", 3);
        f40570d = r32;
        ?? r42 = new Enum("TERMINATED", 4);
        f40571e = r42;
        b[] bVarArr = {r02, r12, r22, r32, r42};
        f40572f = bVarArr;
        zq.f.E(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f40572f.clone();
    }
}
