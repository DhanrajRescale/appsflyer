package wl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39146a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f39147b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f39148c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wl.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wl.a] */
    static {
        ?? r02 = new Enum("S256", 0);
        f39146a = r02;
        ?? r12 = new Enum("PLAIN", 1);
        f39147b = r12;
        f39148c = new a[]{r02, r12};
    }

    public static a valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (a) Enum.valueOf(a.class, value);
    }

    public static a[] values() {
        return (a[]) Arrays.copyOf(f39148c, 2);
    }
}
