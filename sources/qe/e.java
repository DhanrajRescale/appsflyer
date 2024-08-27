package qe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f31904b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f31905c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f31906d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f31907e;

    /* renamed from: a, reason: collision with root package name */
    public final String f31908a;

    static {
        e eVar = new e("All", 0, "all");
        f31904b = eVar;
        e eVar2 = new e("Users", 1, "users");
        f31905c = eVar2;
        e eVar3 = new e("Groups", 2, "groups");
        f31906d = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f31907e = eVarArr;
        zq.f.E(eVarArr);
    }

    public e(String str, int i10, String str2) {
        this.f31908a = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f31907e.clone();
    }
}
