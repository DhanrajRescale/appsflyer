package qs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f32145a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f32146b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f32147c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f32148d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f32149e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f32150f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f32151g;

    /* JADX WARN: Type inference failed for: r0v0, types: [qs.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qs.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qs.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qs.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [qs.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [qs.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        f32145a = r02;
        ?? r12 = new Enum("RATE_0_25", 1);
        f32146b = r12;
        ?? r22 = new Enum("RATE_0_5", 2);
        f32147c = r22;
        ?? r32 = new Enum("RATE_1", 3);
        f32148d = r32;
        ?? r42 = new Enum("RATE_1_5", 4);
        f32149e = r42;
        ?? r52 = new Enum("RATE_2", 5);
        f32150f = r52;
        f32151g = new b[]{r02, r12, r22, r32, r42, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f32151g.clone();
    }
}
