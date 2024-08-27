package jv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final m f21704a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f21705b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f21706c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m[] f21707d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jv.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jv.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jv.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, jv.m] */
    static {
        ?? r02 = new Enum("SENSITIVE", 0);
        f21704a = r02;
        ?? r12 = new Enum("INSENSITIVE", 1);
        f21705b = r12;
        ?? r22 = new Enum("STRICT", 2);
        ?? r32 = new Enum("LENIENT", 3);
        f21706c = r32;
        f21707d = new m[]{r02, r12, r22, r32};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f21707d.clone();
    }

    @Override // jv.e
    public final boolean a(e5.o oVar, StringBuilder sb2) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return "ParseStrict(false)";
                    }
                    throw new IllegalStateException("Unreachable");
                }
                return "ParseStrict(true)";
            }
            return "ParseCaseSensitive(false)";
        }
        return "ParseCaseSensitive(true)";
    }
}
