package kb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23020a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f23021b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f23022c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f23023d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kb.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kb.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kb.a] */
    static {
        ?? r02 = new Enum("PAGINATION_LOADER", 0);
        f23020a = r02;
        ?? r12 = new Enum("SHIMMER_LOADER", 1);
        f23021b = r12;
        ?? r22 = new Enum("GENERIC_PROGRESS_BAR", 2);
        f23022c = r22;
        a[] aVarArr = {r02, r12, r22};
        f23023d = aVarArr;
        zq.f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f23023d.clone();
    }
}
