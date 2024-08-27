package tu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f36595a;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f36596b;

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f36597c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z0[] f36598d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tu.z0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tu.z0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tu.z0] */
    static {
        ?? r02 = new Enum("START", 0);
        f36595a = r02;
        ?? r12 = new Enum("STOP", 1);
        f36596b = r12;
        ?? r22 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f36597c = r22;
        z0[] z0VarArr = {r02, r12, r22};
        f36598d = z0VarArr;
        zq.f.E(z0VarArr);
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f36598d.clone();
    }
}
