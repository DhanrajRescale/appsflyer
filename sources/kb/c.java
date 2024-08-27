package kb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23031a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f23032b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f23033c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kb.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kb.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kb.c] */
    static {
        ?? r02 = new Enum("INITIAL", 0);
        f23031a = r02;
        ?? r12 = new Enum("SHOW_MESSAGE", 1);
        ?? r22 = new Enum("SHOW_ERROR_MESSAGE", 2);
        f23032b = r22;
        c[] cVarArr = {r02, r12, r22};
        f23033c = cVarArr;
        zq.f.E(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f23033c.clone();
    }
}
