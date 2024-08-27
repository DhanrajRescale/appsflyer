package z8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f42178a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f42179b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f42180c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f42181d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z8.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z8.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z8.d] */
    static {
        ?? r02 = new Enum("EXACT", 0);
        f42178a = r02;
        ?? r12 = new Enum("INEXACT", 1);
        f42179b = r12;
        ?? r22 = new Enum("AUTOMATIC", 2);
        f42180c = r22;
        d[] dVarArr = {r02, r12, r22};
        f42181d = dVarArr;
        zq.f.E(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f42181d.clone();
    }
}
