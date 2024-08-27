package r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final a3 f32324a;

    /* renamed from: b, reason: collision with root package name */
    public static final a3 f32325b;

    /* renamed from: c, reason: collision with root package name */
    public static final a3 f32326c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a3[] f32327d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r0.a3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r0.a3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r0.a3] */
    static {
        ?? r02 = new Enum("Hidden", 0);
        f32324a = r02;
        ?? r12 = new Enum("Expanded", 1);
        f32325b = r12;
        ?? r22 = new Enum("PartiallyExpanded", 2);
        f32326c = r22;
        f32327d = new a3[]{r02, r12, r22};
    }

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) f32327d.clone();
    }
}
