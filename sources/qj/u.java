package qj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f32064a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f32065b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f32066c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qj.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qj.u] */
    static {
        ?? r02 = new Enum("tab1", 0);
        f32064a = r02;
        ?? r12 = new Enum("tab2", 1);
        f32065b = r12;
        u[] uVarArr = {r02, r12};
        f32066c = uVarArr;
        zq.f.E(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f32066c.clone();
    }
}
