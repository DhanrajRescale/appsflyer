package qs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f32158a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f32159b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f32160c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f32161d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f32162e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f32163f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f32164g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f32165h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qs.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qs.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qs.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qs.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, qs.d] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, qs.d] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, qs.d] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        f32158a = r02;
        ?? r12 = new Enum("UNSTARTED", 1);
        f32159b = r12;
        ?? r22 = new Enum("ENDED", 2);
        f32160c = r22;
        ?? r32 = new Enum("PLAYING", 3);
        f32161d = r32;
        ?? r42 = new Enum("PAUSED", 4);
        f32162e = r42;
        ?? r52 = new Enum("BUFFERING", 5);
        f32163f = r52;
        ?? r62 = new Enum("VIDEO_CUED", 6);
        f32164g = r62;
        f32165h = new d[]{r02, r12, r22, r32, r42, r52, r62};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f32165h.clone();
    }
}
