package g7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f16663a;

    /* renamed from: b, reason: collision with root package name */
    public static final b1 f16664b;

    /* renamed from: c, reason: collision with root package name */
    public static final b1 f16665c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b1[] f16666d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g7.b1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g7.b1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g7.b1] */
    static {
        ?? r02 = new Enum("REFRESH", 0);
        f16663a = r02;
        ?? r12 = new Enum("PREPEND", 1);
        f16664b = r12;
        ?? r22 = new Enum("APPEND", 2);
        f16665c = r22;
        f16666d = new b1[]{r02, r12, r22};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f16666d.clone();
    }
}
