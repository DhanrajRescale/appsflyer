package xk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f40370a;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f40371b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f40372c;

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f40373d;

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f40374e;

    /* renamed from: f, reason: collision with root package name */
    public static final g0 f40375f;

    /* renamed from: g, reason: collision with root package name */
    public static final g0 f40376g;

    /* renamed from: h, reason: collision with root package name */
    public static final g0 f40377h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ g0[] f40378i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xk.g0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xk.g0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xk.g0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, xk.g0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, xk.g0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, xk.g0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, xk.g0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, xk.g0] */
    static {
        ?? r02 = new Enum("REQUESTS", 0);
        f40370a = r02;
        ?? r12 = new Enum("INCLUDE_ACCESS_TOKENS", 1);
        f40371b = r12;
        ?? r22 = new Enum("INCLUDE_RAW_RESPONSES", 2);
        f40372c = r22;
        ?? r32 = new Enum("CACHE", 3);
        f40373d = r32;
        ?? r42 = new Enum("APP_EVENTS", 4);
        f40374e = r42;
        ?? r52 = new Enum("DEVELOPER_ERRORS", 5);
        f40375f = r52;
        ?? r62 = new Enum("GRAPH_API_DEBUG_WARNING", 6);
        f40376g = r62;
        ?? r72 = new Enum("GRAPH_API_DEBUG_INFO", 7);
        f40377h = r72;
        f40378i = new g0[]{r02, r12, r22, r32, r42, r52, r62, r72};
    }

    public static g0 valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (g0) Enum.valueOf(g0.class, value);
    }

    public static g0[] values() {
        return (g0[]) Arrays.copyOf(f40378i, 8);
    }
}
