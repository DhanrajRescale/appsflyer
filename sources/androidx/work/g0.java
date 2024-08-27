package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f2565a;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f2566b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f2567c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f2568d;

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f2569e;

    /* renamed from: f, reason: collision with root package name */
    public static final g0 f2570f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g0[] f2571g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.work.g0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.work.g0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.work.g0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.work.g0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.work.g0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.work.g0] */
    static {
        ?? r02 = new Enum("ENQUEUED", 0);
        f2565a = r02;
        ?? r12 = new Enum("RUNNING", 1);
        f2566b = r12;
        ?? r22 = new Enum("SUCCEEDED", 2);
        f2567c = r22;
        ?? r32 = new Enum("FAILED", 3);
        f2568d = r32;
        ?? r42 = new Enum("BLOCKED", 4);
        f2569e = r42;
        ?? r52 = new Enum("CANCELLED", 5);
        f2570f = r52;
        f2571g = new g0[]{r02, r12, r22, r32, r42, r52};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f2571g.clone();
    }

    public final boolean a() {
        return this == f2567c || this == f2568d || this == f2570f;
    }
}
