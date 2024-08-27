package rt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f33995a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f33996b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rt.d] */
    static {
        ?? r02 = new Enum("COMPLETE", 0);
        f33995a = r02;
        f33996b = new d[]{r02};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f33996b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
