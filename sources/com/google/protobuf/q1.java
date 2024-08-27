package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f11973a;

    public q1(Unsafe unsafe) {
        this.f11973a = unsafe;
    }

    public final int a(Class cls) {
        return this.f11973a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f11973a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j10, Object obj);

    public abstract byte d(long j10, Object obj);

    public abstract double e(long j10, Object obj);

    public abstract float f(long j10, Object obj);

    public final int g(long j10, Object obj) {
        return this.f11973a.getInt(obj, j10);
    }

    public final long h(long j10, Object obj) {
        return this.f11973a.getLong(obj, j10);
    }

    public final Object i(long j10, Object obj) {
        return this.f11973a.getObject(obj, j10);
    }

    public final long j(Field field) {
        return this.f11973a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j10, boolean z10);

    public abstract void l(Object obj, long j10, byte b10);

    public abstract void m(Object obj, long j10, double d10);

    public abstract void n(Object obj, long j10, float f10);

    public final void o(Object obj, int i10, long j10) {
        this.f11973a.putInt(obj, j10, i10);
    }

    public final void p(Object obj, long j10, long j11) {
        this.f11973a.putLong(obj, j10, j11);
    }

    public final void q(Object obj, long j10, Object obj2) {
        this.f11973a.putObject(obj, j10, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f11973a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            r1.a(th2);
            return false;
        }
    }

    public abstract boolean s();
}
