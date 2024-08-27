package j9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f21159a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f21160b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f21161c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f21162d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f21163e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f21164f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f21165g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j9.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j9.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j9.h] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j9.h] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j9.h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j9.h] */
    static {
        ?? r02 = new Enum("SET_ANIMATION", 0);
        f21159a = r02;
        ?? r12 = new Enum("SET_PROGRESS", 1);
        f21160b = r12;
        ?? r22 = new Enum("SET_REPEAT_MODE", 2);
        f21161c = r22;
        ?? r32 = new Enum("SET_REPEAT_COUNT", 3);
        f21162d = r32;
        ?? r42 = new Enum("SET_IMAGE_ASSETS", 4);
        f21163e = r42;
        ?? r52 = new Enum("PLAY_OPTION", 5);
        f21164f = r52;
        f21165g = new h[]{r02, r12, r22, r32, r42, r52};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f21165g.clone();
    }
}
