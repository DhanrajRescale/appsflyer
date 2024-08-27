package zb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f42250a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f42251b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f42252c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f42253d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zb.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zb.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zb.d] */
    static {
        ?? r02 = new Enum("SOCIALS", 0);
        f42250a = r02;
        ?? r12 = new Enum("HOME", 1);
        f42251b = r12;
        ?? r22 = new Enum("RIA_PROFILE", 2);
        f42252c = r22;
        d[] dVarArr = {r02, r12, r22};
        f42253d = dVarArr;
        zq.f.E(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f42253d.clone();
    }
}
