package qj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ k[] f32029a;

    /* JADX WARN: Type inference failed for: r0v0, types: [qj.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qj.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qj.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qj.k, java.lang.Enum] */
    static {
        k[] kVarArr = {new Enum("none", 0), new Enum("left", 1), new Enum("center", 2), new Enum("right", 3)};
        f32029a = kVarArr;
        zq.f.E(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f32029a.clone();
    }
}
