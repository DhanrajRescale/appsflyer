package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public static final x4 f27081a;

    /* renamed from: b, reason: collision with root package name */
    public static final x4 f27082b;

    /* renamed from: c, reason: collision with root package name */
    public static final x4 f27083c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x4[] f27084d;

    /* JADX WARN: Type inference failed for: r0v0, types: [m0.x4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m0.x4, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [m0.x4, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Hidden", 0);
        f27081a = r02;
        ?? r12 = new Enum("Expanded", 1);
        f27082b = r12;
        ?? r22 = new Enum("HalfExpanded", 2);
        f27083c = r22;
        f27084d = new x4[]{r02, r12, r22};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) f27084d.clone();
    }
}
