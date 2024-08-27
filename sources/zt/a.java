package zt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f42823a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f42824b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f42825c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f42826d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zt.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zt.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zt.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f42823a = r02;
        ?? r12 = new Enum("UNDECIDED", 1);
        f42824b = r12;
        ?? r22 = new Enum("RESUMED", 2);
        f42825c = r22;
        a[] aVarArr = {r02, r12, r22};
        f42826d = aVarArr;
        zq.f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f42826d.clone();
    }
}
