package xk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f40353a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f40354b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e0[] f40355c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xk.e0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xk.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xk.e0] */
    static {
        ?? r02 = new Enum("GET", 0);
        f40353a = r02;
        ?? r12 = new Enum("POST", 1);
        f40354b = r12;
        f40355c = new e0[]{r02, r12, new Enum("DELETE", 2)};
    }

    public static e0 valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (e0) Enum.valueOf(e0.class, value);
    }

    public static e0[] values() {
        return (e0[]) Arrays.copyOf(f40355c, 3);
    }
}
