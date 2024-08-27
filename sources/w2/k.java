package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f38799a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f38800b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f38801c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, w2.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, w2.k] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f38799a = r02;
        ?? r12 = new Enum("Rtl", 1);
        f38800b = r12;
        f38801c = new k[]{r02, r12};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f38801c.clone();
    }
}
