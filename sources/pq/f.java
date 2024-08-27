package pq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f31308a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f31309b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f31310c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f31311d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pq.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pq.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pq.f] */
    static {
        ?? r02 = new Enum("OK", 0);
        f31308a = r02;
        ?? r12 = new Enum("BAD_CONFIG", 1);
        f31309b = r12;
        ?? r22 = new Enum("AUTH_ERROR", 2);
        f31310c = r22;
        f31311d = new f[]{r02, r12, r22};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f31311d.clone();
    }
}
