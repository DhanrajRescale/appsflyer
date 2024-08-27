package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f39717a;

    /* renamed from: b, reason: collision with root package name */
    public static final s1 f39718b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s1[] f39719c;

    /* JADX WARN: Type inference failed for: r0v0, types: [x.s1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x.s1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [x.s1, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Default", 0);
        f39717a = r02;
        ?? r12 = new Enum("UserInput", 1);
        f39718b = r12;
        f39719c = new s1[]{r02, r12, new Enum("PreventUserInput", 2)};
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) f39719c.clone();
    }
}
