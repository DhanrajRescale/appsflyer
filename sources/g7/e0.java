package g7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f16720a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f16721b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f16722c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e0[] f16723d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g7.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g7.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g7.e0] */
    static {
        ?? r02 = new Enum("ITEM_TO_PLACEHOLDER", 0);
        f16720a = r02;
        ?? r12 = new Enum("PLACEHOLDER_TO_ITEM", 1);
        f16721b = r12;
        ?? r22 = new Enum("PLACEHOLDER_POSITION_CHANGE", 2);
        f16722c = r22;
        f16723d = new e0[]{r02, r12, r22};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f16723d.clone();
    }
}
