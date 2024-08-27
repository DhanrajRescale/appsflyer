package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f37636a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f37637b;

    /* renamed from: c, reason: collision with root package name */
    public static final z f37638c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z[] f37639d;

    /* JADX WARN: Type inference failed for: r0v0, types: [v.z, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v.z, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.z, java.lang.Enum] */
    static {
        ?? r02 = new Enum("PreEnter", 0);
        f37636a = r02;
        ?? r12 = new Enum("Visible", 1);
        f37637b = r12;
        ?? r22 = new Enum("PostExit", 2);
        f37638c = r22;
        f37639d = new z[]{r02, r12, r22};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f37639d.clone();
    }
}
