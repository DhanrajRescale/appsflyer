package on;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f30122a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f30123b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f30124c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f30125d;

    /* JADX WARN: Type inference failed for: r0v0, types: [on.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [on.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [on.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f30122a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f30123b = r12;
        ?? r22 = new Enum("DEVICE_CHARGING", 2);
        f30124c = r22;
        f30125d = new d[]{r02, r12, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f30125d.clone();
    }
}
