package nl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f28980a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f28981b;

    /* renamed from: c, reason: collision with root package name */
    public static final z f28982c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f28983d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z[] f28984e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nl.z] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nl.z] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nl.z] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, nl.z] */
    static {
        ?? r02 = new Enum("NOT_LOADED", 0);
        f28980a = r02;
        ?? r12 = new Enum("LOADING", 1);
        f28981b = r12;
        ?? r22 = new Enum("SUCCESS", 2);
        f28982c = r22;
        ?? r32 = new Enum("ERROR", 3);
        f28983d = r32;
        f28984e = new z[]{r02, r12, r22, r32};
    }

    public static z valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (z) Enum.valueOf(z.class, value);
    }

    public static z[] values() {
        return (z[]) Arrays.copyOf(f28984e, 4);
    }
}
