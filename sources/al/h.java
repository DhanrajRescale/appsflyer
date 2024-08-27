package al;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f647a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f648b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f649c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h[] f650d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, al.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, al.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, al.h] */
    static {
        ?? r02 = new Enum("ARRAY", 0);
        f647a = r02;
        ?? r12 = new Enum("BOOL", 1);
        f648b = r12;
        ?? r22 = new Enum("INT", 2);
        f649c = r22;
        f650d = new h[]{r02, r12, r22};
    }

    public static h valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (h) Enum.valueOf(h.class, value);
    }

    public static h[] values() {
        return (h[]) Arrays.copyOf(f650d, 3);
    }
}
