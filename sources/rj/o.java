package rj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f33905a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f33906b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f33907c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f33908d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rj.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rj.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, rj.o] */
    static {
        ?? r02 = new Enum("POSITIVE", 0);
        f33905a = r02;
        ?? r12 = new Enum("NEGATIVE", 1);
        f33906b = r12;
        ?? r22 = new Enum("NEUTRAL", 2);
        f33907c = r22;
        o[] oVarArr = {r02, r12, r22};
        f33908d = oVarArr;
        zq.f.E(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f33908d.clone();
    }
}
