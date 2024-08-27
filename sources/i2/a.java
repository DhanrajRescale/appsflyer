package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19329a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f19330b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f19331c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i2.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i2.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i2.a] */
    static {
        ?? r02 = new Enum("On", 0);
        f19329a = r02;
        ?? r12 = new Enum("Off", 1);
        f19330b = r12;
        f19331c = new a[]{r02, r12, new Enum("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f19331c.clone();
    }
}
