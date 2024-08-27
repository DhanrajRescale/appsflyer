package iq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20481a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f20482b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, iq.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, iq.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, iq.d] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f20481a = r02;
        f20482b = new d[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f20482b.clone();
    }
}
