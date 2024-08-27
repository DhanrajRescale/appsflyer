package ng;

import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f28686a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ng.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ng.b] */
    static {
        b[] bVarArr = {new Enum("DATE", 0), new Enum("AMOUNT", 1)};
        f28686a = bVarArr;
        f.E(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f28686a.clone();
    }
}
