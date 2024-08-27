package g7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public static final c4 f16697a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c4[] f16698b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g7.c4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g7.c4] */
    static {
        ?? r02 = new Enum("LAUNCH_INITIAL_REFRESH", 0);
        f16697a = r02;
        f16698b = new c4[]{r02, new Enum("SKIP_INITIAL_REFRESH", 1)};
    }

    public static c4 valueOf(String str) {
        return (c4) Enum.valueOf(c4.class, str);
    }

    public static c4[] values() {
        return (c4[]) f16698b.clone();
    }
}
