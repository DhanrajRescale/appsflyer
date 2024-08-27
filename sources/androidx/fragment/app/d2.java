package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final d2 f1670a;

    /* renamed from: b, reason: collision with root package name */
    public static final d2 f1671b;

    /* renamed from: c, reason: collision with root package name */
    public static final d2 f1672c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d2[] f1673d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.fragment.app.d2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.fragment.app.d2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.fragment.app.d2] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f1670a = r02;
        ?? r12 = new Enum("ADDING", 1);
        f1671b = r12;
        ?? r22 = new Enum("REMOVING", 2);
        f1672c = r22;
        f1673d = new d2[]{r02, r12, r22};
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) f1673d.clone();
    }
}
