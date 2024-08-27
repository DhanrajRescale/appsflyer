package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final q2 f26666a;

    /* renamed from: b, reason: collision with root package name */
    public static final q2 f26667b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ q2[] f26668c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m0.q2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m0.q2] */
    static {
        ?? r02 = new Enum("Closed", 0);
        f26666a = r02;
        ?? r12 = new Enum("Open", 1);
        f26667b = r12;
        f26668c = new q2[]{r02, r12};
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) f26668c.clone();
    }
}
