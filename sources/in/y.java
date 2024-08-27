package in;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f20451a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y[] f20452b;

    /* JADX WARN: Type inference failed for: r10v0, types: [in.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [in.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [in.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [in.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [in.y, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [in.y, java.lang.Enum, java.lang.Object] */
    static {
        ?? r62 = new Enum("DEFAULT", 0);
        f20451a = r62;
        ?? r82 = new Enum("UNMETERED_ONLY", 1);
        ?? r10 = new Enum("UNMETERED_OR_DAILY", 2);
        ?? r12 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        ?? r14 = new Enum("NEVER", 4);
        ?? r52 = new Enum("UNRECOGNIZED", 5);
        f20452b = new y[]{r62, r82, r10, r12, r14, r52};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r62);
        sparseArray.put(1, r82);
        sparseArray.put(2, r10);
        sparseArray.put(3, r12);
        sparseArray.put(4, r14);
        sparseArray.put(-1, r52);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f20452b.clone();
    }
}
