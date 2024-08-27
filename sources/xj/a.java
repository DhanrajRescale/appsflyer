package xj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f40286a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40287b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f40288c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f40289d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f40290e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f40291f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xj.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xj.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xj.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, xj.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, xj.a] */
    static {
        ?? r02 = new Enum("LOCAL", 0);
        f40286a = r02;
        ?? r12 = new Enum("REMOTE", 1);
        f40287b = r12;
        ?? r22 = new Enum("DATA_DISK_CACHE", 2);
        f40288c = r22;
        ?? r32 = new Enum("RESOURCE_DISK_CACHE", 3);
        f40289d = r32;
        ?? r42 = new Enum("MEMORY_CACHE", 4);
        f40290e = r42;
        f40291f = new a[]{r02, r12, r22, r32, r42};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f40291f.clone();
    }
}
