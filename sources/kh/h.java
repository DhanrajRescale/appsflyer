package kh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f23140a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f23141b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f23142c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kh.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kh.h] */
    static {
        ?? r02 = new Enum("WINNER", 0);
        f23140a = r02;
        ?? r12 = new Enum("USER", 1);
        f23141b = r12;
        h[] hVarArr = {r02, r12};
        f23142c = hVarArr;
        zq.f.E(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f23142c.clone();
    }
}
