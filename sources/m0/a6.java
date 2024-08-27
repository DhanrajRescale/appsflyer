package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public static final a6 f25881a;

    /* renamed from: b, reason: collision with root package name */
    public static final a6 f25882b;

    /* renamed from: c, reason: collision with root package name */
    public static final a6 f25883c;

    /* renamed from: d, reason: collision with root package name */
    public static final a6 f25884d;

    /* renamed from: e, reason: collision with root package name */
    public static final a6 f25885e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a6[] f25886f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m0.a6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m0.a6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m0.a6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, m0.a6] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, m0.a6] */
    static {
        ?? r02 = new Enum("TopBar", 0);
        f25881a = r02;
        ?? r12 = new Enum("MainContent", 1);
        f25882b = r12;
        ?? r22 = new Enum("Snackbar", 2);
        f25883c = r22;
        ?? r32 = new Enum("Fab", 3);
        f25884d = r32;
        ?? r42 = new Enum("BottomBar", 4);
        f25885e = r42;
        f25886f = new a6[]{r02, r12, r22, r32, r42};
    }

    public static a6 valueOf(String str) {
        return (a6) Enum.valueOf(a6.class, str);
    }

    public static a6[] values() {
        return (a6[]) f25886f.clone();
    }
}
