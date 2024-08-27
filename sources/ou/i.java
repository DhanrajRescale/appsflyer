package ou;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i[] f30426a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ou.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ou.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ou.i] */
    static {
        i[] iVarArr = {new Enum("INVARIANT", 0), new Enum("IN", 1), new Enum("OUT", 2)};
        f30426a = iVarArr;
        zq.f.E(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f30426a.clone();
    }
}
