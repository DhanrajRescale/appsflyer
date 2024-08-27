package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f23787a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f23788b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f23789c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f23790d;

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l0.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l0.l, java.lang.Enum] */
    static {
        ?? r02 = new Enum("TopLeft", 0);
        f23787a = r02;
        ?? r12 = new Enum("TopRight", 1);
        f23788b = r12;
        ?? r22 = new Enum("TopMiddle", 2);
        f23789c = r22;
        f23790d = new l[]{r02, r12, r22};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f23790d.clone();
    }
}
