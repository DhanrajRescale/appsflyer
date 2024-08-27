package i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f19288a;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f19289b;

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f19290c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z0[] f19291d;

    /* JADX WARN: Type inference failed for: r0v0, types: [i0.z0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [i0.z0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [i0.z0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Cursor", 0);
        f19288a = r02;
        ?? r12 = new Enum("SelectionStart", 1);
        f19289b = r12;
        ?? r22 = new Enum("SelectionEnd", 2);
        f19290c = r22;
        f19291d = new z0[]{r02, r12, r22};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f19291d.clone();
    }
}
