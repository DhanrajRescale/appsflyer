package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static final t3 f26834a;

    /* renamed from: b, reason: collision with root package name */
    public static final t3 f26835b;

    /* renamed from: c, reason: collision with root package name */
    public static final t3 f26836c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t3[] f26837d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m0.t3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m0.t3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m0.t3] */
    static {
        ?? r02 = new Enum("Focused", 0);
        f26834a = r02;
        ?? r12 = new Enum("UnfocusedEmpty", 1);
        f26835b = r12;
        ?? r22 = new Enum("UnfocusedNotEmpty", 2);
        f26836c = r22;
        f26837d = new t3[]{r02, r12, r22};
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) f26837d.clone();
    }
}
