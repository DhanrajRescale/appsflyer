package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzga extends Thread {
    final /* synthetic */ zzgb zza;
    private final Object zzb;
    private final BlockingQueue zzc;
    private boolean zzd = false;

    public zzga(zzgb zzgbVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzgbVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzga zzgaVar;
        zzga zzgaVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            try {
                if (!this.zzd) {
                    semaphore = this.zza.zzi;
                    semaphore.release();
                    obj2 = this.zza.zzh;
                    obj2.notifyAll();
                    zzgb zzgbVar = this.zza;
                    zzgaVar = zzgbVar.zzb;
                    if (this == zzgaVar) {
                        zzgbVar.zzb = null;
                    } else {
                        zzgaVar2 = zzgbVar.zzc;
                        if (this == zzgaVar2) {
                            zzgbVar.zzc = null;
                        } else {
                            zzgbVar.zzt.zzaA().zzd().zza("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.zzd = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzt.zzaA().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i10;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                zzc(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfz zzfzVar = (zzfz) this.zzc.poll();
                if (zzfzVar != null) {
                    if (true != zzfzVar.zza) {
                        i10 = 10;
                    } else {
                        i10 = threadPriority;
                    }
                    Process.setThreadPriority(i10);
                    zzfzVar.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzgb.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e11) {
                                zzc(e11);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            zzb();
            throw th2;
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}
