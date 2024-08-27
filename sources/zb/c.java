package zb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f42247a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f42248b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f42249c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zb.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zb.c] */
    static {
        ?? r02 = new Enum("WALKING_MAN", 0);
        f42247a = r02;
        ?? r12 = new Enum("CIRCLE", 1);
        f42248b = r12;
        c[] cVarArr = {r02, r12};
        f42249c = cVarArr;
        zq.f.E(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f42249c.clone();
    }
}
