package pe;

import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f31008a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pe.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pe.a] */
    static {
        a[] aVarArr = {new Enum("Like", 0), new Enum("NoReaction", 1)};
        f31008a = aVarArr;
        f.E(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f31008a.clone();
    }
}
