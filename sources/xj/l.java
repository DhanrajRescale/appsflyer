package xj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f40306a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f40307b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f40308c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xj.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xj.l] */
    static {
        ?? r02 = new Enum("SRGB", 0);
        f40306a = r02;
        ?? r12 = new Enum("DISPLAY_P3", 1);
        f40307b = r12;
        f40308c = new l[]{r02, r12};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f40308c.clone();
    }
}
