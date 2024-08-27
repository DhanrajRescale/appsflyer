package k7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f22624a;

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f22625b;

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f22626c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y0[] f22627d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k7.y0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k7.y0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, k7.y0] */
    static {
        ?? r02 = new Enum("ALLOW", 0);
        f22624a = r02;
        ?? r12 = new Enum("PREVENT_WHEN_EMPTY", 1);
        f22625b = r12;
        ?? r22 = new Enum("PREVENT", 2);
        f22626c = r22;
        f22627d = new y0[]{r02, r12, r22};
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) f22627d.clone();
    }
}
