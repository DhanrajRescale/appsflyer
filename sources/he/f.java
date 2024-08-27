package he;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f18308a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f18309b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f18310c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f18311d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, he.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, he.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, he.f] */
    static {
        ?? r02 = new Enum("EXIT_OPTION_MENU", 0);
        f18308a = r02;
        ?? r12 = new Enum("MUTE_CHAT", 1);
        f18309b = r12;
        ?? r22 = new Enum("PIN_CHAT", 2);
        f18310c = r22;
        f[] fVarArr = {r02, r12, r22};
        f18311d = fVarArr;
        zq.f.E(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f18311d.clone();
    }
}
