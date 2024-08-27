package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f11979a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f11980b;

    /* renamed from: c, reason: collision with root package name */
    public static final q1 f11981c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11982d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f11983e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f11984f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f11985g;

    static {
        boolean s7;
        boolean r10;
        Unsafe m10 = m();
        f11979a = m10;
        f11980b = d.f11898a;
        boolean f10 = f(Long.TYPE);
        boolean f11 = f(Integer.TYPE);
        boolean z10 = true;
        boolean z11 = true;
        int i10 = 0;
        q1 q1Var = null;
        if (m10 != null) {
            if (d.a()) {
                if (f10) {
                    q1Var = new o1(m10, z11 ? 1 : 0);
                } else if (f11) {
                    q1Var = new o1(m10, i10);
                }
            } else {
                q1Var = new q1(m10);
            }
        }
        f11981c = q1Var;
        if (q1Var == null) {
            s7 = false;
        } else {
            s7 = q1Var.s();
        }
        f11982d = s7;
        if (q1Var == null) {
            r10 = false;
        } else {
            r10 = q1Var.r();
        }
        f11983e = r10;
        f11984f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e10 = e();
        if (e10 != null && q1Var != null) {
            q1Var.j(e10);
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z10 = false;
        }
        f11985g = z10;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f11979a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class cls) {
        if (f11983e) {
            return f11981c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f11983e) {
            f11981c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f11980b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j10) {
        return f11981c.d(f11984f + j10, bArr);
    }

    public static byte h(long j10, Object obj) {
        return (byte) ((f11981c.g((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte i(long j10, Object obj) {
        return (byte) ((f11981c.g((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static int j(long j10, Object obj) {
        return f11981c.g(j10, obj);
    }

    public static long k(long j10, Object obj) {
        return f11981c.h(j10, obj);
    }

    public static Object l(long j10, Object obj) {
        return f11981c.i(j10, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(byte[] bArr, long j10, byte b10) {
        f11981c.l(bArr, f11984f + j10, b10);
    }

    public static void o(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int g10 = f11981c.g(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        q(obj, ((255 & b10) << i10) | (g10 & (~(255 << i10))), j11);
    }

    public static void p(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        q(obj, ((255 & b10) << i10) | (f11981c.g(j11, obj) & (~(255 << i10))), j11);
    }

    public static void q(Object obj, int i10, long j10) {
        f11981c.o(obj, i10, j10);
    }

    public static void r(Object obj, long j10, Object obj2) {
        f11981c.q(obj, j10, obj2);
    }
}
