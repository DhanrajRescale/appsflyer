package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class p1 extends q1 {
    @Override // com.google.protobuf.q1
    public final boolean c(long j10, Object obj) {
        return this.f11973a.getBoolean(obj, j10);
    }

    @Override // com.google.protobuf.q1
    public final byte d(long j10, Object obj) {
        return this.f11973a.getByte(obj, j10);
    }

    @Override // com.google.protobuf.q1
    public final double e(long j10, Object obj) {
        return this.f11973a.getDouble(obj, j10);
    }

    @Override // com.google.protobuf.q1
    public final float f(long j10, Object obj) {
        return this.f11973a.getFloat(obj, j10);
    }

    @Override // com.google.protobuf.q1
    public final void k(Object obj, long j10, boolean z10) {
        this.f11973a.putBoolean(obj, j10, z10);
    }

    @Override // com.google.protobuf.q1
    public final void l(Object obj, long j10, byte b10) {
        this.f11973a.putByte(obj, j10, b10);
    }

    @Override // com.google.protobuf.q1
    public final void m(Object obj, long j10, double d10) {
        this.f11973a.putDouble(obj, j10, d10);
    }

    @Override // com.google.protobuf.q1
    public final void n(Object obj, long j10, float f10) {
        this.f11973a.putFloat(obj, j10, f10);
    }

    @Override // com.google.protobuf.q1
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f11973a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            r1.a(th2);
            return false;
        }
    }

    @Override // com.google.protobuf.q1
    public final boolean s() {
        Unsafe unsafe = this.f11973a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (r1.e() != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        r1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                r1.a(th3);
            }
        }
        return false;
    }
}
