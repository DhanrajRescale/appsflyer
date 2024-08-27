package u4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36728a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f36729b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f36730c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f36731d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f36732e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f36733f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f36734g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f36735h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f36736i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f36737j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u4.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u4.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u4.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, u4.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, u4.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, u4.a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, u4.a] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, u4.a] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, u4.a] */
    static {
        ?? r02 = new Enum("PENALTY_LOG", 0);
        f36728a = r02;
        ?? r12 = new Enum("PENALTY_DEATH", 1);
        f36729b = r12;
        ?? r22 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        f36730c = r22;
        ?? r32 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f36731d = r32;
        ?? r42 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f36732e = r42;
        ?? r52 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f36733f = r52;
        ?? r62 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        f36734g = r62;
        ?? r72 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f36735h = r72;
        ?? r82 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f36736i = r82;
        f36737j = new a[]{r02, r12, r22, r32, r42, r52, r62, r72, r82};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f36737j.clone();
    }
}
