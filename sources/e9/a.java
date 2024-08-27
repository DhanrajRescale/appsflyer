package e9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15098a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f15099b;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e9.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e9.a] */
    static {
        ?? r02 = new Enum("MATCH_PARENT", 0);
        ?? r12 = new Enum("WRAP_CONTENT", 1);
        f15098a = r12;
        f15099b = new a[]{r02, r12};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15099b.clone();
    }
}
