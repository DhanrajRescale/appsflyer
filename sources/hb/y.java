package hb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f18241a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f18242b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f18243c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f18244d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f18245e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y[] f18246f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hb.y] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hb.y] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hb.y] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, hb.y] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, hb.y] */
    static {
        ?? r02 = new Enum("SHARE", 0);
        f18241a = r02;
        ?? r12 = new Enum("VIEW_GROUP", 1);
        f18242b = r12;
        ?? r22 = new Enum("JOIN_GROUP", 2);
        f18243c = r22;
        ?? r32 = new Enum("BOOKMARK", 3);
        f18244d = r32;
        ?? r42 = new Enum("LIKE", 4);
        f18245e = r42;
        y[] yVarArr = {r02, r12, r22, r32, r42};
        f18246f = yVarArr;
        zq.f.E(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f18246f.clone();
    }
}
