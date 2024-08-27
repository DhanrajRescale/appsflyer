package p8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f30751a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k[] f30752b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p8.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p8.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p8.k] */
    static {
        ?? r02 = new Enum("IGNORE", 0);
        ?? r12 = new Enum("RESPECT_PERFORMANCE", 1);
        f30751a = r12;
        k[] kVarArr = {r02, r12, new Enum("RESPECT_ALL", 2)};
        f30752b = kVarArr;
        zq.f.E(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f30752b.clone();
    }
}
