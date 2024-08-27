package qs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f32152a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f32153b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f32154c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f32155d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f32156e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f32157f;

    /* JADX WARN: Type inference failed for: r0v0, types: [qs.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qs.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qs.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qs.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [qs.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("UNKNOWN", 0);
        f32152a = r02;
        ?? r12 = new Enum("INVALID_PARAMETER_IN_REQUEST", 1);
        f32153b = r12;
        ?? r22 = new Enum("HTML_5_PLAYER", 2);
        f32154c = r22;
        ?? r32 = new Enum("VIDEO_NOT_FOUND", 3);
        f32155d = r32;
        ?? r42 = new Enum("VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER", 4);
        f32156e = r42;
        f32157f = new c[]{r02, r12, r22, r32, r42};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32157f.clone();
    }
}
