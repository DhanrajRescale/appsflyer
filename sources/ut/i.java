package ut;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f37392a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f37393b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ut.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ut.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ut.i] */
    static {
        ?? r02 = new Enum("SYNCHRONIZED", 0);
        ?? r12 = new Enum("PUBLICATION", 1);
        ?? r22 = new Enum("NONE", 2);
        f37392a = r22;
        i[] iVarArr = {r02, r12, r22};
        f37393b = iVarArr;
        zq.f.E(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f37393b.clone();
    }
}
