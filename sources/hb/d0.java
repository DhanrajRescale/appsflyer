package hb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f18162a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f18163b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d0[] f18164c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hb.d0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hb.d0] */
    static {
        ?? r02 = new Enum("NEGATIVE", 0);
        f18162a = r02;
        ?? r12 = new Enum("POSITIVE", 1);
        f18163b = r12;
        d0[] d0VarArr = {r02, r12};
        f18164c = d0VarArr;
        zq.f.E(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f18164c.clone();
    }
}
