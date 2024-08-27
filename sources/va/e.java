package va;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f37822b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f37823c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f37824d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f37825e;

    /* renamed from: a, reason: collision with root package name */
    public final String f37826a;

    static {
        e eVar = new e("All", 0, "ALL");
        f37822b = eVar;
        e eVar2 = new e("Stocks", 1, "EQUITY");
        f37823c = eVar2;
        e eVar3 = new e("Options", 2, "OPTIONS");
        f37824d = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f37825e = eVarArr;
        zq.f.E(eVarArr);
    }

    public e(String str, int i10, String str2) {
        this.f37826a = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f37825e.clone();
    }
}
