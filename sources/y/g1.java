package y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g1 f40723a;

    /* renamed from: b, reason: collision with root package name */
    public static final g1 f40724b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g1[] f40725c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y.g1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y.g1] */
    static {
        ?? r02 = new Enum("Vertical", 0);
        f40723a = r02;
        ?? r12 = new Enum("Horizontal", 1);
        f40724b = r12;
        f40725c = new g1[]{r02, r12};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) f40725c.clone();
    }
}
