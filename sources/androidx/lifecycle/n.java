package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f1947a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f1948b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f1949c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f1950d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f1951e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n[] f1952f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f1947a = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f1948b = r12;
        ?? r22 = new Enum("CREATED", 2);
        f1949c = r22;
        ?? r32 = new Enum("STARTED", 3);
        f1950d = r32;
        ?? r42 = new Enum("RESUMED", 4);
        f1951e = r42;
        f1952f = new n[]{r02, r12, r22, r32, r42};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f1952f.clone();
    }

    public final boolean a(n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (compareTo(state) >= 0) {
            return true;
        }
        return false;
    }
}
