package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f39877a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f39878b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f39879c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f39880d;

    /* JADX WARN: Type inference failed for: r0v0, types: [x1.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x1.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [x1.l, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Initial", 0);
        f39877a = r02;
        ?? r12 = new Enum("Main", 1);
        f39878b = r12;
        ?? r22 = new Enum("Final", 2);
        f39879c = r22;
        f39880d = new l[]{r02, r12, r22};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f39880d.clone();
    }
}
