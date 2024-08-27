package yk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f41719a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f41720b;

    /* renamed from: c, reason: collision with root package name */
    public static final q f41721c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f41722d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yk.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yk.q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, yk.q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, yk.q] */
    static {
        ?? r02 = new Enum("SUCCESS", 0);
        f41719a = r02;
        ?? r12 = new Enum("SERVER_ERROR", 1);
        f41720b = r12;
        ?? r22 = new Enum("NO_CONNECTIVITY", 2);
        f41721c = r22;
        f41722d = new q[]{r02, r12, r22, new Enum("UNKNOWN_ERROR", 3)};
    }

    public static q valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (q) Enum.valueOf(q.class, value);
    }

    public static q[] values() {
        return (q[]) Arrays.copyOf(f41722d, 4);
    }
}
