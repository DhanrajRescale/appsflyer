package j9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f21155a;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f21156b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f21157c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g0[] f21158d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j9.g0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j9.g0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j9.g0] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f21155a = r02;
        ?? r12 = new Enum("HARDWARE", 1);
        f21156b = r12;
        ?? r22 = new Enum("SOFTWARE", 2);
        f21157c = r22;
        f21158d = new g0[]{r02, r12, r22};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f21158d.clone();
    }
}
