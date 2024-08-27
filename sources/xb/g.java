package xb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f40166a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f40167b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f40168c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f40169d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xb.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xb.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xb.g] */
    static {
        ?? r02 = new Enum("IMAGE", 0);
        f40166a = r02;
        ?? r12 = new Enum("DOCUMENT", 1);
        f40167b = r12;
        ?? r22 = new Enum("VIDEO", 2);
        f40168c = r22;
        g[] gVarArr = {r02, r12, r22};
        f40169d = gVarArr;
        zq.f.E(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f40169d.clone();
    }
}
