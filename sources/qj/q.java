package qj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f32055a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f32056b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f32057c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f32058d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f32059e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f32060f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f32061g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f32062h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ q[] f32063i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, qj.q] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, qj.q] */
    static {
        ?? r02 = new Enum("text", 0);
        f32055a = r02;
        ?? r12 = new Enum("number", 1);
        f32056b = r12;
        ?? r22 = new Enum("password", 2);
        f32057c = r22;
        ?? r32 = new Enum("tab", 3);
        f32058d = r32;
        ?? r42 = new Enum("calender", 4);
        ?? r52 = new Enum("dropdown", 5);
        f32059e = r52;
        ?? r62 = new Enum("none", 6);
        f32060f = r62;
        ?? r72 = new Enum("money", 7);
        f32061g = r72;
        ?? r82 = new Enum("realNumber", 8);
        f32062h = r82;
        q[] qVarArr = {r02, r12, r22, r32, r42, r52, r62, r72, r82, new Enum("realNumberQuantity", 9), new Enum("alphanumeric", 10)};
        f32063i = qVarArr;
        zq.f.E(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f32063i.clone();
    }
}
