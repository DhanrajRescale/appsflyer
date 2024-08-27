package in;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f20449a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w[] f20450b;

    /* JADX INFO: Fake field, exist only in values array */
    w EF15;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, java.lang.Object, in.w] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Enum, java.lang.Object, in.w] */
    static {
        ?? r15 = new Enum("MOBILE", 0);
        ?? r13 = new Enum("WIFI", 1);
        ?? r11 = new Enum("MOBILE_MMS", 2);
        ?? r92 = new Enum("MOBILE_SUPL", 3);
        ?? r72 = new Enum("MOBILE_DUN", 4);
        ?? r52 = new Enum("MOBILE_HIPRI", 5);
        ?? r32 = new Enum("WIMAX", 6);
        ?? r12 = new Enum("BLUETOOTH", 7);
        ?? r02 = new Enum("DUMMY", 8);
        ?? r22 = new Enum("ETHERNET", 9);
        ?? r42 = new Enum("MOBILE_FOTA", 10);
        ?? r62 = new Enum("MOBILE_IMS", 11);
        ?? r82 = new Enum("MOBILE_CBS", 12);
        ?? r10 = new Enum("WIFI_P2P", 13);
        ?? r122 = new Enum("MOBILE_IA", 14);
        ?? r14 = new Enum("MOBILE_EMERGENCY", 15);
        ?? r102 = new Enum("PROXY", 16);
        ?? r123 = new Enum("VPN", 17);
        ?? r142 = new Enum("NONE", 18);
        f20450b = new w[]{r15, r13, r11, r92, r72, r52, r32, r12, r02, r22, r42, r62, r82, r10, r122, r14, r102, r123, r142};
        SparseArray sparseArray = new SparseArray();
        f20449a = sparseArray;
        sparseArray.put(0, r15);
        sparseArray.put(1, r13);
        sparseArray.put(2, r11);
        sparseArray.put(3, r92);
        sparseArray.put(4, r72);
        sparseArray.put(5, r52);
        sparseArray.put(6, r32);
        sparseArray.put(7, r12);
        sparseArray.put(8, r02);
        sparseArray.put(9, r22);
        sparseArray.put(10, r42);
        sparseArray.put(11, r62);
        sparseArray.put(12, r82);
        sparseArray.put(13, r10);
        sparseArray.put(14, r122);
        sparseArray.put(15, r14);
        sparseArray.put(16, r102);
        sparseArray.put(17, r123);
        sparseArray.put(-1, r142);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f20450b.clone();
    }
}
