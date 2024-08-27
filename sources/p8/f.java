package p8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f30738a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f30739b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f30740c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f30741d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f30742e;

    /* JADX WARN: Type inference failed for: r0v0, types: [p8.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p8.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p8.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [p8.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("MEMORY_CACHE", 0);
        f30738a = r02;
        ?? r12 = new Enum("MEMORY", 1);
        f30739b = r12;
        ?? r22 = new Enum("DISK", 2);
        f30740c = r22;
        ?? r32 = new Enum("NETWORK", 3);
        f30741d = r32;
        f[] fVarArr = {r02, r12, r22, r32};
        f30742e = fVarArr;
        zq.f.E(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f30742e.clone();
    }
}
