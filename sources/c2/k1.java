package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f7752a;

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f7753b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k1[] f7754c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c2.k1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c2.k1] */
    static {
        ?? r02 = new Enum("Width", 0);
        f7752a = r02;
        ?? r12 = new Enum("Height", 1);
        f7753b = r12;
        f7754c = new k1[]{r02, r12};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) f7754c.clone();
    }
}
