package r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final q2 f32681a;

    /* renamed from: b, reason: collision with root package name */
    public static final q2 f32682b;

    /* renamed from: c, reason: collision with root package name */
    public static final q2 f32683c;

    /* renamed from: d, reason: collision with root package name */
    public static final q2 f32684d;

    /* renamed from: e, reason: collision with root package name */
    public static final q2 f32685e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q2[] f32686f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r0.q2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r0.q2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r0.q2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, r0.q2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, r0.q2] */
    static {
        ?? r02 = new Enum("TopBar", 0);
        f32681a = r02;
        ?? r12 = new Enum("MainContent", 1);
        f32682b = r12;
        ?? r22 = new Enum("Snackbar", 2);
        f32683c = r22;
        ?? r32 = new Enum("Fab", 3);
        f32684d = r32;
        ?? r42 = new Enum("BottomBar", 4);
        f32685e = r42;
        f32686f = new q2[]{r02, r12, r22, r32, r42};
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) f32686f.clone();
    }
}
