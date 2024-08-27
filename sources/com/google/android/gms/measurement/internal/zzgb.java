package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzgb extends zzgy {
    private static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);
    private zzga zzb;
    private zzga zzc;
    private final PriorityBlockingQueue zzd;
    private final BlockingQueue zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    public zzgb(zzge zzgeVar) {
        super(zzgeVar);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzfy(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzfy(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean zzr(zzgb zzgbVar) {
        boolean z10 = zzgbVar.zzj;
        return false;
    }

    private final void zzt(zzfz zzfzVar) {
        synchronized (this.zzh) {
            try {
                this.zzd.add(zzfzVar);
                zzga zzgaVar = this.zzb;
                if (zzgaVar == null) {
                    zzga zzgaVar2 = new zzga(this, "Measurement Worker", this.zzd);
                    this.zzb = zzgaVar2;
                    zzgaVar2.setUncaughtExceptionHandler(this.zzf);
                    this.zzb.start();
                } else {
                    zzgaVar.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final void zzaz() {
        if (Thread.currentThread() == this.zzc) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object zzd(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.zzt.zzaB().zzp(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                this.zzt.zzaA().zzk().zza("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.zzt.zzaA().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    public final void zzg() {
        if (Thread.currentThread() == this.zzb) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(callable);
        zzfz zzfzVar = new zzfz(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                a.v(this.zzt, "Callable skipped the worker queue.");
            }
            zzfzVar.run();
        } else {
            zzt(zzfzVar);
        }
        return zzfzVar;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(callable);
        zzfz zzfzVar = new zzfz(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            zzfzVar.run();
        } else {
            zzt(zzfzVar);
        }
        return zzfzVar;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzfz zzfzVar = new zzfz(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            try {
                this.zze.add(zzfzVar);
                zzga zzgaVar = this.zzc;
                if (zzgaVar == null) {
                    zzga zzgaVar2 = new zzga(this, "Measurement Network", this.zze);
                    this.zzc = zzgaVar2;
                    zzgaVar2.setUncaughtExceptionHandler(this.zzg);
                    this.zzc.start();
                } else {
                    zzgaVar.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzt(new zzfz(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzt(new zzfz(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        if (Thread.currentThread() == this.zzb) {
            return true;
        }
        return false;
    }
}
