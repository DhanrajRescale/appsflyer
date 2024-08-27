package hb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f18133a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f18134b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f18135c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a0[] f18136d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hb.a0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hb.a0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hb.a0] */
    static {
        ?? r02 = new Enum("TRADE_DURATION", 0);
        f18133a = r02;
        ?? r12 = new Enum("TRADE_DIRECTION", 1);
        f18134b = r12;
        ?? r22 = new Enum("NOTE", 2);
        f18135c = r22;
        a0[] a0VarArr = {r02, r12, r22};
        f18136d = a0VarArr;
        zq.f.E(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f18136d.clone();
    }
}
