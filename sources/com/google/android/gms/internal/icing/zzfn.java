package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import nn.d;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzfn {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzfm zzg;
    private static final boolean zzh;
    private static final boolean zzi;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    static {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzfn.<clinit>():void");
    }

    private zzfn() {
    }

    private static int zzA(Class<?> cls) {
        if (zzi) {
            return zzg.zzj(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i10 = zzbu.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC == null) {
            Field zzC2 = zzC(Buffer.class, "address");
            if (zzC2 != null && zzC2.getType() == Long.TYPE) {
                return zzC2;
            }
            return null;
        }
        return zzC;
    }

    private static Field zzC(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        zzfm zzfmVar = zzg;
        int zzk = zzfmVar.zzk(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        zzfmVar.zzl(obj, j11, ((255 & b10) << i10) | (zzk & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        zzfm zzfmVar = zzg;
        int i10 = (((int) j10) & 3) << 3;
        zzfmVar.zzl(obj, j11, ((255 & b10) << i10) | (zzfmVar.zzk(obj, j11) & (~(255 << i10))));
    }

    public static boolean zza() {
        return zzi;
    }

    public static boolean zzb() {
        return zzh;
    }

    public static <T> T zzc(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int zzd(Object obj, long j10) {
        return zzg.zzk(obj, j10);
    }

    public static void zze(Object obj, long j10, int i10) {
        zzg.zzl(obj, j10, i10);
    }

    public static long zzf(Object obj, long j10) {
        return zzg.zzm(obj, j10);
    }

    public static void zzg(Object obj, long j10, long j11) {
        zzg.zzn(obj, j10, j11);
    }

    public static boolean zzh(Object obj, long j10) {
        return zzg.zzb(obj, j10);
    }

    public static void zzi(Object obj, long j10, boolean z10) {
        zzg.zzc(obj, j10, z10);
    }

    public static float zzj(Object obj, long j10) {
        return zzg.zzd(obj, j10);
    }

    public static void zzk(Object obj, long j10, float f10) {
        zzg.zze(obj, j10, f10);
    }

    public static double zzl(Object obj, long j10) {
        return zzg.zzf(obj, j10);
    }

    public static void zzm(Object obj, long j10, double d10) {
        zzg.zzg(obj, j10, d10);
    }

    public static Object zzn(Object obj, long j10) {
        return zzg.zzo(obj, j10);
    }

    public static void zzo(Object obj, long j10, Object obj2) {
        zzg.zzp(obj, j10, obj2);
    }

    public static void zzp(byte[] bArr, long j10, byte b10) {
        zzg.zza(bArr, zza + j10, b10);
    }

    public static Unsafe zzq() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzfj());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzr(Class<?> cls) {
        int i10 = zzbu.zza;
        try {
            Class<?> cls2 = zzd;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static /* synthetic */ void zzs(Throwable th2) {
        Logger logger = Logger.getLogger(zzfn.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th2);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", d.o(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    public static /* synthetic */ boolean zzv(Object obj, long j10) {
        if (((byte) ((zzg.zzk(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean zzw(Object obj, long j10) {
        if (((byte) ((zzg.zzk(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    private static int zzz(Class<?> cls) {
        if (zzi) {
            return zzg.zzi(cls);
        }
        return -1;
    }
}
