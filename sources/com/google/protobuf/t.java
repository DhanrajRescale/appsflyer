package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class t extends b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected i1 unknownFields;

    public t() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = i1.f11923f;
    }

    public static t n(Class cls) {
        t tVar = defaultInstanceMap.get(cls);
        if (tVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                tVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (tVar == null) {
            tVar = (t) ((t) r1.b(cls)).m(6);
            if (tVar != null) {
                defaultInstanceMap.put(cls, tVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return tVar;
    }

    public static Object o(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean p(t tVar, boolean z10) {
        byte byteValue = ((Byte) tVar.m(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        w0 w0Var = w0.f11993c;
        w0Var.getClass();
        boolean c10 = w0Var.a(tVar.getClass()).c(tVar);
        if (z10) {
            tVar.m(2);
        }
        return c10;
    }

    public static y s(y yVar) {
        int i10;
        int size = yVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return yVar.f(i10);
    }

    public static void t(Class cls, t tVar) {
        tVar.r();
        defaultInstanceMap.put(cls, tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w0 w0Var = w0.f11993c;
        w0Var.getClass();
        return w0Var.a(getClass()).e(this, (t) obj);
    }

    @Override // com.google.protobuf.b
    public final int h(z0 z0Var) {
        int f10;
        int f11;
        if (q()) {
            if (z0Var == null) {
                w0 w0Var = w0.f11993c;
                w0Var.getClass();
                f11 = w0Var.a(getClass()).f(this);
            } else {
                f11 = z0Var.f(this);
            }
            if (f11 >= 0) {
                return f11;
            }
            throw new IllegalStateException(jr.h.n("serialized size must be non-negative, was ", f11));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (z0Var == null) {
            w0 w0Var2 = w0.f11993c;
            w0Var2.getClass();
            f10 = w0Var2.a(getClass()).f(this);
        } else {
            f10 = z0Var.f(this);
        }
        u(f10);
        return f10;
    }

    public final int hashCode() {
        if (q()) {
            w0 w0Var = w0.f11993c;
            w0Var.getClass();
            return w0Var.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            w0 w0Var2 = w0.f11993c;
            w0Var2.getClass();
            this.memoizedHashCode = w0Var2.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.b
    public final void i(j jVar) {
        w0 w0Var = w0.f11993c;
        w0Var.getClass();
        z0 a10 = w0Var.a(getClass());
        ek.h0 h0Var = jVar.f11931c;
        if (h0Var == null) {
            h0Var = new ek.h0(jVar);
        }
        a10.d(this, h0Var);
    }

    public final void j() {
        this.memoizedHashCode = 0;
    }

    public final void k() {
        u(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final r l() {
        return (r) m(5);
    }

    public abstract Object m(int i10);

    public final boolean q() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void r() {
        this.memoizedSerializedSize &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = p0.f11959a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        p0.c(this, sb2, 0);
        return sb2.toString();
    }

    public final void u(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(jr.h.n("serialized size must be non-negative, was ", i10));
    }
}
