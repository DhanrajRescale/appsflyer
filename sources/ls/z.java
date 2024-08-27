package ls;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final x f25367a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f25368b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z[] f25369c;

    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    static {
        z zVar = new z() { // from class: ls.w
            @Override // java.lang.Enum
            public final String toString() {
                return "*unknown_type*";
            }
        };
        x xVar = new x();
        f25367a = xVar;
        y yVar = new y();
        f25368b = yVar;
        f25369c = new z[]{zVar, xVar, yVar};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f25369c.clone();
    }
}
