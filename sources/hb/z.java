package hb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f18247a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f18248b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z[] f18249c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hb.z] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hb.z] */
    static {
        ?? r02 = new Enum("LEARN", 0);
        f18247a = r02;
        ?? r12 = new Enum("TRADE", 1);
        f18248b = r12;
        z[] zVarArr = {r02, r12};
        f18249c = zVarArr;
        zq.f.E(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f18249c.clone();
    }
}
