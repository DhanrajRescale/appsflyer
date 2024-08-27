package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f119a;

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f120b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s0[] f121c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a2.s0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a2.s0] */
    static {
        ?? r02 = new Enum("Width", 0);
        f119a = r02;
        ?? r12 = new Enum("Height", 1);
        f120b = r12;
        f121c = new s0[]{r02, r12};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f121c.clone();
    }
}
