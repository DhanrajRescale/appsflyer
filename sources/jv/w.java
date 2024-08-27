package jv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f21733a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f21734b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w[] f21735c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jv.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jv.w] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jv.w] */
    static {
        ?? r02 = new Enum("STRICT", 0);
        f21733a = r02;
        ?? r12 = new Enum("SMART", 1);
        f21734b = r12;
        f21735c = new w[]{r02, r12, new Enum("LENIENT", 2)};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f21735c.clone();
    }
}
