package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f7742a;

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f7743b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j1[] f7744c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c2.j1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c2.j1] */
    static {
        ?? r02 = new Enum("Min", 0);
        f7742a = r02;
        ?? r12 = new Enum("Max", 1);
        f7743b = r12;
        f7744c = new j1[]{r02, r12};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f7744c.clone();
    }
}
