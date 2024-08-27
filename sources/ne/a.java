package ne;

import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28624a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f28625b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f28626c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ne.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ne.a] */
    static {
        ?? r02 = new Enum("ONEONONE", 0);
        f28624a = r02;
        ?? r12 = new Enum("PRIVATE", 1);
        f28625b = r12;
        a[] aVarArr = {r02, r12};
        f28626c = aVarArr;
        f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28626c.clone();
    }
}
