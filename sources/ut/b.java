package ut;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37386a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f37387b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ut.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ut.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ut.b] */
    static {
        ?? r02 = new Enum("WARNING", 0);
        f37386a = r02;
        b[] bVarArr = {r02, new Enum("ERROR", 1), new Enum("HIDDEN", 2)};
        f37387b = bVarArr;
        zq.f.E(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f37387b.clone();
    }
}
