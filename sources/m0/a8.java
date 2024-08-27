package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a8 {

    /* renamed from: a, reason: collision with root package name */
    public static final a8 f25890a;

    /* renamed from: b, reason: collision with root package name */
    public static final a8 f25891b;

    /* renamed from: c, reason: collision with root package name */
    public static final a8 f25892c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a8[] f25893d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m0.a8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m0.a8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m0.a8] */
    static {
        ?? r02 = new Enum("Tabs", 0);
        f25890a = r02;
        ?? r12 = new Enum("Divider", 1);
        f25891b = r12;
        ?? r22 = new Enum("Indicator", 2);
        f25892c = r22;
        f25893d = new a8[]{r02, r12, r22};
    }

    public static a8 valueOf(String str) {
        return (a8) Enum.valueOf(a8.class, str);
    }

    public static a8[] values() {
        return (a8[]) f25893d.clone();
    }
}
