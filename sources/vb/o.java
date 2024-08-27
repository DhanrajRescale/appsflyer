package vb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f37927a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f37928b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f37929c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f37930d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vb.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vb.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vb.o] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f37927a = r02;
        ?? r12 = new Enum("LOADING", 1);
        f37928b = r12;
        ?? r22 = new Enum("HIDE", 2);
        f37929c = r22;
        o[] oVarArr = {r02, r12, r22};
        f37930d = oVarArr;
        zq.f.E(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f37930d.clone();
    }
}
