package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f10811a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f10812b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f10813c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f10814d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f10815e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.bumptech.glide.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.bumptech.glide.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.bumptech.glide.e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.bumptech.glide.e] */
    static {
        ?? r02 = new Enum("IMMEDIATE", 0);
        f10811a = r02;
        ?? r12 = new Enum("HIGH", 1);
        f10812b = r12;
        ?? r22 = new Enum("NORMAL", 2);
        f10813c = r22;
        ?? r32 = new Enum("LOW", 3);
        f10814d = r32;
        f10815e = new e[]{r02, r12, r22, r32};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f10815e.clone();
    }
}
