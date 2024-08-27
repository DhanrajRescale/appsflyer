package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u8 {

    /* renamed from: a, reason: collision with root package name */
    public static final u8 f26913a;

    /* renamed from: b, reason: collision with root package name */
    public static final u8 f26914b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u8[] f26915c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m0.u8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m0.u8] */
    static {
        ?? r02 = new Enum("Filled", 0);
        f26913a = r02;
        ?? r12 = new Enum("Outlined", 1);
        f26914b = r12;
        f26915c = new u8[]{r02, r12};
    }

    public static u8 valueOf(String str) {
        return (u8) Enum.valueOf(u8.class, str);
    }

    public static u8[] values() {
        return (u8[]) f26915c.clone();
    }
}
