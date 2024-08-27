package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class zzbd implements InvocationHandler {
    private final Object zza;

    public zzbd(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    @NotNull
    public final Object invoke(@NotNull Object obj, @NotNull Method method, Object[] objArr) {
        Object obj2;
        if (Intrinsics.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (Intrinsics.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (Intrinsics.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (objArr != null && objArr.length != 0 && objArr[0].hashCode() == obj.hashCode()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        if (!zza(obj, method, objArr)) {
            return Unit.f23355a;
        }
        if ((this.zza == null && Intrinsics.a(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && Intrinsics.a(zzeg.zza(obj2.getClass()), zzeg.zza(method.getReturnType())))) {
            Object obj3 = this.zza;
            if (obj3 == null) {
                return Unit.f23355a;
            }
            return obj3;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(@NotNull Object obj, @NotNull Method method, Object[] objArr);
}
