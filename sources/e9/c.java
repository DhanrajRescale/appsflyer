package e9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f15100a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f15101b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f15102c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f15103d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e9.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e9.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e9.c] */
    static {
        ?? r02 = new Enum("POSITIVE", 0);
        f15100a = r02;
        ?? r12 = new Enum("NEGATIVE", 1);
        f15101b = r12;
        ?? r22 = new Enum("NEUTRAL", 2);
        f15102c = r22;
        f15103d = new c[]{r02, r12, r22};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f15103d.clone();
    }
}
