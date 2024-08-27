package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f35278a;

    /* renamed from: b, reason: collision with root package name */
    public static final z1 f35279b;

    /* renamed from: c, reason: collision with root package name */
    public static final z1 f35280c;

    /* renamed from: d, reason: collision with root package name */
    public static final z1 f35281d;

    /* renamed from: e, reason: collision with root package name */
    public static final z1 f35282e;

    /* renamed from: f, reason: collision with root package name */
    public static final z1 f35283f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z1[] f35284g;

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.z1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t0.z1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t0.z1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [t0.z1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [t0.z1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [t0.z1, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ShutDown", 0);
        f35278a = r02;
        ?? r12 = new Enum("ShuttingDown", 1);
        f35279b = r12;
        ?? r22 = new Enum("Inactive", 2);
        f35280c = r22;
        ?? r32 = new Enum("InactivePendingWork", 3);
        f35281d = r32;
        ?? r42 = new Enum("Idle", 4);
        f35282e = r42;
        ?? r52 = new Enum("PendingWork", 5);
        f35283f = r52;
        f35284g = new z1[]{r02, r12, r22, r32, r42, r52};
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) f35284g.clone();
    }
}
