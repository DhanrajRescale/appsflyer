package ld;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f24565a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f24566b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f24567c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ld.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ld.k] */
    static {
        ?? r02 = new Enum("VIDEO", 0);
        f24565a = r02;
        ?? r12 = new Enum("IMAGE", 1);
        f24566b = r12;
        k[] kVarArr = {r02, r12};
        f24567c = kVarArr;
        zq.f.E(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f24567c.clone();
    }
}
