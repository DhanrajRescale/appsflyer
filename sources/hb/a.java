package hb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18129a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f18130b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f18131c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f18132d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hb.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hb.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hb.a] */
    static {
        ?? r02 = new Enum("POSITIVE", 0);
        f18129a = r02;
        ?? r12 = new Enum("NEGATIVE", 1);
        f18130b = r12;
        ?? r22 = new Enum("NEUTRAL", 2);
        f18131c = r22;
        a[] aVarArr = {r02, r12, r22};
        f18132d = aVarArr;
        zq.f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f18132d.clone();
    }
}
