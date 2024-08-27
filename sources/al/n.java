package al;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f697a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f698b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f699c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f700d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, al.n] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, al.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, al.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, al.n] */
    static {
        ?? r02 = new Enum("USER_DATA", 0);
        f697a = r02;
        ?? r12 = new Enum("APP_DATA", 1);
        f698b = r12;
        ?? r22 = new Enum("CUSTOM_DATA", 2);
        f699c = r22;
        f700d = new n[]{r02, r12, r22, new Enum("CUSTOM_EVENTS", 3)};
    }

    public static n valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (n) Enum.valueOf(n.class, value);
    }

    public static n[] values() {
        return (n[]) Arrays.copyOf(f700d, 4);
    }
}
