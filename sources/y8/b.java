package y8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f41296c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f41297d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f41298e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41299a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41300b;

    static {
        b bVar = new b(true, true, "ENABLED", 0);
        f41296c = bVar;
        b bVar2 = new b(true, false, "READ_ONLY", 1);
        b bVar3 = new b(false, true, "WRITE_ONLY", 2);
        b bVar4 = new b(false, false, "DISABLED", 3);
        f41297d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f41298e = bVarArr;
        zq.f.E(bVarArr);
    }

    public b(boolean z10, boolean z11, String str, int i10) {
        this.f41299a = z10;
        this.f41300b = z11;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f41298e.clone();
    }
}
