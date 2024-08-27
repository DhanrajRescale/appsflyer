package p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f30551a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f30552b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f30553c;

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f30554d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e0[] f30555e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p2.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p2.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p2.e0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, p2.e0] */
    static {
        ?? r02 = new Enum("StartInput", 0);
        f30551a = r02;
        ?? r12 = new Enum("StopInput", 1);
        f30552b = r12;
        ?? r22 = new Enum("ShowKeyboard", 2);
        f30553c = r22;
        ?? r32 = new Enum("HideKeyboard", 3);
        f30554d = r32;
        f30555e = new e0[]{r02, r12, r22, r32};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f30555e.clone();
    }
}
