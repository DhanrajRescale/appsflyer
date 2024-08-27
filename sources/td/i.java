package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f35887a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f35888b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f35889c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, td.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, td.i] */
    static {
        ?? r02 = new Enum("ADD_ADMIN", 0);
        f35887a = r02;
        ?? r12 = new Enum("EXIT_ADMIN", 1);
        f35888b = r12;
        i[] iVarArr = {r02, r12};
        f35889c = iVarArr;
        zq.f.E(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f35889c.clone();
    }
}
