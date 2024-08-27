package gn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f17525a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f17526b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f17527c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f17528d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gn.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gn.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, gn.c] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f17525a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f17526b = r12;
        ?? r22 = new Enum("HIGHEST", 2);
        f17527c = r22;
        f17528d = new c[]{r02, r12, r22};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f17528d.clone();
    }
}
