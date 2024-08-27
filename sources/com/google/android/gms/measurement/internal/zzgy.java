package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgy extends zzgx {
    private boolean zza;

    public zzgy(zzge zzgeVar) {
        super(zzgeVar);
        this.zzt.zzD();
    }

    public void zzaC() {
    }

    public abstract boolean zzf();

    public final void zzv() {
        if (zzy()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
        if (!this.zza) {
            if (!zzf()) {
                this.zzt.zzB();
                this.zza = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzx() {
        if (!this.zza) {
            zzaC();
            this.zzt.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final boolean zzy() {
        return this.zza;
    }
}
