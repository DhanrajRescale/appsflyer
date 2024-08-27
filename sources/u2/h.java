package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f36680a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f36681b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f36682c;

    /* JADX WARN: Type inference failed for: r0v0, types: [u2.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [u2.h, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f36680a = r02;
        ?? r12 = new Enum("Rtl", 1);
        f36681b = r12;
        f36682c = new h[]{r02, r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f36682c.clone();
    }
}
