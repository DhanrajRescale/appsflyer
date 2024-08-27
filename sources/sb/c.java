package sb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f34437a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f34438b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f34439c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f34440d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f34441e;

    /* JADX WARN: Type inference failed for: r0v0, types: [sb.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sb.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [sb.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [sb.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("PAGINATION_LOADER", 0);
        f34437a = r02;
        ?? r12 = new Enum("SHIMMER_LOADER", 1);
        f34438b = r12;
        ?? r22 = new Enum("SWIPE_REFERESH", 2);
        f34439c = r22;
        ?? r32 = new Enum("SHARE_LOADER", 3);
        f34440d = r32;
        c[] cVarArr = {r02, r12, r22, r32};
        f34441e = cVarArr;
        zq.f.E(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f34441e.clone();
    }
}
