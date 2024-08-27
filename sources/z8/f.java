package z8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f42183a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f42184b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f42185c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z8.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z8.f] */
    static {
        ?? r02 = new Enum("FILL", 0);
        f42183a = r02;
        ?? r12 = new Enum("FIT", 1);
        f42184b = r12;
        f[] fVarArr = {r02, r12};
        f42185c = fVarArr;
        zq.f.E(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f42185c.clone();
    }
}
