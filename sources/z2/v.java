package z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f41977a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ v[] f41978b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z2.v] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z2.v] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z2.v] */
    static {
        ?? r02 = new Enum("Inherit", 0);
        f41977a = r02;
        f41978b = new v[]{r02, new Enum("SecureOn", 1), new Enum("SecureOff", 2)};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f41978b.clone();
    }
}
