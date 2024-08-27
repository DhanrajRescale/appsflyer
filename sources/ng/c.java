package ng;

import zq.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f28687a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ng.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ng.c] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ng.c] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ng.c] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ng.c] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ng.c] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, ng.c] */
    static {
        c[] cVarArr = {new Enum("TODAY", 0), new Enum("YESTERDAY", 1), new Enum("LAST_WEEK", 2), new Enum("LAST_MONTH", 3), new Enum("MONTHS_3", 4), new Enum("MONTHS_6", 5), new Enum("YEAR_1", 6)};
        f28687a = cVarArr;
        f.E(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f28687a.clone();
    }
}
