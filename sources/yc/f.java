package yc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f41504a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f41505b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f41506c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f41507d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yc.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yc.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, yc.f] */
    static {
        ?? r02 = new Enum("MODIFY_PORTFOLIO", 0);
        f41504a = r02;
        ?? r12 = new Enum("ADD_STOCK", 1);
        f41505b = r12;
        ?? r22 = new Enum("ADD_OPTIONS", 2);
        f41506c = r22;
        f[] fVarArr = {r02, r12, r22};
        f41507d = fVarArr;
        zq.f.E(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f41507d.clone();
    }
}
