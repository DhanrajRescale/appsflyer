package g7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16640a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f16641b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f16642c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g7.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g7.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g7.a] */
    static {
        ?? r02 = new Enum("UNBLOCKED", 0);
        f16640a = r02;
        ?? r12 = new Enum("COMPLETED", 1);
        ?? r22 = new Enum("REQUIRES_REFRESH", 2);
        f16641b = r22;
        f16642c = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16642c.clone();
    }
}
