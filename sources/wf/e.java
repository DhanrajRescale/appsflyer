package wf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f39045a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f39046b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f39047c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f39048d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f39049e;

    /* JADX WARN: Type inference failed for: r0v0, types: [wf.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [wf.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [wf.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [wf.e, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEPOSIT", 0);
        f39045a = r02;
        ?? r12 = new Enum("CASH", 1);
        f39046b = r12;
        ?? r22 = new Enum("BONUS", 2);
        f39047c = r22;
        ?? r32 = new Enum("MY_EARNING", 3);
        f39048d = r32;
        e[] eVarArr = {r02, r12, r22, r32};
        f39049e = eVarArr;
        zq.f.E(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f39049e.clone();
    }
}
