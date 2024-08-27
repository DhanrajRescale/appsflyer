package il;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f20106a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f20107b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f20108c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f20109d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, il.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, il.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, il.f] */
    static {
        ?? r02 = new Enum("OPERATION_SUCCESS", 0);
        f20106a = r02;
        ?? r12 = new Enum("SERVICE_NOT_AVAILABLE", 1);
        f20107b = r12;
        ?? r22 = new Enum("SERVICE_ERROR", 2);
        f20108c = r22;
        f20109d = new f[]{r02, r12, r22};
    }

    public static f valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (f) Enum.valueOf(f.class, value);
    }

    public static f[] values() {
        return (f[]) Arrays.copyOf(f20109d, 3);
    }
}
