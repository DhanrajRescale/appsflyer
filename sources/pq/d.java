package pq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f31300a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f31301b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f31302c;

    /* JADX WARN: Type inference failed for: r0v0, types: [pq.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pq.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("OK", 0);
        f31300a = r02;
        ?? r12 = new Enum("BAD_CONFIG", 1);
        f31301b = r12;
        f31302c = new d[]{r02, r12};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f31302c.clone();
    }
}
