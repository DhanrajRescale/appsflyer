package wb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f38927a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f38928b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f38929c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f38930d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f38931e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f38932f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wb.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wb.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wb.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, wb.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, wb.d] */
    static {
        ?? r02 = new Enum("VIDEO", 0);
        f38927a = r02;
        ?? r12 = new Enum("IMAGE", 1);
        f38928b = r12;
        ?? r22 = new Enum("PDF", 2);
        f38929c = r22;
        ?? r32 = new Enum("YOUTUBE", 3);
        f38930d = r32;
        ?? r42 = new Enum("YOUTUBE_SHORTS", 4);
        f38931e = r42;
        d[] dVarArr = {r02, r12, r22, r32, r42};
        f38932f = dVarArr;
        zq.f.E(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f38932f.clone();
    }
}
