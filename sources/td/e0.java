package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f35864a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f35865b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f35866c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e0[] f35867d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, td.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, td.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, td.e0] */
    static {
        ?? r02 = new Enum("Admin", 0);
        f35864a = r02;
        ?? r12 = new Enum("Moderator", 1);
        f35865b = r12;
        ?? r22 = new Enum("Seeder", 2);
        f35866c = r22;
        e0[] e0VarArr = {r02, r12, r22};
        f35867d = e0VarArr;
        zq.f.E(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f35867d.clone();
    }
}
