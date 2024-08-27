package ej;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15445a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f15446b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f15447c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f15448d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ej.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ej.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ej.a] */
    static {
        ?? r02 = new Enum("RESET", 0);
        f15445a = r02;
        ?? r12 = new Enum("SWIPE", 1);
        f15446b = r12;
        ?? r22 = new Enum("SELECT", 2);
        f15447c = r22;
        a[] aVarArr = {r02, r12, r22};
        f15448d = aVarArr;
        zq.f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15448d.clone();
    }
}
