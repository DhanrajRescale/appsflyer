package pl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31150a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f31151b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f31152c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f31153d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f31154e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f31155f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f31156g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pl.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pl.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pl.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pl.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, pl.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, pl.a] */
    static {
        ?? r02 = new Enum("Unknown", 0);
        f31150a = r02;
        ?? r12 = new Enum("Analysis", 1);
        f31151b = r12;
        ?? r22 = new Enum("AnrReport", 2);
        f31152c = r22;
        ?? r32 = new Enum("CrashReport", 3);
        f31153d = r32;
        ?? r42 = new Enum("CrashShield", 4);
        f31154e = r42;
        ?? r52 = new Enum("ThreadCheck", 5);
        f31155f = r52;
        f31156g = new a[]{r02, r12, r22, r32, r42, r52};
    }

    public static a valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (a) Enum.valueOf(a.class, value);
    }

    public static a[] values() {
        return (a[]) Arrays.copyOf(f31156g, 6);
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return "Unknown";
                        }
                        return "ThreadCheck";
                    }
                    return "CrashShield";
                }
                return "CrashReport";
            }
            return "AnrReport";
        }
        return "Analysis";
    }
}
