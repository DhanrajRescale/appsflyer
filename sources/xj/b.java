package xj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f40292a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f40293b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f40294c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f40295d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xj.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xj.b] */
    static {
        ?? r02 = new Enum("PREFER_ARGB_8888", 0);
        f40292a = r02;
        ?? r12 = new Enum("PREFER_RGB_565", 1);
        f40293b = r12;
        f40295d = new b[]{r02, r12};
        f40294c = r02;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f40295d.clone();
    }
}
