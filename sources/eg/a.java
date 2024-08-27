package eg;

import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15420a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f15421b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f15422c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f15423d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eg.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eg.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, eg.a] */
    static {
        ?? r02 = new Enum("NO_DATA", 0);
        f15420a = r02;
        ?? r12 = new Enum("ERROR", 1);
        f15421b = r12;
        ?? r22 = new Enum("NO_INTERNET", 2);
        f15422c = r22;
        a[] aVarArr = {r02, r12, r22};
        f15423d = aVarArr;
        f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15423d.clone();
    }
}
