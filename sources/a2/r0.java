package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f112a;

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f113b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ r0[] f114c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a2.r0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a2.r0] */
    static {
        ?? r02 = new Enum("Min", 0);
        f112a = r02;
        ?? r12 = new Enum("Max", 1);
        f113b = r12;
        f114c = new r0[]{r02, r12};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f114c.clone();
    }
}
