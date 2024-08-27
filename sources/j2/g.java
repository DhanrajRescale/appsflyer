package j2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f20713a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f20714b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f20715c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f20716d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f20717e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f20718f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f20719g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g[] f20720h;

    /* JADX WARN: Type inference failed for: r0v0, types: [j2.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j2.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j2.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [j2.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [j2.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [j2.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [j2.g, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Paragraph", 0);
        f20713a = r02;
        ?? r12 = new Enum("Span", 1);
        f20714b = r12;
        ?? r22 = new Enum("VerbatimTts", 2);
        f20715c = r22;
        ?? r32 = new Enum("Url", 3);
        f20716d = r32;
        ?? r42 = new Enum("Link", 4);
        f20717e = r42;
        ?? r52 = new Enum("Clickable", 5);
        f20718f = r52;
        ?? r62 = new Enum("String", 6);
        f20719g = r62;
        f20720h = new g[]{r02, r12, r22, r32, r42, r52, r62};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f20720h.clone();
    }
}
