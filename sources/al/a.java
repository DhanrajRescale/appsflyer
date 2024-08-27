package al;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f616a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f617b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f618c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f619d;

    /* JADX WARN: Type inference failed for: r0v0, types: [al.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [al.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [al.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("MOBILE_APP_INSTALL", 0);
        f616a = r02;
        ?? r12 = new Enum("CUSTOM", 1);
        f617b = r12;
        ?? r22 = new Enum("OTHER", 2);
        f618c = r22;
        f619d = new a[]{r02, r12, r22};
    }

    public static a valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (a) Enum.valueOf(a.class, value);
    }

    public static a[] values() {
        return (a[]) Arrays.copyOf(f619d, 3);
    }
}
