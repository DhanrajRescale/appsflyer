package xk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f40452a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f40453b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f40454c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p[] f40455d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xk.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xk.p] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xk.p] */
    static {
        ?? r02 = new Enum("LOGIN_RECOVERABLE", 0);
        f40452a = r02;
        ?? r12 = new Enum("OTHER", 1);
        f40453b = r12;
        ?? r22 = new Enum("TRANSIENT", 2);
        f40454c = r22;
        f40455d = new p[]{r02, r12, r22};
    }

    public static p valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (p) Enum.valueOf(p.class, value);
    }

    public static p[] values() {
        return (p[]) Arrays.copyOf(f40455d, 3);
    }
}
