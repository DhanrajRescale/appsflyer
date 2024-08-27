package nb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28564a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f28565b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f28566c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nb.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nb.b] */
    static {
        ?? r02 = new Enum("SHIMMER_LOADER", 0);
        f28564a = r02;
        ?? r12 = new Enum("SWIPE_REFERESH", 1);
        f28565b = r12;
        b[] bVarArr = {r02, r12};
        f28566c = bVarArr;
        zq.f.E(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f28566c.clone();
    }
}
