package ma;

import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f27693a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ma.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ma.a] */
    static {
        a[] aVarArr = {new Enum("Stocks", 0), new Enum("FNO", 1)};
        f27693a = aVarArr;
        f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27693a.clone();
    }
}
