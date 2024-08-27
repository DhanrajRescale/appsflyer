package jv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f21739a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f21740b;

    /* renamed from: c, reason: collision with root package name */
    public static final z f21741c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f21742d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f21743e;

    /* renamed from: f, reason: collision with root package name */
    public static final z f21744f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z[] f21745g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jv.z] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jv.z] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jv.z] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, jv.z] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, jv.z] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, jv.z] */
    static {
        ?? r02 = new Enum("FULL", 0);
        f21739a = r02;
        ?? r12 = new Enum("FULL_STANDALONE", 1);
        f21740b = r12;
        ?? r22 = new Enum("SHORT", 2);
        f21741c = r22;
        ?? r32 = new Enum("SHORT_STANDALONE", 3);
        f21742d = r32;
        ?? r42 = new Enum("NARROW", 4);
        f21743e = r42;
        ?? r52 = new Enum("NARROW_STANDALONE", 5);
        f21744f = r52;
        f21745g = new z[]{r02, r12, r22, r32, r42, r52};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f21745g.clone();
    }
}
