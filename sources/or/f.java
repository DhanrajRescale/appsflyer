package or;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f30283a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f30284b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f30285c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f30286d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, or.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, or.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, or.f] */
    static {
        ?? r02 = new Enum("FORCE_NONE", 0);
        f30283a = r02;
        ?? r12 = new Enum("FORCE_SQUARE", 1);
        f30284b = r12;
        ?? r22 = new Enum("FORCE_RECTANGLE", 2);
        f30285c = r22;
        f30286d = new f[]{r02, r12, r22};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f30286d.clone();
    }
}
