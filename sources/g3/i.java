package g3;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f16496a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f16497b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f16498c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f16499d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f16500e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, g3.i, java.lang.Object] */
    static {
        ?? r02 = new Enum("SPREAD", 0);
        f16496a = r02;
        ?? r12 = new Enum("SPREAD_INSIDE", 1);
        f16497b = r12;
        ?? r32 = new Enum("PACKED", 2);
        f16498c = r32;
        f16500e = new i[]{r02, r12, r32};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        f16499d = hashMap2;
        hashMap.put("packed", r32);
        hashMap.put("spread_inside", r12);
        hashMap.put("spread", r02);
        da.e.v(2, hashMap2, "packed", 1, "spread_inside");
        hashMap2.put("spread", 0);
    }

    public static int a(String str) {
        HashMap hashMap = f16499d;
        if (hashMap.containsKey(str)) {
            return ((Integer) hashMap.get(str)).intValue();
        }
        return -1;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f16500e.clone();
    }
}
