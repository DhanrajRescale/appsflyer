package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final m f11948a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final m f11949b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.m, java.lang.Object] */
    static {
        m mVar;
        try {
            mVar = (m) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            mVar = null;
        }
        f11949b = mVar;
    }
}
