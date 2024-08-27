package ip;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20468a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f20469b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f20470c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f20471d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f20472e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f20473f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f20474g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f20475h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, ip.d] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, ip.d] */
    static {
        ?? r02 = new Enum("SUCCESS", 0);
        f20468a = r02;
        ?? r12 = new Enum("INTERNAL_ERROR", 1);
        ?? r22 = new Enum("UNKNOWN_ERROR", 2);
        f20469b = r22;
        ?? r32 = new Enum("SERVICE_MISSING", 3);
        f20470c = r32;
        ?? r42 = new Enum("SERVICE_VERSION_UPDATE_REQUIRED", 4);
        f20471d = r42;
        ?? r52 = new Enum("SERVICE_DISABLED", 5);
        f20472e = r52;
        ?? r62 = new Enum("SERVICE_INVALID", 6);
        f20473f = r62;
        ?? r72 = new Enum("ERROR_CONNECTING_TO_SERVICE", 7);
        f20474g = r72;
        f20475h = new d[]{r02, r12, r22, r32, r42, r52, r62, r72, new Enum("CLIENT_LIBRARY_UPDATE_REQUIRED", 8), new Enum("NETWORK_ERROR", 9), new Enum("DEVELOPER_KEY_INVALID", 10), new Enum("INVALID_APPLICATION_SIGNATURE", 11)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f20475h.clone();
    }
}
