package g3;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f16501a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j[] f16502b;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g3.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g3.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, g3.j, java.lang.Object] */
    static {
        ?? r02 = new Enum("NONE", 0);
        ?? r12 = new Enum("CHAIN", 1);
        ?? r32 = new Enum("ALIGNED", 2);
        f16502b = new j[]{r02, r12, r32};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        f16501a = hashMap2;
        hashMap.put("none", r02);
        hashMap.put("chain", r12);
        hashMap.put("aligned", r32);
        da.e.v(0, hashMap2, "none", 3, "chain");
        hashMap2.put("aligned", 2);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f16502b.clone();
    }
}
