package ng;

import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d[] f28688a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ng.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ng.d] */
    static {
        d[] dVarArr = {new Enum("BOUGHT", 0), new Enum("SOLD", 1)};
        f28688a = dVarArr;
        f.E(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f28688a.clone();
    }
}
