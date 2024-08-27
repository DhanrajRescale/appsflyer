package r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l3 f32565a;

    /* renamed from: b, reason: collision with root package name */
    public static final l3 f32566b;

    /* renamed from: c, reason: collision with root package name */
    public static final l3 f32567c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l3[] f32568d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r0.l3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r0.l3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r0.l3] */
    static {
        ?? r02 = new Enum("Tabs", 0);
        f32565a = r02;
        ?? r12 = new Enum("Divider", 1);
        f32566b = r12;
        ?? r22 = new Enum("Indicator", 2);
        f32567c = r22;
        f32568d = new l3[]{r02, r12, r22};
    }

    public static l3 valueOf(String str) {
        return (l3) Enum.valueOf(l3.class, str);
    }

    public static l3[] values() {
        return (l3[]) f32568d.clone();
    }
}
