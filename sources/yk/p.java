package yk;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f41714a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f41715b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f41716c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f41717d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p[] f41718e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yk.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yk.p] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, yk.p] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, yk.p] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, yk.p] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, yk.p] */
    static {
        ?? r02 = new Enum("EXPLICIT", 0);
        f41714a = r02;
        ?? r12 = new Enum("TIMER", 1);
        f41715b = r12;
        ?? r22 = new Enum("SESSION_CHANGE", 2);
        ?? r32 = new Enum("PERSISTED_EVENTS", 3);
        ?? r42 = new Enum("EVENT_THRESHOLD", 4);
        f41716c = r42;
        ?? r52 = new Enum("EAGER_FLUSHING_EVENT", 5);
        f41717d = r52;
        f41718e = new p[]{r02, r12, r22, r32, r42, r52};
    }

    public static p valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (p) Enum.valueOf(p.class, value);
    }

    public static p[] values() {
        return (p[]) Arrays.copyOf(f41718e, 6);
    }
}
