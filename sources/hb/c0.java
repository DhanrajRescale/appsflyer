package hb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f18150a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f18151b;

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f18152c;

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f18153d;

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f18154e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c0[] f18155f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hb.c0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hb.c0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hb.c0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, hb.c0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, hb.c0] */
    static {
        ?? r02 = new Enum("STOP_LOSS", 0);
        f18150a = r02;
        ?? r12 = new Enum("PROFIT_LEFT", 1);
        f18151b = r12;
        ?? r22 = new Enum("STOP_LOSS_HIT", 2);
        f18152c = r22;
        ?? r32 = new Enum("LOSS_INCURRED", 3);
        f18153d = r32;
        ?? r42 = new Enum("PROFIT_ACHIEVED", 4);
        f18154e = r42;
        c0[] c0VarArr = {r02, r12, r22, r32, r42};
        f18155f = c0VarArr;
        zq.f.E(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f18155f.clone();
    }
}
