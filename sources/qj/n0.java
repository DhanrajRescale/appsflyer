package qj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ n0[] f32046a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qj.n0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qj.n0] */
    static {
        n0[] n0VarArr = {new Enum("Short", 0), new Enum("Extended", 1)};
        f32046a = n0VarArr;
        zq.f.E(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f32046a.clone();
    }
}
