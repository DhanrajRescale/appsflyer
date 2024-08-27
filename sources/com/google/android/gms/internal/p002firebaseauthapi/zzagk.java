package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.p002firebaseauthapi.zzagg;
import com.google.android.gms.internal.p002firebaseauthapi.zzagk;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jr.h;

/* loaded from: classes2.dex */
public abstract class zzagk<MessageType extends zzagk<MessageType, BuilderType>, BuilderType extends zzagg<MessageType, BuilderType>> extends zzaep<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzaiw zzc = zzaiw.zzc();

    public static zzagp zzA() {
        return zzahy.zze();
    }

    public static zzagp zzB(zzagp zzagpVar) {
        int i10;
        int size = zzagpVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzagpVar.zzd(i10);
    }

    public static Object zzD(Method method, Object obj, Object... objArr) {
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

    public static Object zzE(zzahp zzahpVar, String str, Object[] objArr) {
        return new zzahz(zzahpVar, str, objArr);
    }

    public static void zzH(Class cls, zzagk zzagkVar) {
        zzagkVar.zzG();
        zzb.put(cls, zzagkVar);
    }

    private final int zza(zzaib zzaibVar) {
        if (zzaibVar == null) {
            return zzahx.zza().zzb(getClass()).zza(this);
        }
        return zzaibVar.zza(this);
    }

    private static zzagk zzb(zzagk zzagkVar) throws zzags {
        if (zzagkVar != null && !zzagkVar.zzK()) {
            zzags zza = new zzaiu(zzagkVar).zza();
            zza.zzh(zzagkVar);
            throw zza;
        }
        return zzagkVar;
    }

    private static zzagk zzc(zzagk zzagkVar, byte[] bArr, int i10, int i11, zzafx zzafxVar) throws zzags {
        zzagk zzw = zzagkVar.zzw();
        try {
            zzaib zzb2 = zzahx.zza().zzb(zzw.getClass());
            zzb2.zzi(zzw, bArr, 0, i11, new zzaes(zzafxVar));
            zzb2.zzf(zzw);
            return zzw;
        } catch (zzags e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzags(e);
            }
            e.zzh(zzw);
            throw e;
        } catch (zzaiu e11) {
            zzags zza = e11.zza();
            zza.zzh(zzw);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzags) {
                throw ((zzags) e12.getCause());
            }
            zzags zzagsVar = new zzags(e12);
            zzagsVar.zzh(zzw);
            throw zzagsVar;
        } catch (IndexOutOfBoundsException unused) {
            zzags zzj = zzags.zzj();
            zzj.zzh(zzw);
            throw zzj;
        }
    }

    public static zzagk zzv(Class cls) {
        Map map = zzb;
        zzagk zzagkVar = (zzagk) map.get(cls);
        if (zzagkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzagkVar = (zzagk) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzagkVar == null) {
            zzagkVar = (zzagk) ((zzagk) zzajf.zze(cls)).zzj(6, null, null);
            if (zzagkVar != null) {
                map.put(cls, zzagkVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzagkVar;
    }

    public static zzagk zzx(zzagk zzagkVar, zzaff zzaffVar, zzafx zzafxVar) throws zzags {
        zzafl zzh = zzaffVar.zzh();
        zzagk zzw = zzagkVar.zzw();
        try {
            zzaib zzb2 = zzahx.zza().zzb(zzw.getClass());
            zzb2.zzh(zzw, zzafm.zzq(zzh), zzafxVar);
            zzb2.zzf(zzw);
            try {
                zzh.zzz(0);
                zzb(zzw);
                return zzw;
            } catch (zzags e10) {
                e10.zzh(zzw);
                throw e10;
            }
        } catch (zzags e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzags(e);
            }
            e.zzh(zzw);
            throw e;
        } catch (zzaiu e12) {
            zzags zza = e12.zza();
            zza.zzh(zzw);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzags) {
                throw ((zzags) e13.getCause());
            }
            zzags zzagsVar = new zzags(e13);
            zzagsVar.zzh(zzw);
            throw zzagsVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzags) {
                throw ((zzags) e14.getCause());
            }
            throw e14;
        }
    }

    public static zzagk zzy(zzagk zzagkVar, InputStream inputStream, zzafx zzafxVar) throws zzags {
        zzafj zzafjVar = new zzafj(inputStream, 4096, null);
        zzagk zzw = zzagkVar.zzw();
        try {
            zzaib zzb2 = zzahx.zza().zzb(zzw.getClass());
            zzb2.zzh(zzw, zzafm.zzq(zzafjVar), zzafxVar);
            zzb2.zzf(zzw);
            zzb(zzw);
            return zzw;
        } catch (zzags e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzags(e);
            }
            e.zzh(zzw);
            throw e;
        } catch (zzaiu e11) {
            zzags zza = e11.zza();
            zza.zzh(zzw);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzags) {
                throw ((zzags) e12.getCause());
            }
            zzags zzagsVar = new zzags(e12);
            zzagsVar.zzh(zzw);
            throw zzagsVar;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzags) {
                throw ((zzags) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzagk zzz(zzagk zzagkVar, byte[] bArr, zzafx zzafxVar) throws zzags {
        zzagk zzc = zzc(zzagkVar, bArr, 0, bArr.length, zzafxVar);
        zzb(zzc);
        return zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzahx.zza().zzb(getClass()).zzj(this, (zzagk) obj);
    }

    public final int hashCode() {
        if (!zzL()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int zzr = zzr();
                this.zza = zzr;
                return zzr;
            }
            return i10;
        }
        return zzr();
    }

    public final String toString() {
        return zzahr.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahp
    public final /* synthetic */ zzaho zzC() {
        return (zzagg) zzj(5, null, null);
    }

    public final void zzF() {
        zzahx.zza().zzb(getClass()).zzf(this);
        zzG();
    }

    public final void zzG() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void zzI(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahp
    public final void zzJ(zzafs zzafsVar) throws IOException {
        zzahx.zza().zzb(getClass()).zzm(this, zzaft.zza(zzafsVar));
    }

    public final boolean zzK() {
        zzagk<MessageType, BuilderType> zzagkVar;
        byte byteValue = ((Byte) zzj(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzahx.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzagkVar = null;
        } else {
            zzagkVar = this;
        }
        zzj(2, zzagkVar, null);
        return zzk;
    }

    public final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahq
    public final /* synthetic */ zzahp zzM() {
        return (zzagk) zzj(6, null, null);
    }

    public abstract Object zzj(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaep
    public final int zzn(zzaib zzaibVar) {
        if (zzL()) {
            int zza = zza(zzaibVar);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(h.n("serialized size must be non-negative, was ", zza));
        }
        int i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zza(zzaibVar);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException(h.n("serialized size must be non-negative, was ", zza2));
    }

    public final int zzr() {
        return zzahx.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahp
    public final int zzs() {
        int i10;
        if (zzL()) {
            i10 = zza(null);
            if (i10 < 0) {
                throw new IllegalStateException(h.n("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zza(null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException(h.n("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    public final zzagg zzt() {
        return (zzagg) zzj(5, null, null);
    }

    public final zzagg zzu() {
        zzagg zzaggVar = (zzagg) zzj(5, null, null);
        zzaggVar.zzh(this);
        return zzaggVar;
    }

    public final zzagk zzw() {
        return (zzagk) zzj(4, null, null);
    }
}
