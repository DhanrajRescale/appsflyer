package kj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f23229a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f23230b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f23231c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f23232d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kj.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kj.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kj.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, kj.k] */
    static {
        ?? r02 = new Enum("SUCCESS", 0);
        f23229a = r02;
        ?? r12 = new Enum("ERROR", 1);
        f23230b = r12;
        ?? r22 = new Enum("LOADING", 2);
        f23231c = r22;
        k[] kVarArr = {r02, r12, r22, new Enum("UNKNOWN", 3)};
        f23232d = kVarArr;
        zq.f.E(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f23232d.clone();
    }
}
