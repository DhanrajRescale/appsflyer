package i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f18782a;

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f18783b;

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f18784c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a1[] f18785d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i0.a1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i0.a1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i0.a1] */
    static {
        ?? r02 = new Enum("None", 0);
        f18782a = r02;
        ?? r12 = new Enum("Selection", 1);
        f18783b = r12;
        ?? r22 = new Enum("Cursor", 2);
        f18784c = r22;
        f18785d = new a1[]{r02, r12, r22};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f18785d.clone();
    }
}
