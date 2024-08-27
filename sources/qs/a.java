package qs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32136a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f32137b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f32138c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f32139d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f32140e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f32141f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f32142g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f32143h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f32144i;

    /* JADX WARN: Type inference failed for: r0v0, types: [qs.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qs.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qs.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qs.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [qs.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [qs.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [qs.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [qs.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        f32136a = r02;
        ?? r12 = new Enum("SMALL", 1);
        f32137b = r12;
        ?? r22 = new Enum("MEDIUM", 2);
        f32138c = r22;
        ?? r32 = new Enum("LARGE", 3);
        f32139d = r32;
        ?? r42 = new Enum("HD720", 4);
        f32140e = r42;
        ?? r52 = new Enum("HD1080", 5);
        f32141f = r52;
        ?? r62 = new Enum("HIGH_RES", 6);
        f32142g = r62;
        ?? r72 = new Enum("DEFAULT", 7);
        f32143h = r72;
        f32144i = new a[]{r02, r12, r22, r32, r42, r52, r62, r72};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f32144i.clone();
    }
}
