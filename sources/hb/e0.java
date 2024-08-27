package hb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f18166a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f18167b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e0[] f18168c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hb.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hb.e0] */
    static {
        ?? r02 = new Enum("LIVE", 0);
        f18166a = r02;
        ?? r12 = new Enum("EXPIRED", 1);
        f18167b = r12;
        e0[] e0VarArr = {r02, r12};
        f18168c = e0VarArr;
        zq.f.E(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f18168c.clone();
    }
}
