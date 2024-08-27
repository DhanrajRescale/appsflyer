package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.recaptcha.internal.zzgi;
import com.google.android.recaptcha.internal.zzgo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jr.h;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzgo<MessageType extends zzgo<MessageType, BuilderType>, BuilderType extends zzgi<MessageType, BuilderType>> extends zzei<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzjg zzc = zzjg.zzc();

    public static void zzC(Class cls, zzgo zzgoVar) {
        zzgoVar.zzB();
        zzb.put(cls, zzgoVar);
    }

    public static final boolean zzE(zzgo zzgoVar, boolean z10) {
        zzgo zzgoVar2;
        byte byteValue = ((Byte) zzgoVar.zzh(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzih.zza().zzb(zzgoVar.getClass()).zzl(zzgoVar);
        if (z10) {
            if (true != zzl) {
                zzgoVar2 = null;
            } else {
                zzgoVar2 = zzgoVar;
            }
            zzgoVar.zzh(2, zzgoVar2, null);
        }
        return zzl;
    }

    private final int zzf(zzil zzilVar) {
        if (zzilVar == null) {
            return zzih.zza().zzb(getClass()).zza(this);
        }
        return zzilVar.zza(this);
    }

    private static zzgo zzg(zzgo zzgoVar) throws zzgy {
        if (zzgoVar != null && !zzgoVar.zzo()) {
            zzgy zza = new zzje(zzgoVar).zza();
            zza.zzh(zzgoVar);
            throw zza;
        }
        return zzgoVar;
    }

    private static zzgo zzi(zzgo zzgoVar, byte[] bArr, int i10, int i11, zzfz zzfzVar) throws zzgy {
        zzgo zzs = zzgoVar.zzs();
        try {
            zzil zzb2 = zzih.zza().zzb(zzs.getClass());
            zzb2.zzi(zzs, bArr, 0, i11, new zzem(zzfzVar));
            zzb2.zzf(zzs);
            return zzs;
        } catch (zzgy e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgy(e);
            }
            e.zzh(zzs);
            throw e;
        } catch (zzje e11) {
            zzgy zza = e11.zza();
            zza.zzh(zzs);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgy) {
                throw ((zzgy) e12.getCause());
            }
            zzgy zzgyVar = new zzgy(e12);
            zzgyVar.zzh(zzs);
            throw zzgyVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgy zzj = zzgy.zzj();
            zzj.zzh(zzs);
            throw zzj;
        }
    }

    public static zzgm zzq(zzhy zzhyVar, Object obj, zzhy zzhyVar2, zzgr zzgrVar, int i10, zzjv zzjvVar, Class cls) {
        return new zzgm(zzhyVar, HttpUrl.FRAGMENT_ENCODE_SET, null, new zzgl(null, i10, zzjvVar, false, false), cls);
    }

    public static zzgo zzr(Class cls) {
        Map map = zzb;
        zzgo zzgoVar = (zzgo) map.get(cls);
        if (zzgoVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgoVar = (zzgo) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzgoVar == null) {
            zzgoVar = (zzgo) ((zzgo) zzjp.zze(cls)).zzh(6, null, null);
            if (zzgoVar != null) {
                map.put(cls, zzgoVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgoVar;
    }

    public static zzgo zzt(zzgo zzgoVar, InputStream inputStream) throws zzgy {
        zzff zzfdVar;
        if (inputStream == null) {
            byte[] bArr = zzgw.zzd;
            int length = bArr.length;
            zzfdVar = zzff.zzH(bArr, 0, 0, false);
        } else {
            zzfdVar = new zzfd(inputStream, 4096, null);
        }
        zzfz zzfzVar = zzfz.zza;
        zzgo zzs = zzgoVar.zzs();
        try {
            zzil zzb2 = zzih.zza().zzb(zzs.getClass());
            zzb2.zzh(zzs, zzfg.zzq(zzfdVar), zzfzVar);
            zzb2.zzf(zzs);
            zzg(zzs);
            return zzs;
        } catch (zzgy e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzgy(e);
            }
            e.zzh(zzs);
            throw e;
        } catch (zzje e11) {
            zzgy zza = e11.zza();
            zza.zzh(zzs);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgy) {
                throw ((zzgy) e12.getCause());
            }
            zzgy zzgyVar = new zzgy(e12);
            zzgyVar.zzh(zzs);
            throw zzgyVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgy) {
                throw ((zzgy) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzgo zzu(zzgo zzgoVar, byte[] bArr) throws zzgy {
        zzgo zzi = zzi(zzgoVar, bArr, 0, bArr.length, zzfz.zza);
        zzg(zzi);
        return zzi;
    }

    public static zzgt zzv() {
        return zzgp.zzf();
    }

    public static zzgv zzw() {
        return zzii.zze();
    }

    public static zzgv zzx(zzgv zzgvVar) {
        int i10;
        int size = zzgvVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgvVar.zzd(i10);
    }

    public static Object zzy(Method method, Object obj, Object... objArr) {
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

    public static Object zzz(zzhy zzhyVar, String str, Object[] objArr) {
        return new zzij(zzhyVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzih.zza().zzb(getClass()).zzk(this, (zzgo) obj);
    }

    public final int hashCode() {
        if (!zzF()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int zzm = zzm();
                this.zza = zzm;
                return zzm;
            }
            return i10;
        }
        return zzm();
    }

    public final String toString() {
        return zzia.zza(this, super.toString());
    }

    public final void zzA() {
        zzih.zza().zzb(getClass()).zzf(this);
        zzB();
    }

    public final void zzB() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void zzD(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final boolean zzF() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final /* synthetic */ zzhx zzV() {
        return (zzgi) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final /* synthetic */ zzhx zzW() {
        zzgi zzgiVar = (zzgi) zzh(5, null, null);
        zzgiVar.zzg(this);
        return zzgiVar;
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final /* synthetic */ zzhy zzX() {
        return (zzgo) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzei
    public final int zza(zzil zzilVar) {
        if (zzF()) {
            int zzf = zzf(zzilVar);
            if (zzf >= 0) {
                return zzf;
            }
            throw new IllegalStateException(h.n("serialized size must be non-negative, was ", zzf));
        }
        int i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zzf2 = zzf(zzilVar);
        if (zzf2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zzf2;
            return zzf2;
        }
        throw new IllegalStateException(h.n("serialized size must be non-negative, was ", zzf2));
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final void zze(zzfk zzfkVar) throws IOException {
        zzih.zza().zzb(getClass()).zzj(this, zzfl.zza(zzfkVar));
    }

    public abstract Object zzh(int i10, Object obj, Object obj2);

    public final int zzm() {
        return zzih.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzhy
    public final int zzn() {
        int i10;
        if (zzF()) {
            i10 = zzf(null);
            if (i10 < 0) {
                throw new IllegalStateException(h.n("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zzf(null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException(h.n("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final boolean zzo() {
        return zzE(this, true);
    }

    public final zzgi zzp() {
        return (zzgi) zzh(5, null, null);
    }

    public final zzgo zzs() {
        return (zzgo) zzh(4, null, null);
    }
}
