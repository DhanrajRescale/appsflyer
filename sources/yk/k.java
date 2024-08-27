package yk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f41698a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f41699b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f41700c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yk.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yk.k] */
    static {
        ?? r02 = new Enum("AUTO", 0);
        f41698a = r02;
        ?? r12 = new Enum("EXPLICIT_ONLY", 1);
        f41699b = r12;
        f41700c = new k[]{r02, r12};
    }

    public static k valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (k) Enum.valueOf(k.class, value);
    }

    public static k[] values() {
        return (k[]) Arrays.copyOf(f41700c, 2);
    }
}
