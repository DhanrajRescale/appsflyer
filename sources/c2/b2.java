package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b2 f7662a;

    /* renamed from: b, reason: collision with root package name */
    public static final b2 f7663b;

    /* renamed from: c, reason: collision with root package name */
    public static final b2 f7664c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b2[] f7665d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c2.b2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c2.b2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c2.b2] */
    static {
        ?? r02 = new Enum("ContinueTraversal", 0);
        f7662a = r02;
        ?? r12 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        f7663b = r12;
        ?? r22 = new Enum("CancelTraversal", 2);
        f7664c = r22;
        f7665d = new b2[]{r02, r12, r22};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) f7665d.clone();
    }
}
