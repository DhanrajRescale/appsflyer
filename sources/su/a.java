package su;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34776a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f34777b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f34778c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f34779d;

    /* JADX WARN: Type inference failed for: r0v0, types: [su.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [su.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [su.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f34776a = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f34777b = r12;
        ?? r22 = new Enum("DROP_LATEST", 2);
        f34778c = r22;
        a[] aVarArr = {r02, r12, r22};
        f34779d = aVarArr;
        zq.f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f34779d.clone();
    }
}
